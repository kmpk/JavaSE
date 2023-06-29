package se.homework.HW5;

public class HW6 {
    public static class Dog {
        public void bark(String s, int i) {
            System.out.println("dog barks : " + s + " " + i + " times");
        }

        public void bark(int i, String s) {
            System.out.println("dog barks " + i + " times : " + s);
        }
    }

    public static void main(String... a) {
        Dog dog = new Dog();
        dog.bark(2, "bark");
        dog.bark("bark", 3);
    }
}
