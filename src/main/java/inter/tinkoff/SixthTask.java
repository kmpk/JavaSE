package inter.tinkoff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.lang.Integer.parseInt;

public class SixthTask {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = reader.readLine().split(" ");
            int ghosts = parseInt(input[0]);
            int questions = parseInt(input[1]);

            CreepyCave cave = new CreepyCave(ghosts);
            for (int i = 0; i < questions; i++) {
                input = reader.readLine().split(" ");
                switch (input[0]) {
                    case "1" -> cave.mergeBands(parseInt(input[1]), parseInt(input[2]));
                    case "2" ->
                            System.out.println(cave.isGhostsInSameBand(parseInt(input[1]), parseInt(input[2])) ? "YES" : "NO");
                    case "3" -> System.out.println(cave.getGhostBandCount(Integer.parseInt(input[1])));
                    default -> throw new RuntimeException("Unsupported operation");
                }
            }
        }
    }

    static class CreepyCave {
        int idSequence;
        Map<Integer, GhostBand> bandsMap = new HashMap<>();
        Map<Integer, GhostBandit> ghostsMap = new HashMap<>();

        CreepyCave(int ghosts) {
            idSequence = ghosts + 1;
            for (int i = 1; i <= ghosts; i++) {
                ghostsMap.put(i, new GhostBandit(i));
                bandsMap.put(i, new GhostBand(i));
            }
        }

        void mergeBands(int firstBanditId, int secondBanditId) {
            int firstBandId = ghostsMap.get(firstBanditId).currentBandId;
            int secondBandId = ghostsMap.get(secondBanditId).currentBandId;
            if (firstBandId == secondBandId) {
                return;
            }

            GhostBand firstBand = bandsMap.remove(firstBandId);
            GhostBand secondBand = bandsMap.remove(secondBandId);
            GhostBand mergedBand = firstBand.merge(secondBand, idSequence);
            bandsMap.put(idSequence, mergedBand);
            mergedBand.banditsId.forEach(id -> {
                GhostBandit ghostBandit = ghostsMap.get(id);
                ghostBandit.currentBandId = idSequence;
                ghostBandit.bandsCount++;
            });
            idSequence++;
        }

        boolean isGhostsInSameBand(int firstGhostId, int secondGhostId) {
            return ghostsMap.get(firstGhostId).currentBandId == ghostsMap.get(secondGhostId).currentBandId;
        }

        int getGhostBandCount(int ghostId) {
            return ghostsMap.get(ghostId).bandsCount;
        }
    }

    private static class GhostBand {
        int id;
        Set<Integer> banditsId;

        GhostBand(int banditId) {
            this.banditsId = new HashSet<>();
            this.id = banditId;
            banditsId.add(banditId);
        }

        GhostBand(Set<Integer> banditsId, int newId) {
            this.banditsId = banditsId;
            this.id = newId;
        }

        GhostBand merge(GhostBand other, int newId) {
            banditsId.addAll(other.banditsId);
            return new GhostBand(banditsId, newId);
        }
    }

    private static class GhostBandit {
        int id;
        int bandsCount = 1;
        int currentBandId;

        private GhostBandit(int id) {
            this.id = id;
            currentBandId = id;
        }
    }
}
