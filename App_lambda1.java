import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;

public class App_lambda1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String s = "Hello, Lambda!";
        System.out.println(s);
        Consumer<String> lambda1 = (String s1) -> System.out.println(s1); // This is a lambda expression
        Consumer<String> lambda2 = s2 -> System.out.println(s2); // This is also a lambda expression
        
        BiConsumer<String, String> lambda3 = (str1, str2) -> System.out.println(str1 + str2); // Another lambda expression
        IntBinaryOperator lambda4 = (int a, int b) -> a + b; // Lambda expression with parameters
        Supplier<Integer> lambda5 = () -> 42; // Lambda expression with no parameters
    }
}

// parameter -> expression body
// (parameters) -> expression
// (a, b) -> a + b
// () -> 42
// (x) -> x * x
// (String s) -> s.length()