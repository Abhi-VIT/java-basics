import java.io.*;
class Custom extends Exception {
    public void CustomMethod(String str) {
        super(str);
    }
}

public class App_MultipleExceptionHandling {
    public static void main(String[] args) {
        try {
            int arr[] = {1, 2, 3, 4, 5, 6};
            System.out.println(arr[100]); // This will throw an ArrayIndexOutOfBoundsException
            // Custom obj = new Custom();
            // obj.CustomMethod("Hello");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred!");
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception occurred!");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
