package main;

public class Example4 {
    public static void main(String[] args) {
        m3();
    }
    static void m3() {
        var x = 10;

        for(;;) {
            System.out.println(x);
            x--;
            if(x==0) {
                break;
            }
        }
    }
    static void m2() {
        var x = 10;
        for(;x>=1;){
            System.out.println(x);
            x--;
        }
    }
    static void m1() {
        var x = 10;
        for(;x>=1;x--){
            System.out.println(x);
        }
    }
    static void m0() {
        for(var x=10;x>=1;x--){
            System.out.println(x);
        }
    }
}
