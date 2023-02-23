//Program 3(c) : find sum of digits in a given number

import java.util.*;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        
        int digit, sum = 0;
        
        while(num > 0) {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        
        System.out.println("Sum of Digits: "+sum);
    }
}