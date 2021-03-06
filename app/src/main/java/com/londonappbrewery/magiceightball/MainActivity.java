package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView balldisplay = (ImageView)findViewById(R.id.ballimage);
        Button QButton = (Button)findViewById(R.id.askbutton);

        //Assign Ball response images to an array
        final int [] ballarray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        //Set Ask Button to get random image from array with random number generator
        QButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random genrandomnumber = new Random();
                int number = genrandomnumber.nextInt(4);
                Log.d("CHARLIES DEBUG","My random number is "+number);
                balldisplay.setImageResource(ballarray[number]);}
        });
    }}

