// hierarchical inheritance -- one parent class and multiple child classes
// science -----> biology
// CS -----> core --- programming


// principal
// hod ----- 1 2 3 ...etc

class parent {
    // parent class
    void display() {
        System.out.println("Base");
    }

}

class child extends parent {
    // child class
    void test() {
        System.out.println("Derived 1");
    }
}

class child2 extends parent {
    // another child class
    void test() {
        System.out.println("Derived 2");
    }
}


public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        child obj1 = new child();
        obj1.display(); // Calls parent class method
        obj1.test(); // Calls child class method

        child2 obj2 = new child2();
        obj2.display(); // Calls parent class method
        obj2.test(); // Calls another child class method
    }
    
}
