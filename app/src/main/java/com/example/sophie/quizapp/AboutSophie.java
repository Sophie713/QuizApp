package com.example.sophie.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Sophie on 1/28/2018.
 */

public class AboutSophie extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_edittext);
        TextView questionET = findViewById(R.id.questionEdittext);
        questionET.setText(R.string.soph1);
        questionET.setBackgroundResource(R.drawable.mybg_s);
        TextView answerET = findViewById(R.id.answerEdittext);
        answerET.setBackgroundResource(R.drawable.mybg_s);

    };


    int score = 0;
    int question = 1;

    public void test(View view) {
        switch (question++) {
            case 1: {
                //check answer
                TextView birthday = findViewById(R.id.answerEdittext);
                String bDate = birthday.getText().toString();
//compare the birthday input and make a toast
                if ("28.04.1991".equals(bDate)) {
                    Toast.makeText(this, "That's right!", Toast.LENGTH_SHORT).show();
                    score = score + 1;
                } else if ("28.4.1991".equals(bDate)) {
                    Toast.makeText(this, "That's right!", Toast.LENGTH_SHORT).show();
                    score = score + 1;
                } else {
                    Toast.makeText(this, "It's actually on 28.4.1991.", Toast.LENGTH_LONG).show();
                }
                //update layout and values

                setContentView(R.layout.question_checkbox);
                TextView questionCB = findViewById(R.id.questionCheckBox);
                questionCB.setText(R.string.soph2);
                questionCB.setBackgroundResource(R.drawable.mybg_s);
                CheckBox food1 = findViewById(R.id.answerCheckbox1);
                food1.setText(R.string.food1);
                CheckBox food2 = findViewById(R.id.answerCheckbox2);
                food2.setText(R.string.food2);
                CheckBox food3 = findViewById(R.id.answerCheckbox3);
                food3.setText(R.string.food3);
                CheckBox food4 = findViewById(R.id.answerCheckbox4);
                food4.setText(R.string.food4);
                View layoutCB = findViewById(R.id.checkboxLayout);
                layoutCB.setBackgroundResource(R.drawable.mybg_s);


                break;
            }

            case 2:{
                //check answer
                CheckBox food1 = findViewById(R.id.answerCheckbox1);
                CheckBox food2 = findViewById(R.id.answerCheckbox2);
                CheckBox food3 = findViewById(R.id.answerCheckbox3);
                CheckBox food4 = findViewById(R.id.answerCheckbox4);
                Toast.makeText(this, "It's sushi and salads.", Toast.LENGTH_LONG).show();
                //update score
                if (food1.isChecked()) {
                    score = score - 1;
                }

                if (food2.isChecked()) {
                    score = score + 2;
                }

                if (food3.isChecked()) {
                    score = score + 1;
                }

                if (food4.isChecked()) {
                    score = score - 1;
                }



                //update the layout
                setContentView(R.layout.question_checkbox);
                TextView questionCB = findViewById(R.id.questionCheckBox);
                questionCB.setText(R.string.soph3);
                questionCB.setBackgroundResource(R.drawable.mybg_s);
                CheckBox box1 = findViewById(R.id.answerCheckbox1);
                CheckBox box2 = findViewById(R.id.answerCheckbox2);
                CheckBox box3 = findViewById(R.id.answerCheckbox3);
                CheckBox box4 = findViewById(R.id.answerCheckbox4);
                box1.setText(R.string.writer1);
                box2.setText(R.string.writer2);
                box3.setText(R.string.writer3);
                box4.setText(R.string.writer4);
                View layoutCB = findViewById(R.id.checkboxLayout);
                layoutCB.setBackgroundResource(R.drawable.mybg_s);

                break;
            }

            case 3:{
                CheckBox writer1 = findViewById(R.id.answerCheckbox1);
                CheckBox writer2 = findViewById(R.id.answerCheckbox2);
                CheckBox writer3 = findViewById(R.id.answerCheckbox3);
                CheckBox writer4 = findViewById(R.id.answerCheckbox4);

                if (writer1.isChecked()) {
                    score = score + 1;
                }

                if (writer2.isChecked()) {
                    score = score - 1;
                }

                if (writer3.isChecked()) {
                    score = score - 1;
                }

                if (writer4.isChecked()) {
                    score = score + 1;
                }

                Toast.makeText(this, "It's H. Murakami and S. King.", Toast.LENGTH_LONG).show();

                setContentView(R.layout.question_radiobuttons);
                TextView questionCB = findViewById(R.id.questionRadioButton);
                questionCB.setText(R.string.soph4);
                questionCB.setBackgroundResource(R.drawable.mybg_s);
                RadioGroup layoutCB = findViewById(R.id.radioGroup);
                layoutCB.setBackgroundResource(R.drawable.mybg_s);

                break;


            }

            case 4:{
                //check

                RadioButton mYes = findViewById(R.id.yes);
                if (mYes.isChecked()) {
                    score = score + 1;
                }

                Toast.makeText(this, "I love spicy food!", Toast.LENGTH_LONG).show();

                //setView
                setContentView(R.layout.question_radiobuttons);
                TextView questionCB = findViewById(R.id.questionRadioButton);
                questionCB.setText(R.string.soph5);
                questionCB.setBackgroundResource(R.drawable.mybg_s);
                RadioGroup layoutCB = findViewById(R.id.radioGroup);
                layoutCB.setBackgroundResource(R.drawable.mybg_s);
                RadioButton yes = findViewById(R.id.yes);
                yes.setText("1");
                RadioButton no = findViewById(R.id.no);
                no.setText("2");

                break;
            }

            case 5:{
                RadioButton cat = findViewById(R.id.yes);
                if (cat.isChecked()) {
                    score = score + 1;
                }

                Toast.makeText(this, "One because cats don't like company of other cats.", Toast.LENGTH_LONG).show();
                //set view
                setContentView(R.layout.question_edittext);
                TextView questionET = findViewById(R.id.questionEdittext);
                questionET.setText(R.string.soph6);
                questionET.setBackgroundResource(R.drawable.mybg_s);
                TextView answerET = findViewById(R.id.answerEdittext);
                answerET.setBackgroundResource(R.drawable.mybg_s);

                break;

            }
            case 6:{
                TextView number = findViewById(R.id.answerEdittext);
                String favNumber = number.getText().toString();
//compare answers
                if ("7".equals(favNumber)) {
                    score = score + 1;
                } else if ("13".equals(favNumber)) {
                    score = score + 1;
                } else if ("713".equals(favNumber)) {
                    score = score + 1;
                }

                Toast.makeText(this, "7 and 13", Toast.LENGTH_LONG).show();

                //set view
                setContentView(R.layout.question_edittext);
                TextView questionET = findViewById(R.id.questionEdittext);
                questionET.setText(R.string.soph7);
                questionET.setBackgroundResource(R.drawable.mybg_s);
                TextView answerET = findViewById(R.id.answerEdittext);
                answerET.setBackgroundResource(R.drawable.mybg_s);

                break;

            }

            case 7:{
                TextView drink = findViewById(R.id.answerEdittext);
                String coffee = drink.getText().toString();
                //compare answers
                if ("coffee".equals(coffee)) {
                    score = score + 1;
                } else if ("cafe".equals(coffee)) {
                    score = score + 1;
                } else if ("kafe".equals(coffee)) {
                    score = score + 1;
                } else if ("kava".equals(coffee)) {
                    score = score + 1;
                }

                Toast.makeText(this, "COFFEEEEEE!!!!", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(this, Result.class);
                intent.putExtra("score", score);
                startActivity(intent);

            }


        }
    }

}
