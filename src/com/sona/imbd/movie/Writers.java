package com.sona.imbd.movie;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Writers extends PeopleWorkedForFilm {
    public static ArrayList<Writers> writers = new ArrayList<Writers>();
    public static int counter;
    String nameInFilm;

    Writers(String name, String surname, String nationality, Date dateOfBirth) {
        super(counter,name, surname, nationality, dateOfBirth);
        counter++;
    }

    public static boolean addWriter(String name, String surname, String nationality, String dateOfBirth) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = format.parse(dateOfBirth);
            Writers writer = new Writers(name, surname, nationality, date);
            writers.add(writer);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

