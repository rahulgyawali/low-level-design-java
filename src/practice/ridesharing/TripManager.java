package practice.ridesharing;

import java.util.HashMap;
import java.util.Map;

public class TripManager {
    static TripManager tripManager = null;
    StrategyManager strategyManager;
    Map<Integer,Trip> tripMap = new HashMap<>();
    Map<Integer,TripMetaData> tripMetaDataMap = new HashMap<>();

    public static TripManager getTripManager() {
        if(tripManager == null){
            tripManager = new TripManager();
        }
        return tripManager;
    }

    //Start with rider
    void createTrip(Rider rider,Location start,Location end){
        //Create Meta Data
        TripMetaData tripMetaData = new TripMetaData();
        tripMetaData.setStart(start);
        tripMetaData.setEnd(end);
        tripMetaData.setRiderRating(rider.getRating());

        //Choose Strategy
        strategyManager = StrategyManager.getStrategyManager();
        //Choose Pricing Strategy
        PricingStrategy pricingStrategy = strategyManager.getPricingStrategy(tripMetaData);
        //Choose Matching Strategy
        MatchingStrategy matchingStrategy = strategyManager.getMatchingStrategy(tripMetaData);

        //STEP 1: match driver
        Driver driver = matchingStrategy.findMatchingDriver(tripMetaData);
        tripMetaData.setDriverRating(driver.getRating());

        //STEP 2: calculate price
        double price = pricingStrategy.calculatePrice(tripMetaData);

        //Create Trip
        Trip trip = new Trip(rider.id,driver,rider,start,end,price);
        tripMap.put(rider.getId(), trip);
        tripMetaDataMap.put(rider.getId(), tripMetaData);
    }

    public void showTrips(){
        for(Trip trip:tripMap.values()){
            System.out.println("Trip -> Id: "+trip.id+" Rider: "+trip.rider.getId()+" Driver: "+trip.driver.id + " Price: "+trip.price);
        }
    }
}
