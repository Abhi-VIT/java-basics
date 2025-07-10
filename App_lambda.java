// lambda expression in java

interface A{
    void show();
}
public class App_lambda {
    public static void main(String[] args) {
        A obj;
        obj = () -> System.out.println("Hello, World!");
        obj.show();
    }
}
// lambda expression
// This code defines an interface A with a method show.
// It then creates an instance of A using a lambda expression that prints "Hello, World!".