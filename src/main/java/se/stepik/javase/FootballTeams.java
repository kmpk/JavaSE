package se.stepik.javase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FootballTeams {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int num = Integer.parseInt(bufferedReader.readLine());
            Map<String, FootballTeam> teams = new HashMap<>();
            for (int i = 0; i < num; i++) {
                String[] entry = bufferedReader.readLine().split(";");
                FootballTeam team1 = new FootballTeam(entry[0]);
                FootballTeam team2 = new FootballTeam(entry[2]);
                teams.putIfAbsent(team1.getName(), team1);
                teams.putIfAbsent(team2.getName(), team2);
                int goals1 = Integer.parseInt(entry[1]);
                int goals2 = Integer.parseInt(entry[3]);
                if (goals1 == goals2) {
                    teams.get(team1.getName()).addDraw();
                    teams.get(team2.getName()).addDraw();
                } else if (goals1 > goals2) {
                    teams.get(team1.getName()).addWin();
                    teams.get(team2.getName()).addDefeat();
                } else {
                    teams.get(team1.getName()).addDefeat();
                    teams.get(team2.getName()).addWin();
                }
            }
            for (Map.Entry<String, FootballTeam> e : teams.entrySet()) {
                System.out.println(e.getValue().getSummary());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class FootballTeam {
    private int totalGames = 0;
    private int wins = 0;
    private int draws = 0;
    private int defeats = 0;
    private int totalPoints = 0;
    private final String name;

    FootballTeam(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public void addWin() {
        totalGames++;
        wins++;
        totalPoints += 3;
    }

    public void addDraw() {
        totalGames++;
        draws++;
        totalPoints++;
    }

    public void addDefeat() {
        totalGames++;
        defeats++;
    }

    public String getSummary() {
        return String.format("%s:%d %d %d %d %d"
                , name, totalGames, wins, draws, defeats, totalPoints);
    }
}
