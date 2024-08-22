package main.d2;

public class Example2 {
    public static void main(String[] args) {
         final int[]x = new int[]{10,2};
//         x = new int[3]; // Cannot assign a value to final variable 'x' [ Compile-time error ]
         x[0]=1;
         x[0]=2;
         x[1]=3;
//         for(int i: x) System.out.println(i);
         int[][] y = new int[2][];
//         y[0] = {1}; // [ Compile-time error ]
         y[0] = new int[] {1};
         y[1] = x;
         y[1][0]=5;
         for(int i=0; i<y.length; i++) {
             for (int j=0; j<y[i].length; j++) {
                 System.out.print(y[i][j]+(j==y[i].length-1?".\n":", "));
             }
         }
         for(int[] v: y) {
             for(int value: v) {
                 System.out.print(value+", ");
             }
             System.out.println();
         }

         int[][] z1 = { {1,2,3}, {2,5}, {1} }; // 2D Array example
         int[][][] z2 = { {{1,2},{4}}, {{10}}, {{4},{5}}}; // 3D Array example

    }
}
// From the definition, inside the array we will always have variables, and we can't make them final.
// Only reference of the array can be declared as final and can't be re-initialized/re-assigned.
