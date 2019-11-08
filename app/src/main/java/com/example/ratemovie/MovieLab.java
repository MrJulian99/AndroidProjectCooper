package com.example.ratemovie;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

//Este es el singleton que va a contener el ArrayList de peliculas.
public class MovieLab {
    private ArrayList<Movie>  moviesArray;

    private static MovieLab movieLab;
    private Context appContext;


    //Un parametro context nos permite que el singleton inicie actividades, acceda a recursos , ir a el almacenamiento privado de la aplicacion,etc.
    //Simpre se inicializa con el contexto de la app que es el general y nunca muere.
    private MovieLab(Context appContext){
        this.appContext = appContext;
        moviesArray = new ArrayList<Movie>();

        for(int i = 0; i < 100 ; i ++){

            Movie m = new Movie();
            m.setTitle("Inception. Movie # " + i);
            m.setRate("10");
            moviesArray.add(m);

        }
    }

    public static MovieLab get(Context c){

        if(movieLab == null){

            movieLab = new MovieLab(c.getApplicationContext());
        }
        return movieLab;
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
