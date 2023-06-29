package se.homework.HW1;

public class HW8 {
    static int staticInt=0;
    int nonStaticInt=1;
    public static void main(String args[]){
        HW8 firstObject = new HW8();
        HW8 secondObject = new HW8();
        HW8 thirdObject = new HW8();
        firstObject.nonStaticInt=1;
        secondObject.nonStaticInt=2;
        thirdObject.nonStaticInt=3;
        System.out.println(firstObject.nonStaticInt);
        System.out.println(secondObject.nonStaticInt);
        System.out.println(thirdObject.nonStaticInt);
        System.out.println(firstObject.staticInt);// так лучше не писать, статическое поле вызывается у класса, не объекта
        System.out.println(secondObject.staticInt);
        System.out.println(thirdObject.staticInt);
    }
}
