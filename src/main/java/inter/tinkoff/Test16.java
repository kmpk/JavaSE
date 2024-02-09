package inter.tinkoff;

public class Test16 {
    public static void main(String[] args) {
        String str = "d";
        try {
            throw new RuntimeException();
        } catch (Error e) {
            str += "e";
        }catch (RuntimeException e){
            str+="f";

        }
        System.out.println(str);
    }
}
