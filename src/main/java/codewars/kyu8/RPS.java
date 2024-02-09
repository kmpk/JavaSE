package codewars.kyu8;

public class RPS {
    public static String rps(String p1, String p2) {
        String p1Win = "Player 1 won!";
        String p2Win = "Player 2 won!";
        if (p1.equals(p2)) return "Draw!";
        if (p1.equals("scissors"))return p2.equals("paper")? p1Win : p2Win;
        if (p1.equals("paper")) return p2.equals("rock")? p1Win : p2Win;
        else return p2.equals("scissors")? p1Win : p2Win;
    }
}
