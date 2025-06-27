class OuterClass{
        void print(){
        System.out.println("Outer class");
        }
    }

    class Main{
        static OuterClass out = new OuterClass(){
            void print(){
                super.print();
                System.out.println("Anonymous class");
            }
        };
        public static void main(String[] args){
            out.print();
        }
    }
