package se.homework.HW5;

public class HW22 {
    public static void main(String... args){
        for (Crypto c : Crypto.values()){
            System.out.println(switchMethod(c));
        }
    }
    public static String switchMethod(Crypto c){
        String result;
        switch (c){
            case BTC: result = "basic crypto";
            break;
            case ETH: result = "vladic crypto";
            break;
            case NEO: result = "chinese crypto";
            break;
            case TRX: result = "bloody chinese crypto";
            break;
            case XRP: result = "bloody banksters coin";
            break;
            default: result = "not a crypto";
        }
        return result;
    }
}
enum Crypto{
    BTC,ETH,XRP,NEO,TRX
}
