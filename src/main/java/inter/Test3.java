package inter;

import java.util.List;

public class Test3 {
    public long findFirstTruck(List<Truck> trucks, int xCargo, int yCargo) {
        double minDistance = Double.MAX_VALUE;
        Long nearestTruckid = null;
        for (Truck t : trucks) {
            double distance = calculateDistanceBetweenPoints(xCargo, yCargo, t.x, t.y);
            if (distance < minDistance) {
                minDistance = distance;
                nearestTruckid = t.id;
            }
        }
        if (nearestTruckid==null){
            throw new IllegalArgumentException(); //todo: Helpful exception message
        }
        return nearestTruckid;
    }

    private double calculateDistanceBetweenPoints(double x1, double y1, double x2, double y2) {
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

    private static class Truck {
        long id;
        double x; //координата по оси x
        double y; //координата по оси y
        double speed; //скорость грузовика
    }
}


