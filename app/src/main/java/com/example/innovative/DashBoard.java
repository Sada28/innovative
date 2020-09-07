package com.example.innovative;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashBoard extends AppCompatActivity {
    Button btn_math,btn_sci,btn_eng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        /*
        btn_math = findViewById(R.id.btn_term1);

        btn_sci = findViewById(R.id.btn_sci);
        btn_eng=findViewById(R.id.btn_eng);
        btn_math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DashBoard.this,Term.class);
                startActivity(i);

            }
        });
        btn_eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(DashBoard.this,Term.class);
                startActivity(i);
            }
        });

        btn_sci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(DashBoard.this,Term.class);
                startActivity(i);
            }
        });

         */

    }

}