package inter;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class PacketFilter {
    Map<Integer, Instant> trackMeasurementMap = new HashMap<>();

    public void receiveCoordinates(int truckId, int x, int y, Instant measurementTime) {
        if (trackMeasurementMap.containsKey(truckId)) {
            Instant lastMeasurement = trackMeasurementMap.get(truckId);
            if (lastMeasurement.isAfter(measurementTime)) {
                return;
            }
        }
        trackMeasurementMap.put(truckId, measurementTime);
        processCoordinates(truckId, x, y, measurementTime);
    }

    public void processCoordinates(int truckId, int x, int y, Instant measurementTime) {
        System.out.println("Пришел пакет " + truckId + " " + x + " " + y + " " + measurementTime);
    }
}
