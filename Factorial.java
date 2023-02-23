// Program 3(a) : find the factorial of a number entered by the user.

import java.util.*;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        int factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}