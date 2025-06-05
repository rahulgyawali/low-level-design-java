package practice.booking;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class BookMyShow {
    MovieController movieController;
    TheaterController theaterController;

    BookMyShow(){
        movieController = new MovieController();
        theaterController = new TheaterController();
    }

    private void show(){
       theaterController.showTheaters();
    }

    private void createMovies(){
        Movie movie1 = new Movie(1,"MI3");
        Movie movie2 = new Movie(1,"EYE");
        movieController.addMovie(movie1,City.DALLAS);
        movieController.addMovie(movie2,City.LA);
        movieController.addMovie(movie1,City.DALLAS);
    }

    private void createTheaters(){
        Theater theater1 = new Theater("AA1","IMAX",City.DALLAS);
        Theater theater2 = new Theater("AB1","IMAX",City.LA);

        Seat seat1= new Seat();
        seat1.setSeatId(5);
        Seat seat2= new Seat();
        seat2.setSeatId(5);
        Seat seat3= new Seat();
        seat3.setSeatId(5);

        Screen screen1 = new Screen(10);
        screen1.getSeatList().add(seat1);
        Screen screen2 = new Screen(20);
        screen2.getSeatList().add(seat2);
        Screen screen3 = new Screen(30);
        screen3.getSeatList().add(seat3);

        Show show1 = new Show("SHOW1",movieController.getMovieByTitle("MI3"),screen1,1600);
        Show show2 = new Show("SHOW2",movieController.getMovieByTitle("EYE"),screen2,1500);
        Show show3 = new Show("SHOW3",movieController.getMovieByTitle("EYE"),screen3,1100);

        theater1.screenList.add(screen1);
        theater2.screenList.add(screen2);
        theater1.screenList.add(screen3);

        theater1.showList.add(show1);
        theater2.showList.add(show2);
        theater1.showList.add(show3);

        theaterController.addTheater(City.DALLAS,theater1);
        theaterController.addTheater(City.LA,theater2);
    }

    public void createBooking(City city,String movieName){
        //1. Find Movies in city
        List<Movie> movieList = movieController.getMoviesByLocation(city);
        Movie movie = null;
        //2. Find movie interested
        for(Movie movie1:movieList){
            if(movie1.movieTitle.equals(movieName)){
                movie =movie1;
                break;
            }
        }
        if(null == movie){
            System.out.println("Not available in this city");
            return;
        }
        //3. Find Theaters for City and Movie
        Map<Theater,List<Show>> allShows = theaterController.getAllShows(city,movie);
        //4. Choose a show
        Map.Entry<Theater,List<Show>> entry = allShows.entrySet().iterator().next();
        Show show = entry.getValue().get(0);
        //5. Select Seat
        int seatNumber = 5;
        List<Integer> bookedSeats = show.getListOfBookedSeat();
        if(!bookedSeats.contains(seatNumber)){
            //6. Start Booking
            //Add to booked seat
            show.getListOfBookedSeat().add(seatNumber);
            Booking booking = new Booking();
            List<Seat> seatList = new ArrayList<>();
            for(Seat available : show.getScreen().getSeatList()){
                if(available.seatId == seatNumber){
                    seatList.add(available);
                }
            }
            //Remove from booked screen
            show.getScreen().removeSeatId(seatNumber);
            booking.setShow(show);
            booking.setSeatList(seatList);
            System.out.println("Booked for "+booking.getShow().startTime+" hours  "+booking.getShow().movie.movieTitle+" in "+booking.getSeatList().get(0).getSeatCategory().name());
        }else{
            System.out.println("***** Seat Not available! ***************");
            return;
        }
        System.out.println("######## Booking Successful ###################");
    }


    public void init(){
        createMovies();
        createTheaters();
        show();
    }

    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.init();
        bookMyShow.createBooking(City.DALLAS,"MI3");
        bookMyShow.createBooking(City.DALLAS,"MI3");
        bookMyShow.show();
    }

}
