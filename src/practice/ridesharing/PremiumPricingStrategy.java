package practice.ridesharing;

public class PremiumPricingStrategy extends PricingStrategy{
    @Override
    public double price(double distance) {
        return 20.5*distance;
    }
}
