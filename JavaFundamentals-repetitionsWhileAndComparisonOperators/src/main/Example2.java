package main;

import java.util.Arrays;
import java.util.Random;

public class Example2 {
    public static void main(String[] args) {
        Cat c1 = new Cat("Tom", 10);
        Cat c2 = new Cat("Tom", 10);
        // ==, !=
        boolean b1 = c1 == c2; // false
        boolean b2 = c1 != c2; // true;

        System.out.println(b1);
        System.out.println(b2);

        System.out.println(c1 == c2); // false
        System.out.println(c1 != c2); // true
        System.out.println(c1.equals(c2)); // false

        Shape shape1 = Shape.CIRCLE;
        Shape shape2 = Shape.SQUARE;
        Shape shape3 = Shape.SQUARE;
        System.out.println(shape3.getShapeId()); // 2
        shape3.generateNewId();
        System.out.println(shape3.getShapeId()); // 9
        System.out.println(Arrays.stream(Shape.values()).toList() );
        System.out.println(shape2 == shape3); // true
    }
}

class Cat {
    String name;
    int age;

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

enum Shape {
    CIRCLE(1) {
        @Override
        double getArea(double dimension) {
            return Math.PI * dimension * dimension;
        }
    },
    SQUARE {
        @Override
        double getArea(double dimension) {
            return dimension * dimension;
        }
    };
    private int shapeId;
    Shape() {
        this.shapeId = 2;
    }
    Shape(int shapeId) {
        this.shapeId = shapeId;
    }
    public void generateNewId() {
        this.shapeId = Shape.getUniqueId();
    }
    public int getShapeId() {
        return shapeId;
    }
    private static int getUniqueId() {
        boolean fl;
        var shapeId = new Random().nextInt(1, 10);
        do {
            fl = false;
            shapeId = new Random().nextInt(1, 10);
            for (var id : values()) {
                if (id.shapeId == shapeId) {
                   fl = true;
                }
            }
        }while(fl);
        return shapeId;
    }

    public static Shape getShapeById(int id) {
        return Arrays.stream(values()).filter(shape -> shape.shapeId == id).findFirst().orElseThrow(() -> new RuntimeException("Invalid id"));
    }
    abstract double getArea(double dimension);
}