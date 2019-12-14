package com.example.ratemovie;

import android.media.Image;

import java.util.Arrays;
import java.util.UUID;

public class Movie extends Object {


    private UUID id;
    private String title;
    private String rate;
    private Integer images[];
    private int position;
    private int imgNumber;


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

    public Integer[] getImages(int position) {
        return images;
    }

    public void setImages(Integer[] images) {
        this.images = images;
    }

    public void  setImage(int imgNumber){

        this.imgNumber = imgNumber;
    }

    public int  getImage(int position){

        return position;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", rate='" + rate + '\'' +
                ", images=" + Arrays.toString(images) +
                '}';
    }

    public boolean isSolved() {
        return true;
    }
}
