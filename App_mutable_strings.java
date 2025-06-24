// Creating mutable String
// StringBuffer - thread safe ---> multiple Synchronized
// StringBuilder non synchronized --->

import java.util.Scanner;
public class App_mutable_strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder sb = new StringBuilder(s);
        sb.append("java");
        System.out.println(sb);
        // hello --->1 -- ab ---habello
        sb.insert(0,sb);
        System.out.println(sb);

        sb.replace(0,2,"te"); // 0 and 1
        System.out.println(sb);

        sb.delete(1, 3);
        System.out.println(sb);

        String result = sb.toString();
        System.out.println(result);
        //append
        // insert
        // replace

        // delete
        //revers

    }
}
