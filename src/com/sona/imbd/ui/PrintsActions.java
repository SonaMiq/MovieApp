package com.sona.imbd.ui;

import com.sona.imbd.movie.Actors;
import com.sona.imbd.movie.Directors;
import com.sona.imbd.movie.Movie;
import com.sona.imbd.movie.Writers;

public class PrintsActions {

    public static void printActors() {
        for (int i = 0; i < Actors.actors.size(); i++) {
            System.out.println(Actors.actors.get(i).id + " " + Actors.actors.get(i).name + " " + Actors.actors.get(i).surname);
        }
    }

    public static void printDirectors() {
        for (int i = 0; i < Directors.directors.size(); i++) {
            System.out.println(Directors.directors.get(i).id + " " + Directors.directors.get(i).name + " " + Directors.directors.get(i).surname);
        }
    }

    public static void printWriters() {
        for (int i = 0; i < Writers.writers.size(); i++) {
            System.out.println(Writers.writers.get(i).id + " " + Writers.writers.get(i).name + " " + Writers.writers.get(i).surname);
        }
    }

    public static void printMovie(Movie movie) {
        String ganre = ganreTypePrint(movie);
        System.out.println(movie.title + ": " + movie.description + " Premier date: " + movie.premierDate + " Ganre: " + ganre + " Rating: " + movie.rating +
                "\nFilm actors: " + Actors.searchActorByID(movie.actorsID) + "\nFilm directors: " + Directors.searchDirectorByID(movie.directorsID) + "\nFilm Writers: " + Writers.searchWritersByID(movie.writersID));
    }

    private static String ganreTypePrint(Movie movie) {
        String ganre = null;
        switch (movie.ganre) {
            case DRAMA:
                ganre = "Drama";
                break;
            case ACTION:
                ganre = "Action";
                break;
            case COMEDY:
                ganre = "Comedy";
                break;
            case FANTASY:
                ganre = "Fantasy";
                break;
            case HISTORICAL:
                ganre = "Historical";
                break;
            default:
                break;
        }
        return ganre;
    }
}

