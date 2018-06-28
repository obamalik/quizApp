package com.example.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton q1_optionB, q2_optionC, q3_optionD, q4_optionB, q5_optionD,
            q6_optionB, q7_optionC, q8_optionC, q10_optionA;

    CheckBox q9_optionA, q9_optionB, q9_optionC, q9_optionD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswers (View view) {
        CharSequence resultDisplay;

        Boolean ans1, ans2, ans3, ans4, ans5, ans6, ans7, ans8, ans9_a, ans9_b, ans9_c, ans9_d, ans10;
        int score = 0;
        double total_score = 0, score_percent = 0;

        q1_optionB = (RadioButton) this.findViewById(R.id.q1_option_b);
        ans1 = q1_optionB.isChecked();
        if (ans1){
            score = score + 1;
        }else {
            score = score + 0;
        }

        q2_optionC = (RadioButton) this.findViewById(R.id.q2_option_c);
        ans2 = q2_optionC.isChecked();
        if (ans2){
            score = score + 1;
        }else {
            score = score + 0;
        }

        q3_optionD = (RadioButton) this.findViewById(R.id.q3_option_d);
        ans3 = q3_optionD.isChecked();
        if (ans3){
            score = score + 1;
        }else {
            score = score + 0;
        }

        q4_optionB = (RadioButton) this.findViewById(R.id.q4_option_b);
        ans4 = q4_optionB.isChecked();
        if (ans4){
            score = score + 1;
        }else {
            score = score + 0;
        }

        q5_optionD = (RadioButton) this.findViewById(R.id.q5_option_d);
        ans5 = q5_optionD.isChecked();
        if (ans5){
            score = score + 1;
        }else {
            score = score + 0;
        }

        q6_optionB = (RadioButton) this.findViewById(R.id.q6_option_b);
        ans6 = q6_optionB.isChecked();
        if (ans6){
            score = score + 1;
        }else {
            score = score + 0;
        }

        q7_optionC = (RadioButton) this.findViewById(R.id.q7_option_c);
        ans7 = q7_optionC.isChecked();
        if (ans7){
            score = score + 1;
        }else {
            score = score + 0;
        }

        q8_optionC = (RadioButton) this.findViewById(R.id.q8_option_c);
        ans8 = q8_optionC.isChecked();
        if (ans8){
            score = score + 1;
        }else {
            score = score + 0;
        }

        q9_optionA = (CheckBox) this.findViewById(R.id.q9_option_a);
        q9_optionB = (CheckBox) this.findViewById(R.id.q9_option_b);
        q9_optionC = (CheckBox) this.findViewById(R.id.q9_option_c);
        q9_optionD = (CheckBox) this.findViewById(R.id.q9_option_d);
        ans9_a = q9_optionA.isChecked();
        ans9_b = q9_optionB.isChecked();
        ans9_c = q9_optionC.isChecked();
        ans9_d = q9_optionD.isChecked();
        if (ans9_a && ans9_b && !ans9_c && ans9_d){
            score = score + 1;
        }else {
            score = score + 0;
        }

        q10_optionA = (RadioButton) this.findViewById(R.id.q10_option_a);
        ans10 = q10_optionA.isChecked();
        if (ans10){
            score = score + 1;
        }else {
            score = score + 0;
        }

        total_score = score;
        score_percent = (total_score/10) * 100;

        resultDisplay = "You scored " + score + " out of 10 \nYour percentage score is " + score_percent;

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.show();
    }
}
