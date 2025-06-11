// local variable -- function , constructor, or block ---> conditional (if, else) or looping
//instance variable --> object--> instance of a class--> insidea class --> outside a function
//static variable -- do your own
class A{
    int b=120;
}

public class app_l_i_variable {
    public static void main(String[] args) {
        int a = 100;
        System.out.println(a);
        // code to intialize the local variable of class A in public class app
        A obj = new A();
        System.out.println(obj.b);
    }
}


