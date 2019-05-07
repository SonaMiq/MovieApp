package com.sona.imbd.users;

import com.sona.imbd.movie.GanreType;
import com.sona.imbd.movie.Movie;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Admin extends User {


    public boolean addMovie(String title, String description, String premierDate, GanreType ganre, int[] actorsID, int[] directorsID, int[] writersID) {

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = format.parse(premierDate);
            Movie movie = new Movie(title, description, date, ganre, actorsID, directorsID, writersID);
            Movie.movies.add(movie);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void changeMovieDescription(int movieID, String description) {
        for (int i = 0; i < Movie.movies.size(); i++)
            if (Movie.movies.get(i).id == movieID) {
                Movie.movies.get(i).description = description;
            }
    }
}

