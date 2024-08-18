package main;

public class Example5 {
    public static void main(String[] args) {

        for (int x=0, y=10; x<y; x++, y-=1) {
            System.out.println(x + y);
        }
// 'var' is not allowed in a compound declaration. So, below code will not compile
//        for (var x=0, y=10; x<y; x++, y--) {
//            System.out.println(x + y);
//        }

    }
}
