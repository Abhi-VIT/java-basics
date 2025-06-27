class OuterClass {
    // outer class
    static class InnerClass {
        // inner class
        public void print() {
            System.out.println("Inner class");
        }
    }
}

class Main {
    public static void main(String[] args) {
        OuterClass.InnerClass in = new OuterClass.InnerClass();
        in.print();
    }
}