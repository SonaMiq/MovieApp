package com.sona.imbd.movie;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directors extends PeopleWorkedForFilm {
    public static ArrayList<Directors> directors = new ArrayList<Directors>();
    public static int counter;
    String nameInFilm;

    Directors(String name, String surname, String nationality, Date dateOfBirth) {
        super(counter, name, surname, nationality, dateOfBirth);
        counter++;
    }

    public static boolean addDirector(String name, String surname, String nationality, String dateOfBirth) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = format.parse(dateOfBirth);
            Directors director = new Directors(name, surname, nationality, date);
            directors.add(director);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static String searchDirectorByID(int[] id) {
        String directors = " ";
        for (int i = 0; i < id.length; i++)
            directors += Directors.directors.get(id[i]).name + " " + Directors.directors.get(id[i]).surname + " ";
        return directors;
    }
}
