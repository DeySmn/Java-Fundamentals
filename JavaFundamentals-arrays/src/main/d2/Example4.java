package main.d2;

public class Example4 {
    public static void main(String[] args) {
        int [][] a = { {14}, {13,12}, {1} };

        for(int [] x : a) {
            System.out.print("""
                    len: %d =>\s""".formatted(x.length));
            for(int v: x) {
                System.out.print(v+", ");
            }
            System.out.println();
        }
    }
}
