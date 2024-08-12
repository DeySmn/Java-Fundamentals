package main;

public class Example1 {
    public static void main(String[] args) {
        // ternary or elvish operator
        int res1 = (20 < 40) ? (20+40) : (40-20);
        System.out.println(res1); // 60

        int res2 = 60<40 ? 20>10 ? 20:10 : 6>5 ? 6:5;
        System.out.println(res2); // 6
    }
}
