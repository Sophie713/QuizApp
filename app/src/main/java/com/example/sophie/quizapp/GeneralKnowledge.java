package com.example.sophie.quizapp;

/**
 * Created by Sophie on 1/28/2018.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class GeneralKnowledge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //create a layout with checkoboxes and Writer question
        setContentView(R.layout.question_checkbox);
        TextView questionCB = findViewById(R.id.questionCheckBox);
        questionCB.setText(R.string.gekn1);
        questionCB.setBackgroundResource(R.drawable.mybg_gk);
        View layoutCB = findViewById(R.id.checkboxLayout);
        layoutCB.setBackgroundResource(R.drawable.mybg_gk);
        CheckBox writer1 = findViewById(R.id.answerCheckbox1);
        CheckBox writer2 = findViewById(R.id.answerCheckbox2);
        CheckBox writer3 = findViewById(R.id.answerCheckbox3);
        CheckBox writer4 = findViewById(R.id.answerCheckbox4);
        writer1.setText(R.string.writ1);
        writer2.setText(R.string.writ2);
        writer3.setText(R.string.writ3);
        writer4.setText(R.string.writ4);

    }
    //set the score to 0
    int score = 0;
    int question = 1;

    public void test(View view){
        //check question number and increment
        switch (question++){
            //q = 1
            case 1:{
                //find checkboxes, check the input
                CheckBox writer1 = findViewById(R.id.answerCheckbox1);
                CheckBox writer2 = findViewById(R.id.answerCheckbox2);
                CheckBox writer3 = findViewById(R.id.answerCheckbox3);
                CheckBox writer4 = findViewById(R.id.answerCheckbox4);
                //check the answers
                if(writer1.isChecked()){
                    score--;
                }
                if(writer2.isChecked()){
                    score++;
                }
                if(writer3.isChecked()){
                    score--;
                }
                if(writer4.isChecked()){
                    score--;
                }
                //give the answer

                Toast.makeText(this, "Charles Dickens", Toast.LENGTH_SHORT).show();
                //switch layouts, load edittext
                setContentView(R.layout.question_edittext);
                TextView questionET = findViewById(R.id.questionEdittext);
                questionET.setText(R.string.gekn2);
                questionET.setBackgroundResource(R.drawable.mybg_gk);
                TextView answerET = findViewById(R.id.answerEdittext);
                answerET.setBackgroundResource(R.drawable.mybg_gk);
                //break (q is incremented)
                break;
            }
            //q = 2
            case 2:{
                TextView vidi = findViewById(R.id.answerEdittext);
                String mVidi = vidi.getText().toString();
                //increment score
                if (mVidi.equals("vidi")){
                    score++;
                }
                //show the answer
                Toast.makeText(this, "Veni, vidi, vici.", Toast.LENGTH_SHORT).show();
                //lead new question
                setContentView(R.layout.question_edittext);
                TextView questionET = findViewById(R.id.questionEdittext);
                questionET.setText(R.string.gekn3);
                questionET.setBackgroundResource(R.drawable.mybg_gk);
                TextView answerET = findViewById(R.id.answerEdittext);
                answerET.setBackgroundResource(R.drawable.mybg_gk);
                //break
                break;
            }

            case 3:{
                //check the answer
                TextView ww2 = findViewById(R.id.answerEdittext);
                String mWW = ww2.getText().toString();
                //increment the score
                if (mWW.equals("1945")){
                    score++;
                }
                //show the answer
                Toast.makeText(this, "1945 (September 2)", Toast.LENGTH_SHORT).show();
                //load new layout
                setContentView(R.layout.question_radiobuttons);
                TextView questionCB = findViewById(R.id.questionRadioButton);
                questionCB.setText(R.string.gekn4);
                questionCB.setBackgroundResource(R.drawable.mybg_gk);
                RadioGroup layoutCB = findViewById(R.id.radioGroup);
                layoutCB.setBackgroundResource(R.drawable.mybg_gk);

                break;
            }

            case 4: {
                RadioButton no = findViewById(R.id.no);
                if (no.isChecked()) {
                    score++;
                }
                Toast.makeText(this, "They are the same plant.", Toast.LENGTH_SHORT).show();

                setContentView(R.layout.question_checkbox);
                TextView questionCB = findViewById(R.id.questionCheckBox);
                questionCB.setText(R.string.gekn5);
                questionCB.setBackgroundResource(R.drawable.mybg_gk);
                View layoutCB = findViewById(R.id.checkboxLayout);
                layoutCB.setBackgroundResource(R.drawable.mybg_gk);
                CheckBox writer1 = findViewById(R.id.answerCheckbox1);
                CheckBox writer2 = findViewById(R.id.answerCheckbox2);
                CheckBox writer3 = findViewById(R.id.answerCheckbox3);
                CheckBox writer4 = findViewById(R.id.answerCheckbox4);
                writer1.setText(R.string.dir1);
                writer2.setText(R.string.dir2);
                writer3.setText(R.string.dir3);
                writer4.setText(R.string.dir4);

                break;
            }

            case 5: {
                CheckBox writer1 = findViewById(R.id.answerCheckbox1);
                CheckBox writer2 = findViewById(R.id.answerCheckbox2);
                CheckBox writer3 = findViewById(R.id.answerCheckbox3);
                CheckBox writer4 = findViewById(R.id.answerCheckbox4);

                if(writer1.isChecked()){
                    score--;
                }
                if(writer2.isChecked()){
                    score--;
                }
                if(writer3.isChecked()){
                    score--;
                }
                if(writer4.isChecked()){
                    score++;
                }

                Toast.makeText(this, "Tim Burton", Toast.LENGTH_SHORT).show();

                setContentView(R.layout.question_checkbox);
                TextView questionCB = findViewById(R.id.questionCheckBox);
                questionCB.setText(R.string.gekn6);
                questionCB.setBackgroundResource(R.drawable.mybg_gk);
                View layoutCB = findViewById(R.id.checkboxLayout);
                layoutCB.setBackgroundResource(R.drawable.mybg_gk);
                CheckBox paint1 = findViewById(R.id.answerCheckbox1);
                CheckBox paint2 = findViewById(R.id.answerCheckbox2);
                CheckBox paint3 = findViewById(R.id.answerCheckbox3);
                CheckBox paint4 = findViewById(R.id.answerCheckbox4);
                paint1.setText(R.string.paint1);
                paint2.setText(R.string.paint2);
                paint3.setText(R.string.paint3);
                paint4.setText(R.string.paint4);

                break;
            }

            case 6:{
                CheckBox writer1 = findViewById(R.id.answerCheckbox1);
                CheckBox writer2 = findViewById(R.id.answerCheckbox2);
                CheckBox writer3 = findViewById(R.id.answerCheckbox3);
                CheckBox writer4 = findViewById(R.id.answerCheckbox4);

                if(writer1.isChecked()){
                    score++;
                }
                if(writer2.isChecked()){
                    score--;
                }
                if(writer3.isChecked()){
                    score--;
                }
                if(writer4.isChecked()){
                    score--;
                }

                Toast.makeText(this, "Leonardo DaVinci", Toast.LENGTH_SHORT).show();

                setContentView(R.layout.question_edittext);
                TextView questionET = findViewById(R.id.questionEdittext);
                questionET.setText(R.string.gekn7);
                questionET.setBackgroundResource(R.drawable.mybg_gk);
                TextView answerET = findViewById(R.id.answerEdittext);
                answerET.setBackgroundResource(R.drawable.mybg_gk);

                break;

            }

            case 7:{
                TextView vidi = findViewById(R.id.answerEdittext);
                String mVidi = vidi.getText().toString().toLowerCase();

                if (mVidi.equals("canberra")){
                    score ++;
                }
                //show answer
                Toast.makeText(this, "It\'s Canberra (not Sydney ;) )", Toast.LENGTH_SHORT).show();
                //load new layout
                setContentView(R.layout.question_checkbox);
                TextView questionCB = findViewById(R.id.questionCheckBox);
                questionCB.setText(R.string.gekn8);
                questionCB.setBackgroundResource(R.drawable.mybg_gk);
                View layoutCB = findViewById(R.id.checkboxLayout);
                layoutCB.setBackgroundResource(R.drawable.mybg_gk);
                CheckBox place1 = findViewById(R.id.answerCheckbox1);
                CheckBox place2 = findViewById(R.id.answerCheckbox2);
                CheckBox place3 = findViewById(R.id.answerCheckbox3);
                CheckBox place4 = findViewById(R.id.answerCheckbox4);
                place1.setText(R.string.enst1);
                place2.setText(R.string.enst2);
                place3.setText(R.string.enst3);
                place4.setText(R.string.enst4);
                //break
                break;
            }
            case 8:{
                //check answers
                CheckBox place1 = findViewById(R.id.answerCheckbox1);
                CheckBox place2 = findViewById(R.id.answerCheckbox2);
                CheckBox place3 = findViewById(R.id.answerCheckbox3);
                CheckBox place4 = findViewById(R.id.answerCheckbox4);
                if(place1.isChecked()){
                    score++;
                }
                if(place2.isChecked()){
                    score--;
                }
                if(place3.isChecked()){
                    score--;
                }
                if(place4.isChecked()){
                    score++;
                }
                //show answer
                Toast.makeText(this, "Ulm, Germany, March 14, 1879", Toast.LENGTH_SHORT).show();
                //load new layout
                setContentView(R.layout.question_edittext);
                TextView questionET = findViewById(R.id.questionEdittext);
                questionET.setText(R.string.gekn9);
                questionET.setBackgroundResource(R.drawable.mybg_gk);
                TextView answerET = findViewById(R.id.answerEdittext);
                answerET.setBackgroundResource(R.drawable.mybg_gk);

                break;
            }
            case 9:{
                TextView vidi = findViewById(R.id.answerEdittext);
                String mVidi = vidi.getText().toString().toLowerCase();

                if (mVidi.equals("fleming")){
                    score ++;
                }
                //show answer
                Toast.makeText(this, "Alexander Fleming", Toast.LENGTH_SHORT).show();
                //display results
                Intent intent = new Intent(this, Result.class);
                intent.putExtra("score", score);
                startActivity(intent);
            }
        }
    }


}

