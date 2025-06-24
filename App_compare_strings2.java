public class App_compare_strings2 {
    public static void main(String[] args) {
        // String functions
        // equals, equalsIgnoreCase, trim, compareTo, substring, startswith, endswith, charAt, indexof
        String s1 = "welcome";
        String s2 = "welcome";
        String s3 = new String("welcome");
        System.out.println(s1==s2);
        System.out.println(s1 == s3); //comparing the address instead of values 
        System.out.println(s1.equals(s3)); // now its compare the values

        String s4 = "Welcome";
        System.out.println(s4.equalsIgnoreCase(s3));// as first letter of s4 is capital so its ignore the capitalscases
    }
}
