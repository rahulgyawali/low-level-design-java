package practice.ridesharing;

public class Driver {
    double rating;
    int id;

    Driver(double rating,int id){
        this.rating  =rating;
        this.id = id;
    }
    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
