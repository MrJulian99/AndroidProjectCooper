package com.example.ratemovie;

import androidx.fragment.app.Fragment;

public class MovieListActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return new MovieListFragment();
    }
}
