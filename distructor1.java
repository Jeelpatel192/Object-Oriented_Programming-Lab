//package practise;
class distructor {
    int x;
    distructor(int i) {
        x = i;
    }
    public void finalize() {
        System.out.println("Garbage cleared");
    }
}

//package practise;
public class distructor1 {
    public static void main(String args[]) {
        distructor d1 = new distructor(10);
        distructor d2 = new distructor(11);
        System.out.println(d1.x + " " + d2.x);
        d1 = null;
        d2 = null;
        System.gc();
    }
}