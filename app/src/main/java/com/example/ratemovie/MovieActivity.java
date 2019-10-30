package com.example.ratemovie;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public class MovieActivity extends FragmentActivity implements fragment_movie.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

    }

    @Override
    public void onAttachFragment(Fragment fragment){

        if(fragment instanceof fragment_movie ){
            fragment_movie fragment_movie = (fragment_movie) fragment;
            fragment_movie.setOnMovieSelectedListener(this);
        }
    }


    @Override
    public void onFragmentInteraction(Movie movie) {

    }
}
