package com.vikrant.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button msubmit;
    private Button mReset;
    private RadioGroup mGroup_1;
    private RadioGroup mGroup_2;
    private RadioGroup mGroup_3;
    private CheckBox mChecka;
    private CheckBox mCheckb;
    private CheckBox mCheckc;
    private CheckBox mCheckd;
    private CheckBox mChecke;
    private RadioButton mRadio_1;
    private RadioButton mRadio_2;
    private RadioButton mRadio_3;
    private CheckBox mCheck_Q4_a;
    private CheckBox mCheck_Q4_b;
    private CheckBox mCheck_Q5_a;
    private CheckBox mCheck_Q5_b;
    private CheckBox mCheck_Q5_c;
    private CheckBox mCheck_Q6_a;
    private CheckBox mCheck_Q6_b;
    private EditText mEdit_1;
    private EditText mEdit_2;
    int marks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.vikrant.quiz.R.layout.activity_main);
        setConstants();

        msubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marks = 0;

                if (mRadio_1.isChecked())
                    marks++;
                if (mRadio_2.isChecked())
                    marks++;
                if (mRadio_3.isChecked())
                    marks++;


                if (mCheck_Q4_a.isChecked() && mCheck_Q4_b.isChecked() && mChecka.isChecked() == false && mCheckb.isChecked() == false)
                    marks++;
                if (mCheck_Q5_a.isChecked() && mCheck_Q5_b.isChecked() && mCheck_Q5_c.isChecked() && mCheckc.isChecked() == false)
                    marks++;
                if (mCheck_Q6_a.isChecked() && mCheck_Q6_b.isChecked() && mCheckd.isChecked() == false && mChecke.isChecked() == false)
                    marks++;
                if (mEdit_1.getText().toString().equals("github"))
                    marks++;
                if (mEdit_2.getText().toString().equals("google"))
                    marks++;
                Toast.makeText(getApplicationContext(), "Your Score is " + marks, Toast.LENGTH_SHORT).show();

                if (marks > 4) {
                    Toast.makeText(getApplicationContext(), "You are Genius ", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Nedd More Practice ", Toast.LENGTH_SHORT).show();
                }
                marks = 0;
            }
        });
        mReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mGroup_1.clearCheck();
                mGroup_2.clearCheck();
                mGroup_3.clearCheck();
                mEdit_1.setText("");
                mEdit_2.setText("");
                mCheck_Q4_a.setChecked(false);
                mCheck_Q4_b.setChecked(false);
                mCheck_Q5_a.setChecked(false);
                mCheck_Q5_b.setChecked(false);
                mCheck_Q5_c.setChecked(false);
                mCheck_Q6_a.setChecked(false);
                mCheck_Q6_b.setChecked(false);
                mChecka.setChecked(false);
                mCheckb.setChecked(false);
                mCheckc.setChecked(false);
                mCheckd.setChecked(false);
                mChecke.setChecked(false);
                marks = 0;
            }
        });

    }

    public void setConstants() {
        msubmit = findViewById(com.vikrant.quiz.R.id.Submit);
        mReset = findViewById(com.vikrant.quiz.R.id.Reset);
        mRadio_1 = findViewById(com.vikrant.quiz.R.id.Q1);
        mRadio_2 = findViewById(com.vikrant.quiz.R.id.Q2);
        mRadio_3 = findViewById(com.vikrant.quiz.R.id.Q3);
        mCheck_Q4_a = findViewById(com.vikrant.quiz.R.id.Q4a);
        mCheck_Q4_b = findViewById(com.vikrant.quiz.R.id.Q4b);
        mCheck_Q5_a = findViewById(com.vikrant.quiz.R.id.Q5a);
        mCheck_Q5_b = findViewById(com.vikrant.quiz.R.id.Q5b);
        mCheck_Q5_c = findViewById(com.vikrant.quiz.R.id.Q5c);
        mCheck_Q6_a = findViewById(com.vikrant.quiz.R.id.Q6a);
        mCheck_Q6_b = findViewById(com.vikrant.quiz.R.id.Q6b);
        mEdit_1 = findViewById(com.vikrant.quiz.R.id.Q7);
        mEdit_2 = findViewById(com.vikrant.quiz.R.id.Q8);
        mChecka = findViewById(com.vikrant.quiz.R.id.check1);
        mCheckb = findViewById(com.vikrant.quiz.R.id.check2);
        mCheckc = findViewById(com.vikrant.quiz.R.id.check3);
        mCheckd = findViewById(com.vikrant.quiz.R.id.check4);
        mChecke = findViewById(com.vikrant.quiz.R.id.check5);
        mGroup_1 = findViewById(com.vikrant.quiz.R.id.group_1);
        mGroup_2 = findViewById(com.vikrant.quiz.R.id.group_2);
        mGroup_3 = findViewById(com.vikrant.quiz.R.id.group_3);


    }

}
