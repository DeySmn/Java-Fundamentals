package main.d2;

public class Example3 {
    public static void main(String[] args) {
        int [][][] a = {{ {1,2}, {} }, {{1}}, {null}, {null, null}, null};
        // length of a is 5

        System.out.println("a: "+a.length); // 5
        for(int i=0; i<a.length; i++) {
            if(a[i] != null) {
                System.out.println("a[%d]: %d".formatted(i, a[i].length)); // a[0]: 2 ...
            } else {
                // NullPointerException
            }
        }

        String s1 = null;
        String s2 = null;
        System.out.println(s1 == s2); // true
//        System.out.println(s1.equals(s2)); // NullPointerException
    }
}

/*
null replaces the absence of a reference. This is the purpose of 'null' keyword.
 */
