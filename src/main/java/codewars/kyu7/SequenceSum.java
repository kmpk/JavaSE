package codewars.kyu7;

public class SequenceSum {
    public static String showSequence(int value){
        if (value<0) return value + "<0";
        if (value==0) return "0=0";
        int sum = 0;
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i<=value; i++){
            stringBuilder.append(i).append('+');
            sum+=i;
        }
        stringBuilder.replace(stringBuilder.lastIndexOf("+"),stringBuilder.lastIndexOf("+")+1," = ");
        return stringBuilder.append(sum).toString();
    }
}
