package com.manav.diiwalicelebration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Funfact extends AppCompatActivity {

    private String[] funfacts = { "\bThe festival occurs on a no-moon night" + "\n"+"Diwali falls in the hindu calendar month of Karthik, and to enjoy this festival of lights, which occurs on an amavasya (moonless night), firecrackers are lit and lights are placed on the walls and entrances of the houses.","\bThis festival commemorates the return of Rama and Sita to Ayodhya after his fourteen-year long exile.", "\bIt is believed that to welcome them back, the residents of Ayodhya lit thousands of Diyas (clay lamps). That practice still continues. ","\b It is believed that Lakshmi, the goddess of Wealth and prosperity, was born out of the great churning of the milk-sea, known as Samudra Manthan, on Diwali. ","\b It's the end of harvest season:\n The month of Karthik marks the end of harvest season in India and farmers offer their harvest to goddess Lakshmi for prosperity." };
    private int index=0;
    Button funfact ;
    TextView funfact_text ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funfact);
        funfact = findViewById(R.id.funfact_next_buttton);
        funfact_text = findViewById(R.id.funfact_textview);
        funfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (index<funfacts.length) {
                    funfact_text.setText(funfacts[index]);
                    index++;
                }
                else {
                    Toast.makeText(Funfact.this, "You have read all the fun facts", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}