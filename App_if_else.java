import java.util.Scanner;

public class App_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int obt_mark = sc.nextInt();
        int min_mark = sc.nextInt();
        if(obt_mark>=min_mark){
            System.out.println("Pass");

        } else {
            System.out.println("Fail");
        }
            
    }
}
