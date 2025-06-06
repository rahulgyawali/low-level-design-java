package practice.ridesharing;

import java.util.HashMap;
import java.util.Map;

public class DriverManager {
    private static DriverManager driverManager = null;
    Map<Integer,Driver> driverMap = new HashMap<>();

    public void addRider(int driverId,Driver driver){
        this.driverMap.put(driverId,driver);
    }

    public Driver getDriver(int driverId){
        return this.driverMap.get(driverId);
    }

    public static DriverManager getDriverManager()
    {
        if (driverManager == null) {
            driverManager = new DriverManager();
        }
        return driverManager;
    }
}
