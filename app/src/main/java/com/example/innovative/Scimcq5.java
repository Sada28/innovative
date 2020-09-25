package com.example.innovative;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Scimcq5 extends AppCompatActivity {
    ImageView Opt1,Opt2,Opt3,Opt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scimcq5);

        Opt1 = findViewById(R.id.Opt1);
        Opt2 = findViewById(R.id.Opt2);
        Opt3 = findViewById(R.id.Opt3);
        Opt4 = findViewById(R.id.Opt4);

        Opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Opt1.setImageResource(R.drawable.redcross);
            }
        });

        Opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Opt2.setImageResource(R.drawable.redcross);
            }
        });

        Opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Opt3.setImageResource(R.drawable.redcross);
            }
        });

        Opt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Opt4.setImageResource(R.drawable.redcircle);
            }
        });
    }
}