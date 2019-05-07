package com.sona.imbd;

import com.sona.imbd.ui.ActorsActions;
import com.sona.imbd.ui.AdminActions;
import com.sona.imbd.ui.DirectorsActions;
import com.sona.imbd.ui.WritersActions;
import com.sona.imbd.users.User;

public class Main {
    public static void main(String[] args) {
        new ActorsActions();
        new DirectorsActions();
        new WritersActions();
        new AdminActions();
        User user = new User();
        // user.rateMovie(1, 5);
        // user.rateMovie(1, 4);
        // user.rateMovie(1, 5);
        // user.rateMovie(1, 5);
        // user.searchMovie("The Impossible");
        //  Admin admin = new Admin();
        //  admin.changeMovieDescription(0, "Mayrik(Mother) is a 1991 semi-autobiographical film written and directed by French-Armenian filmmaker Henri Verneuil. " +
        //   " It is about the struggles of an Armenian family that emigrates to France from Turkey after the Armenian Genocide of 1915.");
        // user.rateMovie(0, 5);
        // user.searchMovie("Mayrik");
        user.searchMovieSeries(2, 1);
    }
}
