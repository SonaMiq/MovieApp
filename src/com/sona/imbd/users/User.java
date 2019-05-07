package com.sona.imbd.users;

import com.sona.imbd.movie.Movie;
import com.sona.imbd.movie.Series;
import com.sona.imbd.ui.PrintsActions;

import java.util.HashMap;
import java.util.Map;

public class User {

    static Map<String, String> allUsersNames = new HashMap<String, String>();
    String userName;
    String password;

    public boolean userRegister(String userName, String password) {

        if (allUsersNames.containsValue(userName))
            return false; //This name is already existing
        else {
            allUsersNames.put(userName, password);
            return true;
        }
    }


    public boolean userLogin(String userName, String password) {
        if (allUsersNames.get(userName) != null && allUsersNames.get(userName).equals(password))
            return true; //userName existing and password correct
        else {
            return false;//incorrect username or password
        }
    }

    public double rateMovie(int movieID, int rate) {
        double newRating = 0;
        for (int i = 0; i < Movie.movies.size(); i++)
            if (Movie.movies.get(i).id == movieID) {
                Movie.movies.get(i).ratersCount++;
                Movie.movies.get(i).sumRates += rate;
                newRating = Movie.movies.get(i).sumRates / Movie.movies.get(i).ratersCount;
                Movie.movies.get(i).rating = newRating;
            }
        return newRating;
    }

    public void searchMovie(String title) {
        for (int i = 0; i < Movie.movies.size(); i++)
            if (Movie.movies.get(i).title.equals(title))
                PrintsActions.printMovie(Movie.movies.get(i));
    }

    public void searchMovieSeries(int movieId, int seasonId) {
        for (int i = 0; i < Series.series.size(); i++)
            if (Series.series.get(i).movieId == movieId)
                if (Series.series.get(i).seasons == seasonId)
                    PrintsActions.printMovie(Series.series.get(i));
    }
}




