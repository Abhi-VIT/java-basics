// *Abstract class
// * abstract class A
// * non abstract methods
// * abstract method ---> a method declared using abstract keyword
// * abstract methods are implemented in its derived class


// abstract class cannot be instantiated
// * example : calculating rate of Interest for different banks accounts
// SBI --> 6% HDFC --> 7% ICICI --> 8%
// ACCOUNT ---> rate of interest()

abstract class Account {
    abstract double rateOfInterest(); // abstract method
}
class SBI extends Account {
    double rateOfInterest() { // implementation of abstract method
        return 6.0;
    }
}
class HDFC extends Account {
    double rateOfInterest() {
        return 7.0;
    }
}
class ICICI extends Account {
    double rateOfInterest() {
        return 8.0;
    }
}
// Main class to test the functionality
public class App_abstract_RealCase {
    public static void main(String[] args) {
        Account sbi = new SBI();
        Account hdfc = new HDFC();
        Account icici = new ICICI();

        System.out.println("SBI Rate of Interest: " + sbi.rateOfInterest() + "%");
        System.out.println("HDFC Rate of Interest: " + hdfc.rateOfInterest() + "%");
        System.out.println("ICICI Rate of Interest: " + icici.rateOfInterest() + "%");
    }
}
