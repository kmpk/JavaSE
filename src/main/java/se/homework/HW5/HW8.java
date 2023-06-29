package se.homework.HW5;

public class HW8 {
    public void method1(){
        System.out.println("m1");
        method2();
        this.method2();
    }
    public void method2(){
        System.out.println("m2");
    }
    public static void main(String... a){
        new HW8().method1();
    }
}
