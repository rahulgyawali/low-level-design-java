package practice.booking;

import java.util.ArrayList;
import java.util.List;

public class Booking {
    Show show;
    List<Seat> seatList;
    Payment payment;
    Booking(){
        seatList = new ArrayList<>();
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
