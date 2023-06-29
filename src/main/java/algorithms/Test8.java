package algorithms;

public class Test8 {
    static int method(){
        for (int i=0;i<5;i++){
            System.out.println("i= "+i);
            try {
                if (i==1){
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Exception!");
                return i;
            } finally {
                System.out.println("Finally");
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("method: " +method());
    }
}
