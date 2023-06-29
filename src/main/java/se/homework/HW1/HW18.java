package se.homework.HW1;

public class HW18 {
    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);
        for (int i = 0; i<=max; i++){
            boolean flag=false;
            for (int j = i/2; j>1; j--){
                if (i%j==0){
                    flag=true;
                    break;
                }
            }
            if (!flag) System.out.println(i);
        }
    }
}
