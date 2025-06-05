package practice.booking;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Screen {
    String screenId;
    List<Seat> seatList;
    int capacity;
    Screen(int capacity){
        this.seatList = new ArrayList<>();
        this.capacity = capacity;
    }

    public String getScreenId() {
        return screenId;
    }

    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void removeSeatId(int seatId){
       seatList = seatList.stream().filter((x)->x.getSeatId() != seatId).collect(Collectors.toList());
    }
}
