// Program 5 : Write a Java Program to implement various types of inheritance.

// Program 5 (A) : Single Inheritence 

class Employee {
    void salary() {
        System.out.println("Salary = 20000");
    }
}

class Programmer extends Employee {
    void bonus() {
        System.out.println("Bonus = 5000");
    }
}

public class Single_Inheritence {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.salary(); // calls method of super class
        p.bonus(); // calls method of sub class
    } 
}