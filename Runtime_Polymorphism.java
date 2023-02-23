// Program 7 : Write a Java program that implements runtime polymorphism.

interface Drawable {
    void draw();
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle..");
    }
}

class Square implements Drawable {
    public void draw() {
        System.out.println("Drawing Square..");
    }
}

public class Runtime_Polymorphism {
    public static void main(String[] args) {
        Drawable s = new Square();
        s.draw();
        
        Drawable c = new Circle();
        c.draw();
    }
}