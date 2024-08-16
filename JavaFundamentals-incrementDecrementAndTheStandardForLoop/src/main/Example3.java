package main;

public class Example3 {
    public static void main(String[] args) {
        exp1();
    }
    static void exp1() {
        int x = 10;
        int y = 20;

        int z = x++ + ++y; // 10 + 21

        System.out.println("""
                %d, \
                %d, and \
                %d.\
                """.formatted(x,y,z)); // 11, 21, and 31.
    }
}
