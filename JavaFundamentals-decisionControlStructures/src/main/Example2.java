package main;

public class Example2 {
    public static void main(String[] args) {
        // if-else

        boolean condition = false;

        if (condition) {
            System.out.println("It's true"); // will not execute as condition is false
        }

        if (condition); {
            System.out.println("It's "+condition); // will execute as this block of code is not associated with any condition check
        }

        if (condition)
            System.out.println("It's true");
            System.out.println("Not inside if block");


    }
}
