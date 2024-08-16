package main;

public class Example2 {
    public static void main(String[] args) {
        // ++ --

        exp1(); exp2();
    }
    static void exp1() {
        int x = 10;
        int y = 20;

        int z = x++ + 5; // 10 + 5

        System.out.println("""
                %d, \
                %d, and \
                %d.\
                """.formatted(x,y,z)); // 11, 20, and 15.
    }
    static void exp2() {
        int x = 10;
        int y = 20;

        int z = ++x + 5; // 11 + 5

        System.out.println("""
                %d, \
                %d, and \
                %d.\
                """.formatted(x,y,z)); // 11, 20, and 16.
    }
}
