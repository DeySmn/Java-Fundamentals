package main.d1;

public class Example2 {
    public static void main(String[] args) {
        int[] x;
        x = new int[5];
//        x = {}; // Array initializer is not allowed here [compile-time error]

        int [] y1 = {}; // length 0
        int [] y2 = {2,8,7,9,4}; // length 5

        int [] w1;
        w1 = new int[] {2,8,7}; // length 3
//        w1 = new int[2] {2,3}; // [compile-time error]

        var q1 = new int[10];
//        var q2 = {}; // [compile-time error]
//        var q3 = {1,2,3}; // [compile-time error]
        var q4 = new int[] {1, 2, 3, 4}; // length 4

        m();
        m(2);
        m(q4);
        m(new int[2]);
        m(new int[] {1,2});
//        m({1,2,3}); // Array initializer is not allowed here [compile-time error]
    }

    private static void m(int... x) {
        for (int i=0; i<x.length; i++) {
            System.out.println(x[i]);
        }
    }
}
