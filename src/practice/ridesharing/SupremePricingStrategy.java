package practice.ridesharing;

public class SupremePricingStrategy extends PricingStrategy{
    @Override
    public double price(double distance) {
        return 30.5*distance;
    }
}
