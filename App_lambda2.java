public class App_lambda2 {
    final static String s1 = "Hello";
    public static void main(String[] args) {
        Greeting obj = message -> {
            String result = s1 + message;
            System.out.println(result);
            return result;
        };
        obj.message("World");
    }
    interface Greeting {
        String message(String message);
    }
}

