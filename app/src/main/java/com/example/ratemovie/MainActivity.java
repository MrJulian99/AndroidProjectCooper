package com.example.ratemovie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button firstButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        firstButton = (Button) findViewById(R.id.first_button);

       firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this,"Respondee",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, MovieActivity.class);
                startActivity(i);

            }
        });

    }
}
