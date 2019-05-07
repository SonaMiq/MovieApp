package com.sona.imbd.movie;

import java.util.Date;

public abstract class PeopleWorkedForFilm {

    public  int id;
    public String name;
    public String surname;
    public String nationality;
    public Date dateOfBirth;

    PeopleWorkedForFilm(int counter,String name, String surname, String nationality, Date dateOfBirth) {
        this.id=counter;
        this.name = name;
        this.surname = surname;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
    }
}




