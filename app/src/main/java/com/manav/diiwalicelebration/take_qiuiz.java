package com.manav.diiwalicelebration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class take_qiuiz extends AppCompatActivity {

    private String[] trivia = {"Diwali is the day when good over evil is celebrated.","Poster making is a very important part of the festival.","Lord Rama returned to Mithila on this very day with his wife, Sita, and his brother, Lakshman.","The city of Thiruchirapalli in Tamil Nadu is known for producing firecrackers.","Dhanteras is the day when Diwali festivities commence.","Diwali is celebrated in September."};
    private boolean[] answer ={true,false,false,false,true,false};
    int index =0;
    int score =0;
    Button button_true;
    Button button_false;
    TextView question;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_qiuiz);
        button_true = findViewById(R.id.true_button);
        button_false = findViewById(R.id.false_button);
        question = findViewById(R.id.questions_view);

        question.setText(trivia[index]);
            button_true.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (index< trivia.length-1) {
                        if (answer[index]==true) {
                            score++;
                        }
                        question.setText(trivia[++index]);
                    }
                    else {
                        Toast.makeText(take_qiuiz.this, "your score is:"+score+" out of six", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            button_false.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (index< trivia.length-1) {
                        if (answer[index]==false) {
                            score++;
                        }
                        question.setText(trivia[++index]);
                    }
                    else {
                        Toast.makeText(take_qiuiz.this, "your score is:"+score+" out of 6", Toast.LENGTH_SHORT).show();
                    }
                }
            });

    }
}