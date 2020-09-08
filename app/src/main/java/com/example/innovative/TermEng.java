package com.example.innovative;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TermEng extends AppCompatActivity {
    Button btn_term1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_term_eng);
        btn_term1=findViewById(R.id.btn_term1);
        btn_term1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TermEng.this,Engmcq1.class));


            }
        });

    }
}