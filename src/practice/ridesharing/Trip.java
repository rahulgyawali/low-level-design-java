package practice.ridesharing;

import designpatterns.behavioral.strategy.with.DrivingStrategy;

public class Trip {

    int id;
    Driver driver;
    Rider rider;
    Location start;
    Location end;
    Status status;
    double price;

    public Trip(int id,Driver driver,Rider rider,Location start, Location end,double price){
        this.id = id;
        this.driver = driver;
        this.rider = rider;
        this.start = start;
        this.end = end;
        this.status = Status.IN_PROGRESS;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "id=" + id +
                ", driver=" + driver +
                ", rider=" + rider +
                ", start=" + start +
                ", end=" + end +
                ", status=" + status +
                ", price=" + price +
                '}';
    }
}
