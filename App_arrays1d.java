import java.util.Scanner;
public class App_arrays1d {

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i =0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}