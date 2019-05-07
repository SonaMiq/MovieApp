package com.sona.imbd.movie;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Actors extends PeopleWorkedForFilm {
    public static ArrayList<Actors> actors = new ArrayList<Actors>();
    public static int counter;
    String nameInFilm;

    Actors(String name, String surname, String nationality, Date dateOfBirth) {
        super(counter, name, surname, nationality, dateOfBirth);
        counter++;
    }

    public static boolean addActor(String name, String surname, String nationality, String dateOfBirth) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = format.parse(dateOfBirth);
            Actors actor = new Actors(name, surname, nationality, date);
            actors.add(actor);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static String searchActorByID(int[] id) {
        String actors = " ";
        for (int i = 0; i < id.length; i++)
            actors += Actors.actors.get(id[i]).name + " " + Actors.actors.get(id[i]).surname + " ";
        return actors;
    }
}

