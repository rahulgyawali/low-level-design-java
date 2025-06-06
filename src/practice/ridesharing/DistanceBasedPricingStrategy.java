package practice.ridesharing;

public class DistanceBasedPricingStrategy implements PricingStrategy{
    @Override
    public double calculatePrice(TripMetaData tripMetaData) {
        double distance = tripMetaData.getStart().calculateDistance(tripMetaData.getEnd());
        return 100*distance;
    }
}
