package main.d2;

public class Example1 {
    public static void main(String[] args) {
        var x = new int[] {1,2,3,4,5};

        for (int i = 0; i <x.length; i++) {
            x[i] += 10;
        }

        for(int v: x) {
            v = 20;
        }

        for (final int v: x) {
            System.out.println(v);
        }
    }
}

/*
Key points to remember:
1. We may get into infinite loop with standard for loop but with enhanced for loop that's not possible
2. We we try to update value of collection in standard for loop we can do it easily but in enhanced for loop it only updates
a local variable not the actual reference so actual collection will remain same.
 */
