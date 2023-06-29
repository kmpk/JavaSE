package se.homework.HW5;

public class HW13 {
    HW13(int marker) {
        System.out.println("HW " + marker);
    }
    void f(int marker){
        System.out.println("f " + marker);
    }
}
class HW13_2{
    static HW13 hw1;
    static HW13 hw2;
    static{
        hw1 = new HW13(1);
        hw2 = new HW13(2);
    }
    HW13_2(){
        System.out.println("HW13_2");
    }
}
class ExplicitStatic{
    public static void main(String... args){
        System.out.println("inside main");
        //HW13_2.hw1.f(99);
    }
    //static HW13_2 hw_1 = new HW13_2();
    //static HW13_2 hw_2 = new HW13_2();
}
