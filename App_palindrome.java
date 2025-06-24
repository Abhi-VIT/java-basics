import java.util.Scanner;

public class App_palindrome {
    static boolean palindromeCheck(String input){
        StringBuilder sb = new StringBuilder(input);
        String result = sb.reverse().toString();
        if (result.equals(input)){
            return true;

        }
        return false;
    }
    public static void main(String[] args) {
        // reverse
        //palindrome ---> madam ---> madam
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = sc.next();
        if(palindromeCheck(input)){
            System.out.println(input+ " is a palindrome");
        }else {
            System.out.println(input + " is not a palindrome");
        }
    }
}
