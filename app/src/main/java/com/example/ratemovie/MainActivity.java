package com.example.ratemovie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button firstButton;
    private static final String TAG ="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        firstButton = (Button) findViewById(R.id.first_button);

       firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this,"Respondee",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, MovieListActivity.class);
                startActivity(i);


                Log.d(TAG, "calling this button", new Exception());








                //Para manejar el back button y dar la informacion de esa actividad al presionarlo.
                //startActivityForResult
                //Onactivityresult
                //TAG:Where my log is coming from.
                //Exception give us the stack
            }
        });

    }
}
