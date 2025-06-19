import java.util.Scanner;
import java.util.Arrays;
public class App_arraysfill {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Arrays.fill(arr, 5);
        for (int index = 0; index<4; index ++){
            System.out.print(arr[index]+ " "); // only print if you want to print in a single line. 
            // if you want to print one by one then println 
        }
        for (Integer value: arr) {
            System.out.println(value);
        }

    }
}
