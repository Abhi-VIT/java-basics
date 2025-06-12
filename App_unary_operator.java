public class App_unary_operator {
    public static void main(String[] args){
        int num1 = 10, num2 = 5, res, num3 =1;
        char ch = 'a';
        boolean flag = true;
        res = +ch;
        System.out.println(res);
        num3 = -num3;
        System.out.println(num3);
        res = num1++; // post increement 11
        System.out.println(res);
        res = ++num1; // 12
        System.out.println(res);
        res = num2--;
        System.out.println(res);
        res = --num2;
        System.out.println(res);
        System.out.println(!flag); // invert the value
    }
}
