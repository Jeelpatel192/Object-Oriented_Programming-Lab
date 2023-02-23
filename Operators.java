// Program 2(a) : Java program to demonstrate various operators.

public class Operators {
    public static void main(String [] args) {

        // Arithmetic Operators
        System.out.println("Arithmetic Operators");
        int a = 15, b = 3;
        System.out.println("a + b = " +(a+b));
        System.out.println("a - b = " +(a-b));
        System.out.println("a * b = " +(a*b));
        System.out.println("a / b = " +(a/b));
        System.out.println("a % b = " +(a%b));
        
        // Relational Operators
        System.out.println("\nRelational Operators");
        int p = 5, q = 5;
        System.out.println("p == q = " +(p==q)); // T
        System.out.println("p != q = " +(p!=q)); // F
        System.out.println("P < q = " +(p<q)); // F
        System.out.println("P > q = " +(p>q)); // F
        System.out.println("P <= q = " +(p<=q)); // T
        System.out.println("P >= q = " +(p>=q)); // T
        
        // Assignment Operators
        System.out.println("\nAssignment Operators");

        int m = 10, n;
        
        // =
        n = m;
        System.out.println(n);
        
        // +=
        m += n;
        System.out.println(m);
        
        // -=
        m -= n;
        System.out.println(m);
        
        // *=
        m *= n;
        System.out.println(m);
        
        // /=
        m /= n;
        System.out.println(m);
        
        // Logical Operators
        System.out.println("\nLogical Operators");
        
        int x = 15, y = 10, z = 5;
        
        // && Operator
        System.out.println((x > y) && (x > z));
        System.out.println((x > y) && (x < z));
        
        // || Operator
        System.out.println((z < x) || (x < y));
        System.out.println((x > y) || (y > z));
        
        // ! Operator
        System.out.println(!(x == z));
        System.out.println(!(x > y));
        
        // Shift Operator
        System.out.println("\nShift Operator");
        
        int e = 17;
        
        // Shift by 1
        System.out.println("Left Shift by 1 : " +(e << 1));
        System.out.println("Right Shift by 1 : " +(e >> 1));
        
        // Shift by 2
        System.out.println("Left Shift by 2 : " +(e << 2));
        System.out.println("Right Shift by 2 : " +(e >> 2));
        
        // Bitwise Operator
        System.out.println("\nBitwise Operator");
        
        int Num1 = 4, Num2 = 5;
        System.out.println("Num1 & Num2 = " +(Num1 & Num2));
        System.out.println("Num1 | Num2 = " +(Num1 | Num2));
        System.out.println("Num1 ^ Num2 = " +(Num1 ^ Num2));
        
        // Conditional Operator
        System.out.println("\nConditional Operator");
        int max = (a>b) ? a : b;
        System.out.println(max);
        
        // Unary Operators
        System.out.println("\nUnary Operator");
        
        int g = 5, h = 5;

        System.out.println(g++);
        System.out.println(g);
        
        System.out.println(++h);
        System.out.println(h);
    }
}