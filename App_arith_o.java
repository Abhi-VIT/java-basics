import java.util.Scanner;
public class App_arith_o {
    public static void main(String[] args){
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2); // quiotent value in java
        System.out.println(num1%num2); // remainder value in java

    }
    
}
