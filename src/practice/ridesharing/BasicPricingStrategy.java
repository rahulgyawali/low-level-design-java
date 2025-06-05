package practice.ridesharing;

public class BasicPricingStrategy extends PricingStrategy{
    @Override
    public double price(double distance){
        return 15.5*distance;
    }
}
