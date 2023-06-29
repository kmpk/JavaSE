package se.homework.HW5;

public class HW21 {
    public static void main(String... args){
        for (Money m : Money.values()){
            System.out.println( m+ " ordinal is " + m.ordinal());
        }
    }
}
enum Money{
    USD,RUB,BTC,ETH,XRP
}
