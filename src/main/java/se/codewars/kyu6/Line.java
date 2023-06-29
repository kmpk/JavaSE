package se.codewars.kyu6;

public class Line {
    public static String Tickets(int[] peopleInLine) {
        int bill25 = 0, bill50 = 0, bill100 = 0;
        for (int i : peopleInLine) {
            if (i == 25) {
                bill25++;
            } else if (i == 50) {
                if (bill25 > 0) {
                    bill25--;
                    bill50++;
                } else return "NO";
            } else if (i == 100) {
                if (bill50>0&&bill25>0){
                    bill50--;
                    bill25--;
                    bill100++;
                } else if (bill25>2){
                    bill25-=3;
                    bill100++;
                } else return "NO";
            }
        }
        return "YES";
    }
}
