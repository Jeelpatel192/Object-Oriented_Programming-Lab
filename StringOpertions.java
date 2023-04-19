public class StringExp {
    public static void main(String args[]) {
        String s1 = "Hello";
        String s2 = "World!";
        String s3 = "Java Programming";
        
        System.out.println("Length of S1 : " + s1.length());
        System.out.println("Length of S2 : " + s2.length());
        
        String join = s1.concat(s2);
        System.out.println(join);
        
        Boolean b1 = s1.equals(s2);
        System.out.println("Is S1 and S2 equal : " + b1);
        
        System.out.println(s3.startsWith("Java"));
        
        System.out.println(s3.endsWith("Ing"));
        
        System.out.println(s3.toLowerCase());
        
        System.out.println(s3.toUpperCase());
    }
}
