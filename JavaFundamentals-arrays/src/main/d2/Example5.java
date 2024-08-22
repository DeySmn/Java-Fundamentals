package main.d2;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example5 {
    public static void main(String[] args) {
        // { null, null, null }
        // int [][] x = { null, null, null }
        int [][] x = new int[3][];
        print1dArray(x);

        x[0] = new int[] {1};
        x[1] = new int[] {2,3,4};
        x[2] = new int[] {10};

        // { {1}, {2, 3, 4}, {10} }
    }
    private static void print1dArray(int[][] x) {
        String res = IntStream.range(0,x.length)
                .mapToObj(i -> i+": "+x[i])
                .collect(Collectors.joining(", "));
        System.out.println(res);
        System.out.println(IntStream.range(0, x.length)
                .mapToObj(i -> i + ": " + x[i]).collect(Collectors.toList()));
    }
}
