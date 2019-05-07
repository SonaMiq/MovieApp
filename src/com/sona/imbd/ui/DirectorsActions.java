package com.sona.imbd.ui;

import com.sona.imbd.movie.Directors;

public class DirectorsActions {
    public DirectorsActions() {
        Directors.addDirector("Anri", "Verno", "Armenian", "15/10/1920");
        Directors.addDirector("Luc", "Besson", "French", "18/03/1959");
        Directors.addDirector("Juan Antonio","Bayona","Spanish","09/05/1975");
    }

    public void printDirectors() {
        for (int i = 0; i < Directors.directors.size(); i++) {
            System.out.println(Directors.directors.get(i).id + " " + Directors.directors.get(i).name + " " + Directors.directors.get(i).surname);
        }
    }
}
