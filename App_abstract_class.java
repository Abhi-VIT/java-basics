// * Abstract class
// * abstract class A
// * non abstract methods
// * abstract method ---> a method declared using abstarct 

abstract class A {
    abstract void test();// declared
}
class B extends A {
    void test() { // defined
        System.out.println("test method");
    }
}
public class App_abstract_class {
    public static void main(String[] args) {
        System.out.println("Welcome");
        A a = new B();
        a.test();
    }
}
