package com.sona.imbd.users;

import com.sona.imbd.movie.Movie;
import com.sona.imbd.ui.MoviesActions;

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

    public void rateMovie(int movieID, int rate) {
        for (int i = 0; i < Movie.movies.size(); i++)
            if (Movie.movies.get(i).id == movieID) {
                Movie.movies.get(i).rating = (Movie.movies.get(i).rating + rate) / 2;
            }
    }

    public void searchMovie(String title) {
        for (int i = 0; i < Movie.movies.size(); i++)
            if (Movie.movies.get(i).title.equals(title))
                MoviesActions.printMovie(Movie.movies.get(i));
    }
}



