package com.manav.diiwalicelebration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView textView3;
    Button history_button;
    Button funfact_button;
    Button quiz_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        history_button = findViewById(R.id.button2);
        funfact_button = findViewById(R.id.button4);
        quiz_button = findViewById(R.id.button5);
        textView3 = findViewById(R.id.textView3);
        Intent intent = getIntent();
        String s1 =intent.getStringExtra(MainActivity.key1);
        textView3.setText(s1);
    }

    public void show_history_intent(View view) {
        Intent intent = new Intent(this,History.class);
        startActivity(intent);
    }

    public void show_funfact_intent(View view) {
        Intent intent = new Intent(this,Funfact.class);
        startActivity(intent);
    }

    public void open_url(View view) {
        gotoUrl("https://rangoliworld.org/" );

    }

    private void gotoUrl(String s) {
        Uri webpage = Uri.parse(s);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void taking_quiz(View view) {
        Intent intent = new Intent(this,take_qiuiz.class);
        startActivity(intent);
    }
}