package main.d1;

public class Example1 {
    public static void main(String[] args) {
//        int n = 5;
//        int[] x = new int[n];
        /**
         *  | 8 | 9 | 7 | 1 | 2 |
         *    0   1   2   3   4
         *
         *  lastIndex = x.length - 1;
         */
        int[] x;
        x = new int[5];
        x[0] = 8;
        x[1] = 9;
        x[2] = 7;
        x[3] = 1;
        x[4] = 2;
        // ===> ArrayIndexOutOfBoundsException

        for(var i=0; i<x.length; i++) {
//            System.out.print(x[i]+(i==x.length-1?".\n":", "));
            System.out.println("x[%d]".formatted(i)+" => "+x[i]);
        }
    }

}
