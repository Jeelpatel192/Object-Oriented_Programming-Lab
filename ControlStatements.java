// Program 2(b) : Java program to demonstrate various control statements.

public class ControlStatements {
    public static void main(String[] args) {
        
        // IF - ELSE 
        System.out.println("IF - ELSE");
        int num = 5;
        
        if(num % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        
        // For Loop
        System.out.println("\nFOR LOOP");
        for(int counter = 0; counter < 3; counter++ ) {
            System.out.println("Hello");
        }
        
        // While Loop
        System.out.println("\nWHILE LOOP");
        int i = 10;
        while(i<=14) {
            System.out.println(i);
            i += 1;
        }  
        
        // Do While Loop
        System.out.println("\nDo - WHILE LOOP");
        int x = 0;
        do {
            System.out.println("AIML");
            x += 1;
        } while(x<3);
        
        // Switch Statement
        System.out.println("\nSWICH STATEMENT");
        int button = 3;
        switch(button) {
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid Button");
        }
    }
}