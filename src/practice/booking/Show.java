package practice.booking;

import java.util.ArrayList;
import java.util.List;

public class Show {
    String showId;
    Movie movie;
    Screen screen;
    long startTime;
    List<Integer> listOfBookedSeat;

    Show(String id,Movie movie,Screen screen,long time){
        this.showId = id;
        this.movie = movie;
        this.screen = screen;
        this.startTime = time;
        this.listOfBookedSeat = new ArrayList<>();
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public List<Integer> getListOfBookedSeat() {
        return listOfBookedSeat;
    }

    public void setListOfBookedSeat(List<Integer> listOfBookedSeat) {
        this.listOfBookedSeat = listOfBookedSeat;
    }
}
