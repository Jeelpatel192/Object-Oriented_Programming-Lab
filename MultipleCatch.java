public class MultipleCatch {
	public static void main(String[] args) {
	    try {
	        int a = 6/0;
		}  
			  
		catch(ArithmeticException e) {
		    System.out.println("Arithmetic Exception occurs");
		}  
			   
		catch(ArrayIndexOutOfBoundsException e) {
		    System.out.println("ArrayIndexOutOfBounds Exception occurs");
	    }  
			  
		catch(Exception e) {
		    System.out.println("Parent Exception occurs");
		}  		  
			   
		System.out.println("Once exception is handled, rest of the code will get executed.......");  
	}
}