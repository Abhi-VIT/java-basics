import java.util.Date;
class Main {
    public static void main(String[] args){
        Object obj = new String("Abhishek");
        Class c = obj.getClass();
        System.out.println(c.getName());
    }
}
// finalize method
class Main1{ 
    public static void main(String[] args){
        Main obj = new Main();
        System.out.println(obj.hashCode());
        obj = null;
        System.gc();
        System.out.println("end");
    }
    protected void finalize(){
        System.out.println("Finalize");
    }
}
//clone method
class Main3 {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date.toString());
        Date date2 = (Date)date.clone();
        System.out.println(date2.toString());
    }

}