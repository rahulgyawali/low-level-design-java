package practice.ridesharing;

public class DefaultMatchingStrategy implements MatchingStrategy{
    @Override
    public Driver findMatchingDriver(TripMetaData tripMetaData) {
        DriverManager driverManager = DriverManager.getDriverManager();
        return driverManager.getDriver(0);
    }
}
