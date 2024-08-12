package main;

public class Example6 {
    public static void main(String[] args) {
        // switch statment and switch expressions
        // since [12]
        int x = 90;
        switch (x) {
            case 10,30,40 -> System.out.println(":)");
            case 80 -> System.out.println(":(");
            case 90 -> {
                System.out.print("A");
                System.out.println("B");
            }
            case 100 -> System.out.println("xP");

        }
        x = 10;
        int y = switch (x) {
            case 10 -> 100;
            case 11,12 -> 200;
            default -> {
                System.out.println("Default Value!");
                yield 300;
            }
            case 13 -> 150;
        };
        System.out.println(y);

        /*
        O/p:
        AB
        100
        */
    }
}
