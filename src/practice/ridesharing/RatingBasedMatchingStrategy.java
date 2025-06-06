package practice.ridesharing;

public class RatingBasedMatchingStrategy implements MatchingStrategy{
    @Override
    public Driver findMatchingDriver(TripMetaData tripMetaData) {
        DriverManager driverManager = DriverManager.getDriverManager();
        for(Driver driver:driverManager.driverMap.values()){
            System.out.println("Driver for rating "+tripMetaData.getRiderRating()+" with "+driver.getRating());
            if(driver.getRating() >= tripMetaData.getRiderRating()){
                return driver;
            }
        }
        return null;
    }
}
