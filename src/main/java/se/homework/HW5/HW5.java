package se.homework.HW5;

public class HW5 {
    public static class Dog {
        public void bark() {
            System.out.println("default bark");
        }

        public void bark(String s) {
            System.out.println("dog barks : " + s);
        }

        public void bark(int i) {
            System.out.println("dog barks " + i + " times");
        }

        public void bark(char c) {
            System.out.println("dog barks char " + c);
        }
    }

    public static void main(String... a) {
        Dog dog = new Dog();
        dog.bark();
        dog.bark(2);
        dog.bark("custom bark");
        dog.bark('u');
    }
}
