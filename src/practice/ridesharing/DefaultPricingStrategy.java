package practice.ridesharing;

public class DefaultPricingStrategy implements PricingStrategy{
    @Override
    public double calculatePrice(TripMetaData tripMetaData) {
        return 100.0;
    }
}
