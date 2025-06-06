package practice.ridesharing;

public class Location {
    int lat;
    int log;
    Location(int lat,int lon){
        this.lat = lat;
        this.log = lon;
    }

    public double calculateDistance(Location location){
        double latDiff = Math.abs(this.lat-location.lat);
        double lonDiff = Math.abs(this.log-location.log);
        return (latDiff+lonDiff)*2.5;
    }
}
