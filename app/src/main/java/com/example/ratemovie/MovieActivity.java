package com.example.ratemovie;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

//public class MovieActivity extends FragmentActivity {
/*@Override
protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);

        if(fragment == null){
        fragment = new MovieFragment();
        fm.beginTransaction().add(R.id.fragmentContainer , fragment).commit();
        }
        }
        }*/

public class MovieActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new MovieFragment();
    }
}
