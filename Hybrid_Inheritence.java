// Program 5 : Write a Java Program to implement various types of inheritance.

// Program 5 (e) : Hybrid Inheritence

class Grandfather {
    public void show() {
        System.out.println("I am Grandfather");
    }
}

class Father {
    public void show() {
        System.out.println("I am Father");
    }
}

class Son extends Father {
    public void show() {
        System.out.println("I am Son");
    }
}

class Daughter extends Father {
    public void show() {
        System.out.println("I am a Daughter");
    }
}

public class Hybrid_Inheritence {
    public static void main(String[] args) {
        Daughter d = new Daughter();
        d.show();
        
        Son s = new Son();
        s.show();
    }
}