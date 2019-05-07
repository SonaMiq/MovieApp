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
    }
}
