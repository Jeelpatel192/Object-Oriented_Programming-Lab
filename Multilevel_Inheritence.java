// Program 5 : Write a Java Program to implement various types of inheritance.

// Program 5 (B) : Multilevel Inheritence 

class X {
    void methodX() {
        System.out.println("Class X method");
    }
}

class Y extends X {
    void methodY() {
        System.out.println("Class Y method");
    }
}

class Z extends Y {
    void methodZ() {
        System.out.println("Class Z method");
    }
}

public class Multilevel_Inheritence {
    public static void main(String[] args) {
        Z obj = new Z();
        
        obj.methodX();
        obj.methodY();
        obj.methodZ();
    }
}