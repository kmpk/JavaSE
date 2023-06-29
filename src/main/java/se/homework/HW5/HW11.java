package se.homework.HW5;

public class HW11 {
    public void finalize(){
        System.out.println("in finalize");
    }
    public static void main(String... strings) throws InterruptedException{
        new HW11();
        System.gc();
        Thread.sleep(10);
    }
}
