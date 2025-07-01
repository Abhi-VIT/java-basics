// Why Multiple Inheritance is not supported in Java? --- two base ---> one derived
// Method overriding ---> laptop bag --> dress and kits

class A {
    void display() {
        System.out.println("welcome base");
    }
}

class B {
    void display() {
        System.out.println("Base 2");
    }
}

class C extends A,B {
    // This will cause a compile-time error because Java does not support multiple inheritance.
    void display() {
        System.out.println("welcome derived");
    }
}

public class App_method_overriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
    
}
