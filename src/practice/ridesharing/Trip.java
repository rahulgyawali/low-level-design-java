package practice.ridesharing;

public class Trip {

    PricingFactory pricingFactory;
    PricingStrategy pricingStrategy;

    int id;
    Driver driver;
    Rider rider;
    Location start;
    Location end;
    double price;
    double distance;
    Status status;

    public Trip(Driver driver,Rider rider,Location start, Location end,RIDE ride){
        this.id = (int)System.currentTimeMillis()%Integer.MAX_VALUE;
        this.driver = driver;
        this.rider = rider;
        this.start = start;
        this.end = end;
        this.distance = calculateDistance(start,end);
        this.pricingStrategy = pricingFactory.getPricingStrategy(ride);
        this.price = pricingStrategy.price(distance);
        this.status = Status.IN_PROGRESS;
    }

    public double calculateDistance(Location start,Location end){
        double latDiff = Math.abs(start.lat-end.lat);
        double lonDiff = Math.abs(end.log - start.log);
        return (latDiff+lonDiff)*2.5;
    }

}
