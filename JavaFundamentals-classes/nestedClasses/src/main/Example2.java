package main;

class  ShadowTest {
    private int x = 1;

    class FirstLevel {
        private int x = 2;

        void methodFirstLevel(int x) {
            System.out.println("x= "+x); // local variable
            System.out.println("this.x= "+this.x); // member variable of the inner class FirstLevel
            ShadowTest.this.x = 10;
            System.out.println("ShadowTest.this.x= "+ShadowTest.this.x); // Refer to member variables that enclose larger scopes by the class name to which they belong
        }

        void checkObjInstances() {
            System.out.println(this);
            System.out.println(FirstLevel.this);
            System.out.println(ShadowTest.FirstLevel.this);
            System.out.println(this == FirstLevel.this);
            System.out.println(ShadowTest.FirstLevel.this == this);
            FirstLevel firstLevel = new FirstLevel();
            System.out.println(firstLevel);
            System.out.println(ShadowTest.this);
            ShadowTest shadowTest = new ShadowTest();
            System.out.println(shadowTest);
        }
    }
}

public class Example2 {
    public static void main(String[] args) {
        // Shadowing
        ShadowTest.FirstLevel firstLevel = new ShadowTest().new FirstLevel();
        firstLevel.methodFirstLevel(3);
//        firstLevel.checkObjInstances();
    }
}
