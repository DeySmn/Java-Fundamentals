package main;

public class Example1 {
    public static void main(String[] args) {
        // ++ --
        // i++; // equivalent to i = i+1;
        // i--; // equivalent to i = i-1;
// type-1
        var i = 10;
        i = i + 1;
        i = i++;
        System.out.println(i); // 11
        i = ++i;
        System.out.println(i); // 12
// type-2
        i = 10;
        i = i + 1;
        i++;
        System.out.println(i); // 12
        i = ++i;
        System.out.println(i); // 13
// type-3
        i = 10;
        System.out.println(i++); // 10
        System.out.println(i); // 11
        System.out.println(++i); // 12
        System.out.println(i); // 12
        System.out.println();
// type-4
        i = 10;
        int rs1 = 10 + ++i + 10 ;
        System.out.println(rs1); // 31
        i=10;
        int res1 = 10 + ++i + 10 + i;
        System.out.println(res1); // 42
        i=10;
        int result1 = i + 10 + ++i + 10;
        System.out.println(result1); // 41
        i = 10;
        int rs2 = 10 + i++ + 10 ;
        System.out.println(rs2); // 30
        i=10;
        int res2 = 10 + i++ + 10 + i;
        System.out.println(res2); // 41
        i=10;
        int result2 = i + 10 + i++ + 10;
        System.out.println(result2); // 40
        System.out.println();
        i=10;
        int x = i + 10 + 5 * ++i + 10;
        System.out.println(x); // 85

    }
}

/*
Summary:
1. Variable to value conversion (with pre/post increment/decrement handled first).
2. Operators are evaluated based on precedence.
3. Associativity resolves the order of operations when multiple operators of the same precedence level are present.
 */
