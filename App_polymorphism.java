//polymorphism - poly - many --morph - forms
// A person ---> employee ---> customer ---> passenger
// Method overriding ---> inheritance


//compile time and run time ---> 
// runtime polymorphism ---> virtual method invocation ---> dynamic binding

class A {
    void display() {
        System.out.println("Welcome");
    }
}

class B extends A {
    void display() {
        System.out.println("derived");
    }
}
public class App_polymorphism {
    public static void main(String[] args) {
        A base = new B();
        B derived = new B();
        base.display();
        derived.display();

        // compile time and run time ---> compile base function
        // runtime polymorphism ---> virtual method invocation ---> dynamic binding
        // base.display(); // A
    }
    
}
