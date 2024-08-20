package main;

public class Foo {
    int x; // instance variable
    static int y; // static or class level variable
    final static int z1 = 10;
    final static int z2;
    static {
        z2 = 2;
    }

    final int w;
    {
        w = 50;
    }

}
