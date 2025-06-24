public class App_compare_strings {
    public static void main(String[] args) {
        // literal 
        String s1 = "Abhishek";

        // using new keyword
        String s2 = new String("welcome");
        System.out.println(s1 + " developer"); 
        System.out.println(s1);
        
        // interger compare
        int a = 10;
        int b = 10;
        System.out.println(a==b);

        // Strings compare

        String s3 = "Abhishek";
        System.out.println(s1 == s1);
        System.out.println(s3==s1);
        System.out.println(s1.equals(s3));


    }
}
