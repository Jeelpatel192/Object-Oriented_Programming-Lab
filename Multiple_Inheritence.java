// Program 5 : Write a Java Program to implement various types of inheritance.

// Program 5 (D) : Multiple Inheritence 

interface A
{
    public abstract void execute1();
}
interface B
{
    public abstract void execute2();
}
class C implements A,B
{
    public void execute1()
    {
        System.out.println("Hello");
    }
    public void execute2()
    {
        System.out.println("Good Morning");
    }
}
public class Multiple_Inheritence
{
	public static void main(String[] args) 
	{
		C obj = new C(); // creating object of class C
		obj.execute1(); //calling method execute1
		obj.execute2(); // calling method execute2
	}
}
