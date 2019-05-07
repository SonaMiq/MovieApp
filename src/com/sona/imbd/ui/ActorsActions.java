package com.sona.imbd.ui;

import com.sona.imbd.movie.Actors;

public class ActorsActions {
    public ActorsActions() {
        Actors.addActor("Claudia", "Kardenale", "Italian", "15/04/1938");
        Actors.addActor("Omar", "Sharif", "Egyptian", "10/04/1932");
        Actors.addActor("Rishar", "Bary", "French", "31/07/1950");
        Actors.addActor("Nikol", "Kidman", "Australian", "20/06/1967");
        Actors.addActor("Naomi", "Watts", "Englishman", "28/09/1968");
        Actors.addActor("Ewan", "McGregor", "Englishman", "31/03/1971");
        Actors.addActor("Tom", "Holland", "Englishman", "01/06/1996");
    }

    public void printActors() {
        for (int i = 0; i < Actors.actors.size(); i++) {
            System.out.println(Actors.actors.get(i).id + " " + Actors.actors.get(i).name + " " + Actors.actors.get(i).surname);
        }
    }
}
