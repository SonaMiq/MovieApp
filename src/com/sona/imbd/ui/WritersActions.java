package com.sona.imbd.ui;

import com.sona.imbd.movie.Writers;

public class WritersActions {
    public WritersActions() {
        Writers.addWriter("Anri", "Verno", "Armenian", "15/10/1920");
        Writers.addWriter("Kventin", "Tarantino", "American", "27/03/1963");
        Writers.addWriter("Maria","Belon","Spanish","04/07/1966");
        Writers.addWriter("Sergio","Sanches","Spanish","05/05/1973");
    }

    public void printWriters() {
        for (int i = 0; i < Writers.writers.size(); i++) {
            System.out.println(Writers.writers.get(i).id + " " + Writers.writers.get(i).name + " " + Writers.writers.get(i).surname);
        }
    }
}

