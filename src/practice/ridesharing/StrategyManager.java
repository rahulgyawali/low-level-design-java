package practice.ridesharing;

import designpatterns.behavioral.strategy.with.DrivingStrategy;

public class StrategyManager {
    private static StrategyManager strategyManager = null;
    PricingStrategy pricingStrategy;
    MatchingStrategy matchingStrategy;


    public MatchingStrategy getMatchingStrategy(TripMetaData tripMetaData){
        matchingStrategy = new RatingBasedMatchingStrategy();
        return matchingStrategy;
    }

    public PricingStrategy getPricingStrategy(TripMetaData tripMetaData){
        pricingStrategy = new DistanceBasedPricingStrategy();
        return  pricingStrategy;
    }

    public static StrategyManager getStrategyManager()
    {
        if (strategyManager == null) {
            strategyManager = new StrategyManager();
        }
        return strategyManager;
    }
}
