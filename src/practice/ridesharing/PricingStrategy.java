package practice.ridesharing;

public interface  PricingStrategy {
    public  double calculatePrice(TripMetaData tripMetaData);
}
