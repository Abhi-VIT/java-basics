// Scanner clas in Java - Reads the input from the keyboard /console
// Scanner class belongs to util pakage
//System.out ... system.in and system.err

import java.util.Scanner;
public class app_scanner {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float f = scanner.nextFloat();
        double d = scanner.nextDouble();

        String s = scanner.next();
        char ch = scanner.next().charAt(0);
        
        System.out.println(n);
        System.out.println(f);
        System.out.println(d);
        System.out.println(s);
        System.out.println(ch);
    }
}
