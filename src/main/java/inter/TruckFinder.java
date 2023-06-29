package inter;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class TruckFinder {
    private final ConcurrentHashMap<String, Long> tabelToTruckMap = new ConcurrentHashMap<>();

    public TruckFinder(Map<Long, Long> trucksToDriver, Map<Long, String> driversToTabelNumber) {
        Map<Long, Long> driverToTruckMap = new HashMap<>();
        for (Map.Entry<Long, Long> truckDriver : trucksToDriver.entrySet()) {
            driverToTruckMap.put(truckDriver.getValue(), truckDriver.getKey());
        }


        for (Map.Entry<Long, String> driverTabel : driversToTabelNumber.entrySet()) {
            if (driverToTruckMap.containsKey(driverTabel.getKey())) {
                tabelToTruckMap.put(driverTabel.getValue(), driverToTruckMap.get(driverTabel.getKey()));
            }
        }
    }

    public Optional<Long> findTruckIdByDriversTabelNumber(String tabel) {
        return Optional.ofNullable(tabelToTruckMap.get(tabel));
    }
}
