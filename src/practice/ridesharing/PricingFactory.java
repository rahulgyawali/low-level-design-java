package practice.ridesharing;

public class PricingFactory {

    public PricingStrategy getPricingStrategy(RIDE ride){
        PricingStrategy pricingStrategy;
        if(ride.name().equals(RIDE.SUPREME.name())){
            pricingStrategy = new SupremePricingStrategy();
        } else if (ride.name().equals(RIDE.PREMIUM.name())) {
            pricingStrategy = new PremiumPricingStrategy();
        }else {
            pricingStrategy = new BasicPricingStrategy();
        }
        return pricingStrategy;
    }
}
