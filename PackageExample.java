package mypackage1;
public class PackageExample {
    public void name() {
        System.out.println("Name of the student : Jeel");
    }
}

package mypackage2;
import mypackage1.*;
public class course {
    public void coursename() {
        System.out.println("Course : B.Tech AIML");
    }
    
    public static void main(String args[]) {
        student s1 = new student();
        course c1 = new course();
        s1.name();
        c1.coursename();
    }
}