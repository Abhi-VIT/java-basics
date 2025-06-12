public class App_bit_o {
    public static void main(String[] args){
        int num1=10, num2=5;
        // num1 = 10 -> 1010
        // num2 = 5 -> 0101
        System.out.println(num1 & num2); // AND
        System.out.println(num1 | num2); // OR
        System.out.println(num1 ^ num2); // exclusive OR
        System.out.println(~num1); // negation
        System.out.println(num1<<1); // Left shift
        System.out.println(num2>>1); // Right shift
        System.out.println(num1>>>1); 
    }
}
