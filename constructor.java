package javaapplication1;
public class constructor {
    public void construct() {
        System.out.println("Constructor is created.");
    }
    
    public static void main(String args[]) {
        construct c1 = new construct();
        c1.construct();
        System.out.println("Garbage Collection");
        construct c2 = new construct();
        c2 = null;
        System.gc();
    }
}