/* Program : 4  Write a Java program to create class Student. The class should have attributes student ID, student name, marks for 3 subjects and the member functions are setdata() and displaydata(). Calculate the average marks for student.

*/

public class Student {
    public static void main(String[] args) {
        Student1 Jeel = new Student1();
        Jeel.setdata("21BTAI26", "Jeel Patel", 89, 77, 95);
        Jeel.displaydata();
    }
}

final class Student1 {
    private String st_id;
    private String st_name;
    private int maths_mk;
    private int dsa_mk;
    private int dbms_mk;
    
    public void setdata(String StudentID, String StudentName, int MathMark, int DSAMark, int DBMSMark) {
        this.st_id = StudentID;
        this.st_name = StudentName;
        this.maths_mk = MathMark;
        this.dsa_mk = DSAMark;
        this.dbms_mk = DBMSMark;
    }
    
    public void displaydata() {
        System.out.println("Student ID : " +st_id);
        System.out.println("Student Name : " +st_name);
        System.out.println("Maths Marks : " +maths_mk+ "/100");
        System.out.println("DSA Marks : " +dsa_mk+ "/100");
        System.out.println("DBMS Marks : " +dbms_mk+ "/100");
        int avg_mk = ((maths_mk + dsa_mk + dbms_mk) / 3);
        System.out.println("Average Marks : " +avg_mk);
    }
    
}