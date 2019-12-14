package com.example.ratemovie;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import java.util.UUID;

public class MovieFragment extends Fragment {

    private Movie mMovie;
    private EditText mTitleField;
    //public CharSequence s;
    //public  CharSequence s;

    public static final String EXTRA_MOVIE_ID = "com.example.ratemovie.movie_id";

    private Button rateButton;

  // Context context = getActivity().getApplicationContext();
    CharSequence text = "Thank you!,Now You can come back to the Home screen!";
    int duration = Toast.LENGTH_SHORT;

    @Override
    public void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            //mMovie = new Movie();
          UUID movieId = (UUID)getActivity().getIntent().getSerializableExtra(EXTRA_MOVIE_ID);
          mMovie = MovieList.get(getActivity()).getMovie(movieId);







    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){

            View v = inflater.inflate(R.layout.fragment_movie,parent,false);

        mTitleField = v.findViewById(R.id.movie_rate);
        //mTitleField.setText(mMovie.getRate());

        rateButton = v.findViewById(R.id.fragment_button);








        mTitleField.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                //mMovie.setTitle(s.toString());
                //mMovie.setRate(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                   final CharSequence news = s;


                rateButton.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        mMovie.setRate(news.toString());
                        Toast toast = Toast.makeText(getContext(), text,duration);
                        toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_HORIZONTAL, 0, -200);
                        toast.show();
                    }
                });

                           }
        });

            return v;
    }
}
