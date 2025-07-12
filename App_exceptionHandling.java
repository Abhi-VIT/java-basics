import java.io.*;
public class App_exceptionHandling {
    public static void main(String[] args) {
        try {
            System.out.println(25/0);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        System.out.println("Hello World");
    }
}
