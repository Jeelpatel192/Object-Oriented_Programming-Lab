// Program 1 : Java program to find sum of two numbers using class and object.

import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();
        
        System.out.println("Sum is " +(a+b));
    }
}