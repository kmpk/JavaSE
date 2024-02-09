package inter.tinkoff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FifthTask {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = reader.readLine().split(" ");
            LandMap map = new LandMap(Integer.parseInt(input[0]));
            int roads = Integer.parseInt(input[1]);
            int minLength = Integer.MAX_VALUE;
            int maxLength = Integer.MIN_VALUE;
            for (int i = 0; i < roads; i++) {
                input = reader.readLine().split(" ");
                int firstCityId = Integer.parseInt(input[0]);
                int secondCityId = Integer.parseInt(input[1]);
                int length = Integer.parseInt(input[2]);
                minLength = Math.min(minLength, length);
                maxLength = Math.max(maxLength, length);
                map.addRoad(firstCityId, secondCityId, length);
            }
            System.out.println(solve(map, minLength, maxLength));
        }
    }


    static int solve(LandMap map, int minLength, int maxLength) {
        int statesCount = map.countStatesIgnoringRoadsUpTo(0);
        int left = minLength;
        int right = maxLength;
        int lastCorrectLength = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            int statesUsingCurrentLength = map.countStatesIgnoringRoadsUpTo(mid);
            if (statesUsingCurrentLength == statesCount) {
                left = mid+1;
                lastCorrectLength = mid;
            } else {
                right = mid-1;
            }
        }
        return lastCorrectLength;
    }

    static class LandMap {
        Map<Integer, City> cityMap = new HashMap<>();
        int visitIndex;

        LandMap(int cities) {
            for (int i = 1; i <= cities; i++) {
                cityMap.put(i, new City(i));
            }
        }

        void addRoad(int firstCityId, int secondCityId, int length) {
            Road road = new Road(firstCityId, secondCityId, length);
            cityMap.get(firstCityId).addRoad(road);
            cityMap.get(secondCityId).addRoad(road);
        }

        int countStatesIgnoringRoadsUpTo(int lengthToIgnore) {
            Queue<City> visitQueue = new LinkedList<>();
            int states = 0;
            for (City city : cityMap.values()) {
                if (city.visitedIndex != visitIndex) {
                    states++;
                    visitQueue.add(city);
                    visitCities(visitQueue, lengthToIgnore);
                }
            }
            visitIndex++;
            return states;
        }

        private void visitCities(Queue<City> visitQueue, int lengthToIgnore) {
            while (!visitQueue.isEmpty()) {
                City currentCity = visitQueue.poll();
                if (currentCity.visitedIndex == visitIndex) {
                    continue;
                }
                currentCity.visitedIndex = visitIndex;
                for (Road road : currentCity.roadSet) {
                    if (road.length > lengthToIgnore) {
                        int toVisitId = currentCity.id == road.firstCityId ? road.secondCityId : road.firstCityId;
                        City toVisitCity = cityMap.get(toVisitId);
                        visitQueue.add(toVisitCity);
                    }
                }
            }
        }
    }

    private static class City {
        int id;
        int visitedIndex = -1;
        Set<Road> roadSet = new HashSet<>();

        private City(int id) {
            this.id = id;
        }

        private void addRoad(Road road) {
            roadSet.add(road);
        }
    }

    private static class Road {
        int firstCityId;
        int secondCityId;
        int length;

        private Road(int firstCityId, int secondCityId, int length) {
            this.firstCityId = firstCityId;
            this.secondCityId = secondCityId;
            this.length = length;
        }
    }
}
