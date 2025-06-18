import java.util.Scanner;
public class App_if_elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount= sc.nextInt();
        int min_fullFrame = sc.nextInt();
        int min_halfFrame = sc.nextInt();
        int min_frameless = sc.nextInt();

        if(amount >= min_fullFrame){
            System.out.println("Can buy full framed specs");
        } 
        else if (amount >= min_halfFrame){
            System.out.println("can buy half framed specs");

        }
        else if (amount >= min_frameless){
            System.out.println("Can buy frameless specs");
        }

    }
}
