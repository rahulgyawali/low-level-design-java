package practice.booking;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    String theaterId;
    String theaterName;
    City city;
    List<Screen> screenList;
    List<Show> showList;
    Theater(String id,String name,City city){
        this.theaterId  =id;
        this.theaterName = name;
        this.city = city;
        screenList = new ArrayList<>();
        showList = new ArrayList<>();
    }

    public String getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(String theaterId) {
        this.theaterId = theaterId;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Screen> getScreenList() {
        return screenList;
    }

    public void setScreenList(List<Screen> screenList) {
        this.screenList = screenList;
    }

    public List<Show> getShowList() {
        return showList;
    }

    public void setShowList(List<Show> showList) {
        this.showList = showList;
    }
}
