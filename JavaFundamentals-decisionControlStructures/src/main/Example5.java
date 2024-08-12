package main;

public class Example5 {
    public static void main(String[] args) {
        // switch

        // required: 'char, byte, short, int, Character, Byte, Short, Integer, String, or an enum'
        // int, char, String, enum

        int x = 15;

        switch (x) {
            default:
                System.out.println("Invalid option!");
                break;
            case 10:
                System.out.println("decimal");
                break;
            case 0xF,12:
                System.out.println("hex");
                System.out.println("A");
                break;
            case 3:
                System.out.println("B");
        }


    }
}
