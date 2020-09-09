package com.example.innovative;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Commcq1 extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4;
    private Question question = new Question();
    TextView tv1;
    private String answer;
    private int questionlength=question.questions.length;
    Random random;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commcq1);
        random = new Random();
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        tv1 = findViewById(R.id.tv1);
        final MediaPlayer mp= MediaPlayer.create(this,R.raw.correct_answer);
        btn1.setOnClickListener((View.OnClickListener) this);
        btn2.setOnClickListener((View.OnClickListener) this);
        btn3.setOnClickListener((View.OnClickListener) this);
        btn4.setOnClickListener((View.OnClickListener) this);
        tv1 = (TextView) findViewById(R.id.tv1);
        NextQuestion(random.nextInt(questionlength));

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  mp.start();

            }
        });

    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                if (btn1.getText()==answer) {

                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
                    NextQuestion(random.nextInt(questionlength));
                }else {

                  //  QuizOver();

                }

                break;
            case R.id.btn2:
                if (btn2.getText()==answer) {

                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
                    NextQuestion(random.nextInt(questionlength));
                }
                else {

                  //  QuizOver();
                }

                break;
            case R.id.btn3:
                if (btn3.getText()==answer) {

                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
                    NextQuestion(random.nextInt(questionlength));
                }
                else {

                   // QuizOver ();
                }

                break;
            case R.id.btn4:
                if (btn4.getText()==answer) {

                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
                    NextQuestion(random.nextInt(questionlength));

                }
                else {

                   // QuizOver();
                    break;


                }
        }

    }


   /* private void QuizOver () {
        AlertDialog.Builder alertdialog = new AlertDialog.Builder(Gk.this);
        alertdialog.setMessage("Quiz Over")
                .setCancelable(false)
                .setPositiveButton("New Quiz", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(getApplicationContext(), Gk.class));
                    }
                }).setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                System.exit(0);
            }
        });
        alertdialog.show();



    }

    */


    private void NextQuestion ( int num)
    {
        tv1.setText(question.getQuestion(num));
        btn1.setText(question.getchoice1(num));
        btn2.setText(question.getchoice2(num));
        btn3.setText(question.getchoice3(num));
        btn4.setText(question.getchoice4(num));
        answer=question.getCorrectAnswer(num);


    }


    }
