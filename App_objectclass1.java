public class App_objectclass1 {
    static class Person {
        private String fname;
        private String lname;

        public String getFname() {
            return fname;
        }

        public void setFname(String fname) {
            this.fname = fname;
        }

        public String getLname() {
            return lname;
        }

        public void setLname(String lname) {
            this.lname = lname;
        }

        @Override
        public String toString() {
            return "Person [firstname = " + fname + ", lastname = " + lname + "]";
        }
    }

    public static void main(String[] args) {
        Person obj = new Person();
        obj.setFname("Iam");
        obj.setLname("Abhishek");
        System.out.println(obj.toString());
    }
}