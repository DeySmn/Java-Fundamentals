package main;

public class Example4 {
    public static void main(String[] args) {
        Bottle b1 = new Bottle();
        Bottle b2 = new Bottle(10);
        System.out.println(b1.volume);
        System.out.println(b2.volume);
    }
}
