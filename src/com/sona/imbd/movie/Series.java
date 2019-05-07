package com.sona.imbd.movie;

import java.util.ArrayList;
import java.util.Date;

public class Series extends Movie {
    public static ArrayList<Series> series = new ArrayList<Series>();
    public int seasons;
    public int movieId;

    public Series(String title, String description, Date premierDate, GanreType ganre, int[] actorsID, int[] directorsID, int[] writersID, int seasons, int movieId) {
        super(title, description, premierDate, ganre, actorsID, directorsID, writersID);
        this.movieId = movieId;
        this.seasons = seasons;
    }
}
