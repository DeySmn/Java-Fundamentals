package main;

public class Example4 {
    public static void main(String[] args) {
        // if-else
        int x = 50;
        int y = 20;
        int z = 30;

        if (x<y)
            if(y<z)
                System.out.println("A");
            else
                System.out.println("B");

        /*
        O/p:
        Nothing will be printed, as parent if block condition fails, and
        we don't have any else block is associated with parent if block.
         */

    }
}
