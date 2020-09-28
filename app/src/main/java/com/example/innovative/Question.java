package com.example.innovative;

public class Question
{
    public String[] questions ={
            " 1. Man-made things that make our work easy are called____________.",
            " 2. A_____that keeps things cool and is a machine.",
            " 3. A machine is a _____ thing.",
            " 4. A computer is a ____ machine.",
            " 5. Some machines such as car and bus need______,diesel,_____or CNG to run.",
            " 6.  "

    };
    private String[][] choices={
            {"Machines","Refrigerator","Home-made","TV"},
            {"Refrigerator","House","Cooler","Fan"},
            {"Home-made","Man-made","Machines","Gas"},
            {"Smart","Electric","Time-pass","Software"},
            {"Gas,water","Electricity,petrol","Water","Oil"},
    };
    public String correctAnswer[]={
            "Machines","Refrigerator","Home-made","Smart","Electricity,petrol"
    };
    public String getQuestion(int a){
        String question=questions[a];
        return question;
    }
    public String getchoice1(int a){
        String choice=choices[a][3];
        return choice;
    }
    public String getchoice2(int a){
        String choice=choices[a][0];
        return choice;
    }
    public String getchoice3(int a){
        String choice=choices[a][2];
        return choice;
    }
    public String getchoice4(int a){
        String choice=choices[a][1];
        return choice;
    }
    public  String getCorrectAnswer(int a){
        String answer=correctAnswer[a];
        return  answer;
    }
}



