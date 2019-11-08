package com.example.ratemovie;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import java.util.UUID;

public class MovieFragment extends Fragment {

    private Movie mMovie;
    private EditText mTitleField;

    public static final String EXTRA_MOVIE_ID = "com.example.ratemovie.movie_id";

    @Override
    public void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            //mMovie = new Movie();
          UUID movieId = (UUID)getActivity().getIntent().getSerializableExtra(EXTRA_MOVIE_ID);
          mMovie = MovieLab.get(getActivity()).getMovie(movieId);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){

            View v = inflater.inflate(R.layout.fragment_movie,parent,false);

        mTitleField = v.findViewById(R.id.movie_rate);
        mTitleField.setText(mMovie.getRate());
        mTitleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                mMovie.setTitle(s.toString());

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

            return v;
    }
}
