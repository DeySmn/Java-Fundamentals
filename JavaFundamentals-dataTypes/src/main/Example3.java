package main;

public class Example3 {
    public static void main(String[] args) {
        char c1, c2, c3; // 16-bits
        c1 = 'a';
        c2 = '\n'; // \b \t
        c3 = '\u0065'; // UTF (unicode) 0065 - e
        System.out.print(c1);
        System.out.print(c2);
        System.out.println(c1);
        System.out.println(c3);

        int i1 = c1;
        System.out.println(i1);
    }
}
