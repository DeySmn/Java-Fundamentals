package controlcharacters;

public class Example1 {
    public static void main(String... args) {
        m1();
//        m2();
//        m3();
    }

    static void m3() {
        // no compile time error happens only with these 3 control characters unicodes
        System.out.print("abcdefghi"); \u000d \u000a \u000c System.out.println("abcdi");
        /*
        O/p:
        abcdefghiabcdi
         */
    }
    static void m2() {
        System.out.println("Standard \r \nFor Loop");
        /*
        O/p:

        For Loop
         */
    }

    static void m1() {
        // System.out.println("Standard \rFor"); // For Loop
        char newLine = 0xA; // hex
        char copyWrite = '\u00A9'; // © unicode
        // `\`== \u005c [escape character]
        // `n` == \u006e
        // `\n` == \u005c\u006e [UTF-8]
        String st = "Standard \r\u005c\u006eFor Loop"; // <==> "Standard \r\n For Loop"
        System.out.println(st);
        \u000a System.out.println();
        System.out.println("Standard \r\fFor Loop");
        /*
        O/p:
        Standard
        For Loop

        For Loop
        */

    }
}
/*
In short:
1. Carriage return (\r or 0xD): To take control at starting on the same line.
2. Line feed (\n or 0xA): To Take control at starting on the next line.
3. Form feed (\f or 0xC): To take control at starting on the next page
 */

