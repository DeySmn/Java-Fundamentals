package main;

class OuterClass {
    private int oId = 5;

    class InnerClass {
        int id = 10;
        public void getOuterClassId() {
            oId = 4;
            System.out.println(oId); // 4
        }
    }
    static class StaticNestedClass {
        static int sId = 20;
    }
}

public class Example1 {
    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        OuterClass.InnerClass innerObj1 = outerObj.new InnerClass();
        System.out.println(innerObj1.id); // 10
        innerObj1.getOuterClassId();
        OuterClass.StaticNestedClass staticNestedObject = new OuterClass.StaticNestedClass();
        System.out.println(OuterClass.StaticNestedClass.sId); // 20
    }
}
