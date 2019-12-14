package com.example.ratemovie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.ListFragment;

import java.util.ArrayList;

public class MovieListFragment extends ListFragment {

    private ArrayList<Movie> movies;

    private Integer images[] = {R.drawable.pos0,R.drawable.pos1,R.drawable.pos2,
            R.drawable.pos3,R.drawable.pos4,R.drawable.pos5,R.drawable.pos6,R.drawable.pos7,R.drawable.pos8,
            R.drawable.pos9};



    private static final String TAG = "MovieListFragment";

    //Con getActivity() obtenemos la actividad que esta hospedando a este fragment
    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.movies_title);
        movies = MovieList.get(getActivity()).getMovies();

       /* ArrayAdapter<Movie> adapter =
                new ArrayAdapter<Movie>(getActivity(),
                                        android.R.layout.simple_list_item_1,
                                        movies);
        setListAdapter(adapter);*/

        MovieAdapter adapter = new MovieAdapter(movies);
        setListAdapter(adapter);


    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        //Movie m = (Movie) (getListAdapter()).getItem(position);
        Movie m = ((MovieAdapter)getListAdapter()).getItem(position);
        //Log.d(TAG, m.getTitle() + "was clicked");

        //Iniciamos MovieActivity
        //Le pasamos como contexto la actividad que hospeda este fragmento
        Intent i = new Intent(getActivity(),MovieActivity.class);
        i.putExtra(MovieFragment.EXTRA_MOVIE_ID,m.getId());
        startActivity(i);
    }

    private class MovieAdapter extends ArrayAdapter<Movie> {

        public MovieAdapter(ArrayList<Movie> movies) {

            super(getActivity(), 0, movies);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // If we weren't given a view, inflate one
            if (convertView == null) {
                convertView = getActivity().getLayoutInflater()
                        .inflate(R.layout.list_item_movie, null);
            }
            // Configure the view for this Movie
            Movie m = getItem(position);
            TextView titleTextView =
                    (TextView) convertView.findViewById(R.id.movie_list_item_titleTextView);
            titleTextView.setText(m.getTitle());

            TextView rateTextView =
                    (TextView) convertView.findViewById(R.id.movie_list_item_rateTextView);
            rateTextView.setText(m.getRate());



            ImageView imageView = (ImageView) convertView.findViewById(R.id.poster);
            imageView.setImageResource(images[position]);
            return convertView;

        }

    }


    @Override
    public void onResume(){

        super.onResume();
        ((MovieAdapter)getListAdapter()).notifyDataSetChanged();

    }

}
