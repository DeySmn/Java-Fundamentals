package main;

public class Example1 {

    public static void main(String[] args) {
        final var constantValue = 10; // with 'var' keyword it's mandatory to declare and initialise value at the same time.
        final int x;
        x = 10;

        // x = 20; // Variable 'x' might already have been assigned to [Compile-Time error]
    }

    void m(final int x) {
        // here
//        x = 10; // Cannot assign a value to final variable 'x' [Compile-Time error]
        // value 10
    }
}
