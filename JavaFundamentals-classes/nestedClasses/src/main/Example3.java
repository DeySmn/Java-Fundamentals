package main;

class ShadowTest2 {
    private int x = 1;
    class level1 {
        private int x = 2;
        class level2 {
            private int x = 3;
            void methodForShadowTest(int x) {
                System.out.println("""
                        x = %d, \
                        this.x = %d, \
                        level1.this.x = %d, and \
                        ShadowTest2.this.x = %d.\
                        """.formatted(
                                x,
                        this.x,
                        level1.this.x,
                        ShadowTest2.this.x
                ));
            }
        }
    }
}
public class Example3 {
    public static void main(String[] args) {
        ShadowTest2 shadowTest2 = new ShadowTest2();
        ShadowTest2.level1 level1 = shadowTest2.new level1();
        ShadowTest2.level1.level2 level2 = level1.new level2();
        level2.methodForShadowTest(4);
    }

}
