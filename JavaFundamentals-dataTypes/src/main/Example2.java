package main;

public class Example2 {
    public static void main(String[] args) {
    // By default, integral numbers in JAVA are int and decimal point numbers are double in JAVA
        // float - Float - 32 bits - [-2^31 to 2^31-1]
        // double - Double - 64 bits [-2^63 to 2^63-1]
        double d1 = 10.5;
        System.out.println(d1);

        float f1 = (float) d1;
        System.out.println(f1);

        float f2 = 20.04F;
        System.out.println(f2);

        double d2 = 2147483648D;
        System.out.println(d2);

        float f3 = (float) d2; // down-casting loose of info
        System.out.println(f3);

    }
}
