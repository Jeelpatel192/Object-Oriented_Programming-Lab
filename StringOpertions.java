public class StringExp {
    public static void main(String args[]) {
        String s1 = "Hello";
        String s2 = "World!";
        
        int len1 = s1.length();
        int len2 = s2.length();
        
        System.out.println("Length of S1 : " + len1);
        System.out.println("Length of S2 : " + len2);
        
        String join = s1.concat(s2);
        System.out.println(join);
        
        Boolean b1 = s1.equals(s2);
        System.out.println("Is S1 and S2 equal : " + b1);
        
        String s3 = "Hello friends\"chai pilo\".";
        System.out.println(s3);
    }
}
