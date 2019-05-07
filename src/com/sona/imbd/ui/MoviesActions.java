package com.sona.imbd.ui;

import com.sona.imbd.movie.*;

public class MoviesActions {

    public void printMovies() {
        for (int i = 0; i < Movie.movies.size(); i++) {
            System.out.println(Movie.movies.get(i).id + " " + Movie.movies.get(i).title);
        }
    }

    public static void printMovie(Movie movie) {
        String ganre = ganreTypePrint(movie);
        System.out.println(movie.title + " " + movie.description + " Premier date: " + movie.premierDate + " Ganre: " + ganre +" Rating: "+movie.rating+
                "\nFilm actors: "+searchActorByID(movie.actorsID)+"\nFilm directors: "+searchDirectorByID(movie.directorsID)+"\nFilm Writers: "+searchWritersByID(movie.writersID));
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
    private static String searchActorByID(int [] id){
        String actors=" ";
        for (int i = 0; i <id.length ; i++)
           actors+=Actors.actors.get(id[i]).name+ " "+Actors.actors.get(id[i]).surname+" ";
                return actors;
    }
    private static String searchDirectorByID(int [] id){
        String directors=" ";
        for (int i = 0; i <id.length ; i++)
            directors+= Directors.directors.get(id[i]).name+ " "+Directors.directors.get(id[i]).surname+" ";
        return directors;
    }
    private static String searchWritersByID(int [] id){
        String writers=" ";
        for (int i = 0; i <id.length ; i++)
            writers+= Writers.writers.get(id[i]).name+ " "+Writers.writers.get(id[i]).surname+" ";
        return writers;
    }
}
