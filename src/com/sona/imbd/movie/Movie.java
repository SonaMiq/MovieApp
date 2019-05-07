package com.sona.imbd.movie;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Movie {
    public static ArrayList<Movie> movies = new ArrayList<Movie>();
    static int counter;
    public int id;
    public String title;
    public String description;
    public double rating;
    public Date premierDate;
    public GanreType ganre;
    public int[] actorsID;
    public int[] directorsID;
    public int[] writersID;

    public Movie(String title, String description, Date premierDate, GanreType ganre, int[] actorsID, int[] directorsID, int[] writersID) {
        this.rating=5;
        this.title = title;
        this.description = description;
        this.premierDate = premierDate;
        this.ganre = ganre;
        this.actorsID = actorsID;
        this.directorsID = directorsID;
        this.writersID = writersID;
        this.id=counter;
        counter++;
    }
}
