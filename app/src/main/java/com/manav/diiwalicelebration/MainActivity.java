package com.manav.diiwalicelebration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity<view> extends AppCompatActivity {

    Button button ;
    EditText editText;
    final static String key1 ="my key1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =findViewById(R.id.button);
        editText =findViewById(R.id.editTextTextPersonName);
    }
    public void  show_intent(View view){
        String s1 = editText.getText().toString();
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra(key1,s1);
        startActivity(intent);
    }
}