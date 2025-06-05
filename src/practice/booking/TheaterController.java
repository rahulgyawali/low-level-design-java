package practice.booking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheaterController {
    Map<City, List<Theater>>  cityTheaterMapping;
    List<Theater> theaterList;

    TheaterController(){
        this.theaterList = new ArrayList<>();
        this.cityTheaterMapping =  new HashMap<>();
    }

    public void addTheater(City city, Theater theater){
        theaterList.add(theater);
        if(!cityTheaterMapping.containsKey(city)){
            cityTheaterMapping.put(city,new ArrayList<>());
        }
        cityTheaterMapping.get(city).add(theater);
    }

    public void showTheaters(){
        for(Map.Entry<City,List<Theater>> entry:cityTheaterMapping.entrySet()){
            System.out.println("<< City: "+entry.getKey()+ " >>");
            System.out.println("\tTheaters:");
            for(Theater theater: entry.getValue()){
                System.out.println("\t\t"+theater.theaterName+" "+theater.theaterId);
                System.out.println("\t\t\tShows:");
                for(Show show: theater.getShowList()){
                    System.out.println("\t\t\t\t"+show.showId+" "+ show.getMovie().movieTitle+" "+show.getStartTime()+" - Booked: "+show.getListOfBookedSeat().size()+" Available: "+show.getScreen().getSeatList().size());
                }
            }
        }
    }

    public Map<Theater,List<Show>> getAllShows(City city,Movie movie){
        Map<Theater,List<Show>> map = new HashMap<>();
        List<Theater> theaters = cityTheaterMapping.get(city);
        for(Theater theater:theaters){
            List<Show> temp = new ArrayList<>();
            for(Show show:theater.getShowList()){
                if(show.movie.movieTitle.equals(movie.getMovieTitle())){
                    temp.add(show);
                }
            }
            map.put(theater,temp);
        }
        return map;
    }
}
