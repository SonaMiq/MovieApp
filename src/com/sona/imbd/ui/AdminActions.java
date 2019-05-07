package com.sona.imbd.ui;

import com.sona.imbd.movie.GanreType;
import com.sona.imbd.users.Admin;

public class AdminActions {
    public AdminActions() {
        Admin admin = new Admin();
        int[] actors = {0, 1, 2};
        int[] directors = {0};
        int[] writers = {0};
        admin.addMovie("Mayrik", "Film about genocide", "27/11/1991", GanreType.DRAMA, actors, directors, writers);
        int[] actors1 = {4, 5, 6};
        int[] directors1 = {2};
        int[] writers1 = {2, 3};
        admin.addMovie("The Impossible", "Realy story about tourist family in Thailand,which appears " +
                "in 2004 Indias Ocean tsunami", "11/10/2012", GanreType.DRAMA, actors1, directors1, writers1);
        int[] actors2={7,8};
        int[] directors2={3};
        int[] writers2={4,5};
        admin.addMovie("Game of Thrones"," The series chronicles the violent dynastic struggles among the realm's noble " +
                "families for the Iron Throne, while other families fight for independence from it","17/04/2011",GanreType.FANTASY,actors2,directors2,writers2);
        admin.addSerial("The Kingsroad","The long road that snakes throughout Westeros, eventually ending at King's Landing",
                "24/04/2011",GanreType.FANTASY,actors2,directors2,writers2,2,1);
        admin.addSerial("Lord Snow","After the attempted assassination of young Bran, Catelyn leaves for King's Landing to see her husband, convinced that the Lannisters were behind the attempt",
                "24/04/2011",GanreType.FANTASY,actors2,directors2,writers2,2,1);
    }
}
