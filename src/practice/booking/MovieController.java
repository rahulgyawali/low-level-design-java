package practice.booking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    List<Movie> movieList;
    Map<City,List<Movie>> cityMovieMap;

    MovieController(){
        movieList = new ArrayList<>();
        cityMovieMap = new HashMap<>();
    }

    void addMovie(Movie movie,City city){
        movieList.add(movie);
        if(!cityMovieMap.containsKey(city)){
            cityMovieMap.put(city,new ArrayList<>());
        }
        cityMovieMap.get(city).add(movie);
    }

    Movie getMovieByTitle(String title){
        for(Movie movie: movieList){
            if(movie.movieTitle.equals(title)){
                return movie;
            }
        }
        return null;
    }

    List<Movie> getMoviesByLocation(City city){
        return cityMovieMap.get(city);
    }
}
