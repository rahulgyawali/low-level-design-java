package practice.ridesharing;

public class TripMetaData {
    Location start;
    Location end;
    double driverRating;
    double riderRating;

    public Location getStart() {
        return start;
    }

    public void setStart(Location start) {
        this.start = start;
    }

    public Location getEnd() {
        return end;
    }

    public void setEnd(Location end) {
        this.end = end;
    }

    public double getDriverRating() {
        return driverRating;
    }

    public void setDriverRating(double driverRating) {
        this.driverRating = driverRating;
    }

    public double getRiderRating() {
        return riderRating;
    }

    public void setRiderRating(double riderRating) {
        this.riderRating = riderRating;
    }
}
