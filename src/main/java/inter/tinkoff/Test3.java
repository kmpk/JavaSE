package inter.tinkoff;

public class Test3 {
    public static void main(String[] args) {
        int k =5;
        for (short i =0; i<5;){
            i++;
            if (i%2!=0){
                continue;
            }
            k+=3;
        }
        System.out.println(k);
    }
}
