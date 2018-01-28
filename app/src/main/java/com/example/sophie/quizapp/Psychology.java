package com.example.sophie.quizapp;

/**
 * Created by Sophie on 1/28/2018.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Psychology extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //create a layout with radiobuttons
        setContentView(R.layout.question_radiobuttons);
        TextView questionCB = findViewById(R.id.questionRadioButton);
        questionCB.setText(R.string.psy1);
        questionCB.setTextSize(TypedValue.COMPLEX_UNIT_SP, 23);
        questionCB.setBackgroundResource(R.drawable.mybg_p);
        RadioGroup layoutCB = findViewById(R.id.radioGroup);
        layoutCB.setBackgroundResource(R.drawable.mybg_p);
    }

    int score = 0;
    int question = 1;


    public void test(View view){
        //switch to check answers
        switch(question++){
            case 1:{
                //check answer
                RadioButton comp = findViewById(R.id.no);
                if (comp.isChecked()) {
                    score++;
                }
                //write the correct answer
                Toast.makeText(this, "No, they don\'t.", Toast.LENGTH_SHORT).show();
                //set the new layout
                setContentView(R.layout.question_checkbox);
                TextView questionCB = findViewById(R.id.questionCheckBox);
                questionCB.setText(R.string.psy2);
                questionCB.setBackgroundResource(R.drawable.mybg_p);
                CheckBox box1 = findViewById(R.id.answerCheckbox1);
                CheckBox box2 = findViewById(R.id.answerCheckbox2);
                CheckBox box3 = findViewById(R.id.answerCheckbox3);
                CheckBox box4 = findViewById(R.id.answerCheckbox4);
                box1.setText(R.string.famNam1);
                box2.setText(R.string.famNam2);
                box3.setText(R.string.famNam3);
                box4.setText(R.string.famNam4);
                View layoutCB = findViewById(R.id.checkboxLayout);
                layoutCB.setBackgroundResource(R.drawable.mybg_p);
                //braek
                break;
            }
            case 2:{
                //check
                CheckBox name1 = findViewById(R.id.answerCheckbox1);
                CheckBox name2 = findViewById(R.id.answerCheckbox2);
                CheckBox name3 = findViewById(R.id.answerCheckbox3);
                CheckBox name4 = findViewById(R.id.answerCheckbox4);

                if (name1.isChecked()) {
                    score--;
                }

                if (name2.isChecked()) {
                    score--;
                }

                if (name3.isChecked()) {
                    score++;
                }

                if (name4.isChecked()) {
                    score++;
                }
                //show answer
                Toast.makeText(this, "5 roles: Placator, Computer, Leveller, Blamer & Distractor", Toast.LENGTH_LONG).show();
                //load new layout
                setContentView(R.layout.question_edittext);
                TextView questionET = findViewById(R.id.questionEdittext);
                questionET.setText(R.string.psy3);
                questionET.setTextSize(TypedValue.COMPLEX_UNIT_SP, 23);
                questionET.setBackgroundResource(R.drawable.mybg_p);
                TextView answerET = findViewById(R.id.answerEdittext);
                answerET.setBackgroundResource(R.drawable.mybg_p);
                //break
                break;

            }
            case 3:{
                TextView answerET = findViewById(R.id.answerEdittext);
                String milgr = answerET.getText().toString().toLowerCase();
                if(milgr.equals("milgram")){
                    score++;
                }
                //show answer
                Toast.makeText(this,"Stanley Milgram", Toast.LENGTH_SHORT).show();
                //new layout
                setContentView(R.layout.question_radiobuttons);
                TextView questionCB = findViewById(R.id.questionRadioButton);
                questionCB.setText(R.string.psy4);
                questionCB.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
                questionCB.setBackgroundResource(R.drawable.mybg_p);
                RadioGroup layoutCB = findViewById(R.id.radioGroup);
                layoutCB.setBackgroundResource(R.drawable.mybg_p);
                //break
                break;
            }
            case 4:{
                //check answer
                RadioButton ther = findViewById(R.id.no);
                if (ther.isChecked()) {
                    score++;
                }
                //show result
                Toast.makeText(this,"Therapy is better.", Toast.LENGTH_SHORT).show();
                //set the new layout
                setContentView(R.layout.question_checkbox);
                TextView questionCB = findViewById(R.id.questionCheckBox);
                questionCB.setText(R.string.psy5);
                questionCB.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
                questionCB.setBackgroundResource(R.drawable.mybg_p);
                CheckBox box1 = findViewById(R.id.answerCheckbox1);
                CheckBox box2 = findViewById(R.id.answerCheckbox2);
                CheckBox box3 = findViewById(R.id.answerCheckbox3);
                CheckBox box4 = findViewById(R.id.answerCheckbox4);
                box1.setText(R.string.cond1);
                box2.setText(R.string.cond2);
                box3.setText(R.string.cond3);
                box4.setText(R.string.cond4);
                View layoutCB = findViewById(R.id.checkboxLayout);
                layoutCB.setBackgroundResource(R.drawable.mybg_p);
                //break
                break;
            }
            case 5:{
                //check
                CheckBox name1 = findViewById(R.id.answerCheckbox1);
                CheckBox name2 = findViewById(R.id.answerCheckbox2);
                CheckBox name3 = findViewById(R.id.answerCheckbox3);
                CheckBox name4 = findViewById(R.id.answerCheckbox4);

                if (name1.isChecked()) {
                    score--;
                }

                if (name2.isChecked()) {
                    score++;
                }

                if (name3.isChecked()) {
                    score++;
                }

                if (name4.isChecked()) {
                    score--;
                }
                //show result
                Toast.makeText(this,"E.Thorndike and B.F.Skinner (A.Bandura studied social learning)", Toast.LENGTH_LONG).show();
                //load new layout
                setContentView(R.layout.question_edittext);
                TextView questionET = findViewById(R.id.questionEdittext);
                questionET.setText(R.string.psy6);
                questionET.setBackgroundResource(R.drawable.mybg_p);
                TextView answerET = findViewById(R.id.answerEdittext);
                answerET.setBackgroundResource(R.drawable.mybg_p);
                //break
                break;
            }
            case 6:{
                //check
                TextView answerET = findViewById(R.id.answerEdittext);
                String zimb = answerET.getText().toString().toLowerCase();
                if(zimb.equals("zimbardo")){
                    score++;
                }
                //show answer
                Toast.makeText(this,"Philip Zimbardo", Toast.LENGTH_SHORT).show();
                //new layout
                setContentView(R.layout.question_radiobuttons);
                TextView questionCB = findViewById(R.id.questionRadioButton);
                questionCB.setText(R.string.psy7);
                questionCB.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25);
                questionCB.setBackgroundResource(R.drawable.mybg_p);
                RadioGroup layoutCB = findViewById(R.id.radioGroup);
                layoutCB.setBackgroundResource(R.drawable.mybg_p);
                //break
                break;
            }
            case 7:{
                //check answer
                RadioButton moral = findViewById(R.id.yes);
                if (moral.isChecked()) {
                    score++;
                }
                //show result
                Toast.makeText(this,"True, over 85% base their morals on \n\'What is normal\' or \'reward/punishment\'", Toast.LENGTH_LONG).show();
                //set the new layout
                setContentView(R.layout.question_radiobuttons);
                TextView questionCB = findViewById(R.id.questionRadioButton);
                questionCB.setText(R.string.psy8);
                questionCB.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25);
                questionCB.setBackgroundResource(R.drawable.mybg_p);
                RadioGroup layoutCB = findViewById(R.id.radioGroup);
                layoutCB.setBackgroundResource(R.drawable.mybg_p);
                //break
                break;
            }
            case 8:{
                //check answer
                RadioButton moral = findViewById(R.id.yes);
                if (moral.isChecked()) {
                    score++;
                }
                //show result
                Toast.makeText(this,"True, memory is strongly connected to feelings.", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(this, Result.class);
                intent.putExtra("score", score);
                startActivity(intent);
            }


        }
    }

}
