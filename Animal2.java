package oops1;

 class Animal2 {
    void eat() {
        System.out.println("eating");}
    }

    class Dog2 extends Animal {
        void bark() {
            System.out.println("barking");}
        }

        class BabyDog extends Dog2 {
            void weep() {
                System.out.println("weeping");}
            }

            class TestInhertance {
                public  static void main(String args[]) {
                    BabyDog d = new BabyDog();
                    d.weep();
                    d.bark();
                    d.eat();
                }
            }
//muli inheritance