package main;

public class Example1 {
    public static void main(String[] args) {

        /*
        primitives - numbers, characters, boolean (true / false)
        references - object
         */
    // By default, integral numbers in JAVA are int and decimal point numbers are double in JAVA
        // byte - Byte - 8 bits, 2^8 = 256 [-128, 127]
        byte b1; // signature: dataType identifier;
        /*
        In case of local variables,
        before initialization if we try to use any identifier we will get compile-time error in Java.
         */
        // System.out.println(b1); // compile-time error, as we are trying to use local variable b1 before initialization.
        b1 = 10;

        byte b2 = 10;

        // short - Short - 16 bits [ -2^15 to 2^15-1]
        short s1 = 017; // Octal [ 7 + 1*8 ] = 15
        System.out.println(s1);

        // int - Integer - 32 bits
        // signed range [-2^31 to 2^31-1] = [-2147483648 to 2147483647 ]
        int signedInt1 = 2147483647;
        System.out.println(signedInt1);
        System.out.println(signedInt1 == Integer.MAX_VALUE);
        Integer signedInt2 = Integer.parseUnsignedInt("2147483648");
        System.out.println(signedInt2); // -2147483648
        int i1 = 0x12e; // ( 16*16 + 2*16 + 14 ) = 302
        i1 = 0XaB1eE; // ( 14*1 + 14*16 + 1*16*16 + 11*16*16*16 + 10*16*16*16*16 ) = 700910
        System.out.println(i1);

        // long - Long - 64 bits [ -2^63 to 2^63-1 ]
        long l1 = 105;
        System.out.println(l1);

        long l2 = 2147483648L;
        System.out.println(l2);

        long l3 = 12l;
        System.out.println(l3);
    }
}
