class OuterClass {
    void outerMethod() {
        final String value = "I am Abhishek";
        System.out.println("Outer class");

        class InnerClass {
            public void print() {
                System.out.println("Inner class " + value);
            }
        }

        InnerClass in = new InnerClass();
        in.print();
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        out.outerMethod();
    }
}