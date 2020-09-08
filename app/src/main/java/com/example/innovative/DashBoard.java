package com.example.innovative;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashBoard extends AppCompatActivity {
    Button btn_math,btn_eng,btn_hindi,btn_mar,btn_com,btn_sci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        btn_math=findViewById(R.id.btn_math);
        btn_eng=findViewById(R.id.btn_eng);
        btn_hindi=findViewById(R.id.btn_hindi);
        btn_mar=findViewById(R.id.btn_mar);
        btn_com=findViewById(R.id.btn_com);
        btn_sci=findViewById(R.id.btn_sci);

        btn_math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(DashBoard.this, TermMath.class);
                startActivity(i);
            }
        });
        btn_eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(DashBoard.this, TermEng.class);
                startActivity(i);
            }
        });
        btn_hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(DashBoard.this, TermHindi.class);
                startActivity(i);
            }
        });
        btn_mar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(DashBoard.this, TermMar.class);
                startActivity(i);
            }
        });
        btn_com.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(DashBoard.this, TermCom.class);
                startActivity(i);
            }
        });
        btn_sci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(DashBoard.this, TermSci.class);
                startActivity(i);
            }
        });


    }
}