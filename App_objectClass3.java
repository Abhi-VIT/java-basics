class Main {
    public static void main(String[] args){
        Object obj = new String("Abhishek");
        Class c = obj.getClass();
        System.out.println(c.getName());
    }
}