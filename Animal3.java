package oops1;

 class Animal3 {
    void eat1() {
        System.out.println("eating");}
    }
    class dog1 extends Animal3 {
        void bark() {
            System.out.println("System.out.println");}
        }
    class Cat2 extends Animal3{
            void meov() {
                System.out.println("meoving");}
            }
            class TestInheritance2 {
                public static void main(String args[]){
                    Cat2 c=new Cat2();
                    c.eat1();
                    c.meov();
                }
            }
//herihical