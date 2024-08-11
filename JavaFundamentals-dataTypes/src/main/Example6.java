package main;

public class Example6 {
    public static void main(String[] args) {
        Car c1;
        c1 = new Car();
        Car c2 = new Car();
        System.out.println(c1.hashCode());
        System.out.println(c2);
        System.out.println(c2.toString());
    }
}
class Car {
    String name;
    int id;
}