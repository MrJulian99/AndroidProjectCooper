package com.example.ratemovie;

import java.util.UUID;

public class Movie extends Object {

    private UUID id;
    private String title;
    private String rate;

    public Movie(){

        id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Title='" + title + '\'' +
                ", rate='" + rate + '\'' ;
    }

    public boolean isSolved() {
        return true;
    }
}
