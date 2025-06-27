public class App_objectclass2 {
    static class Student {
        static int last_roll = 100;
        int roll_no;

        Student() {
            roll_no = last_roll;
            last_roll++;
        }

        @Override
        public int hashCode() {
            return roll_no;
        }

        @Override
        public String toString() {
            return "Student[roll_no=" + roll_no + "]";
        }
    }

    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println(obj);           // Calls toString()
        System.out.println(obj.toString()); // Same as above
        System.out.println(obj.hashCode()); // Shows roll number
    }
}