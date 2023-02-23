// Program 5 : Write a Java Program to implement various types of inheritance.

// Program 5 (C) : Hierarchical Inheritence 

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("meowing...");
    }
}

public class Hierarchical_Inheritence {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
        c.eat(); 
    } 
}