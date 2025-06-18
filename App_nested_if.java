import java.util.Scanner;
public class App_nested_if {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int os = sc.nextInt();
        int ram = sc.nextInt();
        if (os>=64){
            if (ram>=8){
                System.out.println("Can install pubg or cod");
            }
            else {
                System.out.println("Can install Fry Cry");

            }
        }
        else {
            System.out.println("free fire");
        }

    }
}