package com.example.innovative;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class Mcq1 extends AppCompatActivity {
    ImageView op1,op2,op3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcq1);
        op1=findViewById(R.id.op1);
        op2=findViewById(R.id.op2);
        op3=findViewById(R.id.Opt3);

        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op1.setImageResource(R.drawable.redcross);
                startActivity(new Intent(Mcq1.this,Mcq2.class));
            }
        });
        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op2.setImageResource(R.drawable.redcircle);
                startActivity(new Intent(Mcq1.this,Mcq2.class));

            }
        });
        op3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op3.setImageResource(R.drawable.redcross);
                startActivity(new Intent(Mcq1.this,Mcq2.class));

            }
        });
    }
}