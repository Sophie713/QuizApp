package com.example.sophie.quizapp;

/**
 * Created by Sophie on 1/28/2018.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;;
import android.util.TypedValue;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class English extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_checkbox);
        TextView text1 = findViewById(R.id.questionCheckBox);
        text1.setText(R.string.engl1);
        text1.setBackgroundResource(R.drawable.mybg_e);
        CheckBox check1 = findViewById(R.id.answerCheckbox1);
        CheckBox check2 = findViewById(R.id.answerCheckbox2);
        CheckBox check3 = findViewById(R.id.answerCheckbox3);
        CheckBox check4 = findViewById(R.id.answerCheckbox4);
        View check = findViewById(R.id.checkboxLayout);
        check.setBackgroundResource(R.drawable.mybg_e);
        check1.setText(R.string.car1);
        check2.setText(R.string.car2);
        check3.setText(R.string.car3);
        check4.setText(R.string.car4);
    }

    int score = 0;
    int question = 1;

    public void test (View view) {
        switch (question++){
            case 1:{
                //check answer 1
                CheckBox car1 = findViewById(R.id.answerCheckbox1);
                CheckBox car2 = findViewById(R.id.answerCheckbox2);
                CheckBox car3 = findViewById(R.id.answerCheckbox3);
                CheckBox car4 = findViewById(R.id.answerCheckbox4);

                if (car1.isChecked()) {
                    score = score - 1;
                }

                if (car2.isChecked()) {
                    score = score - 1;
                }

                if (car3.isChecked()) {
                    score = score + 1;
                }

                if (car4.isChecked()) {
                    score = score - 1;}

                Toast.makeText(this, "She does't have a car.", Toast.LENGTH_LONG).show();

                setContentView(R.layout.question_radiobuttons);
                TextView questionCB = findViewById(R.id.questionRadioButton);
                questionCB.setText(R.string.engl2);
                questionCB.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25);
                questionCB.setBackgroundResource(R.drawable.mybg_e);
                RadioGroup layoutCB = findViewById(R.id.radioGroup);
                layoutCB.setBackgroundResource(R.drawable.mybg_e);

                break;
            }

            case 2:{

                RadioButton no = findViewById(R.id.no);
                if (no.isChecked()) {
                    score = score + 1;}

                Toast.makeText(this, "He was driving when he hit the tree.", Toast.LENGTH_LONG).show();

                setContentView(R.layout.question_edittext);
                TextView questionET = findViewById(R.id.questionEdittext);
                questionET.setText(R.string.engl3);
                questionET.setBackgroundResource(R.drawable.mybg_e);
                TextView answerET = findViewById(R.id.answerEdittext);
                answerET.setBackgroundResource(R.drawable.mybg_e);

                break;
            }

            case 3 :{

                TextView heart = findViewById(R.id.answerEdittext);
                String sHeart = heart.getText().toString();
//compare heart input
                if ("heart".equals(sHeart)) {
                    score = score + 1;
                }

                Toast.makeText(this, "HEART", Toast.LENGTH_LONG).show();

                setContentView(R.layout.question_checkbox);
                TextView text1 = findViewById(R.id.questionCheckBox);
                text1.setText(R.string.engl4);
                text1.setBackgroundResource(R.drawable.mybg_e);
                CheckBox check1 = findViewById(R.id.answerCheckbox1);
                CheckBox check2 = findViewById(R.id.answerCheckbox2);
                CheckBox check3 = findViewById(R.id.answerCheckbox3);
                CheckBox check4 = findViewById(R.id.answerCheckbox4);
                View check = findViewById(R.id.checkboxLayout);
                check.setBackgroundResource(R.drawable.mybg_e);
                check1.setText(R.string.sus1);
                check2.setText(R.string.sus2);
                check3.setText(R.string.sus3);
                check4.setText(R.string.sus4);

                break;
            }

            case 4: {

                CheckBox sus1 = findViewById(R.id.answerCheckbox1);
                CheckBox sus2 = findViewById(R.id.answerCheckbox2);
                CheckBox sus3 = findViewById(R.id.answerCheckbox3);
                CheckBox sus4 = findViewById(R.id.answerCheckbox4);
                if (sus1.isChecked()) {
                    score = score - 1;
                }

                if (sus2.isChecked()) {
                    score = score - 1;
                }

                if (sus3.isChecked()) {
                    score = score + 1;
                }

                if (sus4.isChecked()) {
                    score = score - 1;
                }

                Toast.makeText(this, "By the time we get to the party all the sushi will have been eaten.", Toast.LENGTH_LONG).show();

                setContentView(R.layout.question_radiobuttons);
                TextView questionCB = findViewById(R.id.questionRadioButton);
                questionCB.setText(R.string.engl5);
                questionCB.setBackgroundResource(R.drawable.mybg_e);
                RadioGroup layoutCB = findViewById(R.id.radioGroup);
                layoutCB.setBackgroundResource(R.drawable.mybg_e);

                break;

            }

            case 5:{

                RadioButton comfortabe = findViewById(R.id.no);
                if (comfortabe.isChecked()) {
                    score = score + 1;}

                Toast.makeText(this, "kʌmf-tɪ-bl", Toast.LENGTH_LONG).show();

                setContentView(R.layout.question_radiobuttons);
                TextView questionCB = findViewById(R.id.questionRadioButton);
                questionCB.setText(R.string.engl6);
                questionCB.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
                questionCB.setBackgroundResource(R.drawable.mybg_e);
                RadioGroup layoutCB = findViewById(R.id.radioGroup);
                layoutCB.setBackgroundResource(R.drawable.mybg_e);

                break;


            }

            case 6: {

                //photo
                RadioButton photo = findViewById(R.id.yes);
                if (photo.isChecked()) {
                    score = score + 1;}

                Toast.makeText(this, "It is correct.", Toast.LENGTH_LONG).show();


                setContentView(R.layout.question_edittext);
                TextView questionET = findViewById(R.id.questionEdittext);
                questionET.setText(R.string.engl7);
                questionET.setBackgroundResource(R.drawable.mybg_e);
                TextView answerET = findViewById(R.id.answerEdittext);
                answerET.setBackgroundResource(R.drawable.mybg_e);

                break;
            }

            case 7:{

                //was written

                TextView was = findViewById(R.id.answerEdittext);
                String sWas = was.getText().toString();

                if (sWas.equals("was")){
                    score = score + 1;
                }

                Toast.makeText(this, "The book was written by W. Shakespeare.", Toast.LENGTH_LONG).show();

                setContentView(R.layout.question_checkbox);
                TextView text1 = findViewById(R.id.questionCheckBox);
                text1.setText(R.string.engl8);
                text1.setBackgroundResource(R.drawable.mybg_e);
                CheckBox check1 = findViewById(R.id.answerCheckbox1);
                CheckBox check2 = findViewById(R.id.answerCheckbox2);
                CheckBox check3 = findViewById(R.id.answerCheckbox3);
                CheckBox check4 = findViewById(R.id.answerCheckbox4);
                View check = findViewById(R.id.checkboxLayout);
                check.setBackgroundResource(R.drawable.mybg_e);
                check1.setText(R.string.stu1);
                check2.setText(R.string.stu2);
                check3.setText(R.string.stu3);
                check4.setText(R.string.stu4);

                break;

            }

            case 8:{
                //studied??
                CheckBox stu1 = findViewById(R.id.answerCheckbox1);
                CheckBox stu2 = findViewById(R.id.answerCheckbox2);
                CheckBox stu3 = findViewById(R.id.answerCheckbox3);
                CheckBox stu4 = findViewById(R.id.answerCheckbox4);

                if (stu1.isChecked()) {
                    score = score - 1;
                }

                if (stu2.isChecked()) {
                    score = score + 1;
                }

                if (stu3.isChecked()) {
                    score = score + 1;
                }

                if (stu4.isChecked()) {
                    score = score - 1;
                }

                Toast.makeText(this, "would have known/would know", Toast.LENGTH_LONG).show();

                setContentView(R.layout.question_edittext);
                TextView questionET = findViewById(R.id.questionEdittext);
                questionET.setText(R.string.engl9);
                questionET.setBackgroundResource(R.drawable.mybg_e);
                TextView answerET = findViewById(R.id.answerEdittext);
                answerET.setBackgroundResource(R.drawable.mybg_e);

                break;


            }

            case 9:{
                //ever?

                TextView ever = findViewById(R.id.answerEdittext);
                String sEver = ever.getText().toString();

                if (sEver.equals("ever")) {
                    score = score + 1;
                }

                Toast.makeText(this, "Have you ever seen the Eiffel Tower?", Toast.LENGTH_LONG).show();


                //show results - go to results page
                Intent intent = new Intent(this, Result.class);
                intent.putExtra("score", score);
                startActivity(intent);

            }
        }






    }
}

