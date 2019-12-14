package com.example.ratemovie;

import android.content.Context;
import android.content.SyncStatusObserver;

import java.util.ArrayList;
import java.util.UUID;

//Este es el singleton que va a contener el ArrayList de peliculas.
public class MovieList {
    private ArrayList<Movie>  moviesArray;

    private static MovieList movieList;
    private Context appContext;


    private int currImage = 0;

    //Un parametro context nos permite que el singleton inicie actividades, acceda a recursos , ir a el almacenamiento privado de la aplicacion,etc.
    //Simpre se inicializa con el contexto de la app que es el general y nunca muere.
    private MovieList(Context appContext){
         /*Integer images[] = {R.drawable.pos0,R.drawable.pos1,R.drawable.pos2,
                R.drawable.pos3,R.drawable.pos4,R.drawable.pos5,R.drawable.pos6,R.drawable.pos7,R.drawable.pos8,
                R.drawable.pos9};*/
        this.appContext = appContext;
        moviesArray = new ArrayList<Movie>();

        for(int i = 0; i < 10 ; i ++){

            Movie m = new Movie();
            m.setTitle("Movie # " + i);
            m.setRate("10");
            /*m.setImage(images[i]);
            System.out.println(m.getImage(i));*/
            moviesArray.add(m);

        }
    }

    public static MovieList get(Context c){

        if(movieList == null){

            movieList = new MovieList(c.getApplicationContext());
        }
        return movieList;
    }

    public  ArrayList<Movie> getMovies(){
        return moviesArray;
    }

    public Movie getMovie(UUID id){
        for (Movie c : moviesArray){

            if(c.getId().equals(id)){
                return c;
            }
        }
        return null;
    }



}
