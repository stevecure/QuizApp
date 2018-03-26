package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;




public class AddQuiz extends AppCompatActivity {

    int score= 0;
    EditText editText;

    RadioGroup radioGroupOne;
    RadioGroup radioGroupTwo;
    RadioGroup radioGroupThree;
    RadioGroup radioGroupFour;
    RadioGroup radioGroupFive;

    String grade;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_quiz);


        radioGroupOne = (RadioGroup) findViewById(R.id.radioGroup_one);
        radioGroupTwo = (RadioGroup) findViewById(R.id.radioGroup_two);
        radioGroupThree= (RadioGroup) findViewById(R.id.radioGroup_three);
        radioGroupFour = (RadioGroup) findViewById(R.id.radioGroup_four);
        radioGroupFive = (RadioGroup) findViewById(R.id.radioGroup_five);
        editText =(EditText) findViewById(R.id.name_field);


    }
    /*reset the field to null*/

  public void resetScore(View view){
      radioGroupOne.clearCheck();
      radioGroupTwo.clearCheck();
      radioGroupThree.clearCheck();
      radioGroupFour.clearCheck();
      radioGroupFive.clearCheck();
      editText.setText("");

  }

    /*submit the score and grade according to the correct answer*/

    public void submit(View v){


        int checkedRadioBtnId = radioGroupOne.getCheckedRadioButtonId();
        int checkedRadioBtnId1 = radioGroupTwo.getCheckedRadioButtonId();
        int checkedRadioBtnId2 = radioGroupThree.getCheckedRadioButtonId();
        int checkedRadioBtnId3 = radioGroupFour.getCheckedRadioButtonId();
        int checkedRadioBtnId4 = radioGroupFive.getCheckedRadioButtonId();

    if (checkedRadioBtnId ==R.id.radio_android_kit)
        {
            score=score+5;
        }

        if (checkedRadioBtnId1 ==R.id.radio_larry)
        {
            score=score+5;
        }

        if (checkedRadioBtnId2 ==R.id.radio_htc)
        {
            score=score+5;
        }
        if (checkedRadioBtnId3 ==R.id.radio_intent)
        {
            score=score+5;
        }
        if (checkedRadioBtnId4 ==R.id.radio_blok){

            score=score+5;
        }

         if (score>20)
        {
            grade = "A. Excellent";
        }

        else if (score >15 && score<=20)
        {
            grade = "B. Better";
        }

        else if (score <=15 && score>10)
        {
            grade = "C. Good";
        }
         else if (score<=10 && score>=5)
         {
             grade ="D. Poor";
         }
         else if (score==0){
             grade ="E. TRY AGAIN";

         }
        else
           grade="invalid";

    if (editText.getText().toString().trim().isEmpty())
    {
        Toast.makeText(this, "Enter Your Name", Toast.LENGTH_SHORT).show();
    }
        else
    {
        Toast.makeText(this, editText.getText().toString() + "\n" +"Score:  " +String.valueOf(score) + "\n" + "Grade: " + grade, Toast.LENGTH_LONG).show();

        score=0; //reset score value
        grade=""; //reset grade
    }



    }
}
