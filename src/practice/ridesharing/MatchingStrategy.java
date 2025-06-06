package practice.ridesharing;

public interface MatchingStrategy {
    Driver findMatchingDriver(TripMetaData tripMetaData);
}
