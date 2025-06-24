public class App_manipulating_strings {
    public static void main(String[] args) {
        // String function
        // trim, comapreto, substring, startswith, endswith, charAt, indexof
        String s1 = " Hello ";
        // length()
        // arr.length;
        System.out.println(s1.length());
        System.out.println("After triming");
        System.out.println(s1.trim().length()); //length after triming

        System.out.println("s2");
        String s2 = "welcome";
        System.out.println(s2.startsWith("ee")); // boolean if starts with that letter. in java true - trie // hashing in backend also
        System.out.println(s2.endsWith("me")); // boolean if ends with that letter

        System.out.println(s2.charAt(3));
        System.out.println(s2.indexOf('e')); // first occurence of letter


        // welcome -- wel
        System.out.println(s2.substring(0, 4)); // till 3 and 4 is excluded
        
    }
}
