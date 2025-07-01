// does java support multiple inheritance?
// No, Java does not support multiple inheritance directly to avoid ambiguity. However, it can be achieved using interfaces.
// Method overriding  ---> laptop bag --> dress and kits
// overloading ---> 

// class A IS-A B --Inheritance 

class A {
    void display() {
        System.out.println("welcome base");
    }
}
class B extends A {
    void display() {
        super.display(); // Calls the display method of class A
        // This line is optional, if you want to call the base class method
        System.out.println("welcome derived");
    }
}

public class App_multiple_inheritance {
    public static void main(String[] args) {
        B obj = new B(); // Upcasting
        obj.display(); // Calls the overridden method in class B if // super.display() not present
        // If super.display() is present, it will call the base class method first
        // Output will be: welcome base
        // welcome derived
    }
    
}
