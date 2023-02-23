// Program 3(b) : print the fibonacci series terms entered by the user.

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of terms : ");
        int num = sc.nextInt();
        
        int n1 = 0, n2 = 1;
        System.out.print(n1+ " " +n2+ " ");
        
        for(int i = 2; i < num; i++ ) {
            int n3 = n1 + n2;
            System.out.print(n3+ " ");
            n1 = n2;
            n2 = n3;
        }
    }
}