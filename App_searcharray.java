import java.util.Scanner;
import java.util.Arrays;
public class App_searcharray{
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        int len = arr.length;
        for (int index =0; index< len ; index ++){
            arr[index] = scanner.nextInt();
        }
        Arrays.sort(arr);//ascending order
        System.out.println("Enter the element to be Search");
        int key = scanner.nextInt();
        System.out.println(Arrays.binarySearch(arr,key));

    }
}