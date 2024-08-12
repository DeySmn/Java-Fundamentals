package main;

public class Example3 {
    public static void main(String[] args) {
        // if-else
        int x = 10;
        int y = 20;

        if (x<y)
            System.out.println("%s is smaller than %s".formatted(x,y));
        else if (x==y)
            System.out.println("both the values are same");
        else
            System.out.println(String.format("%s is larger than %s", x, y));
    }
}
