package com.example.poketrackerform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nationalNum;
    EditText name;
    EditText species;
    EditText weight;
    EditText height;
    EditText hp;
    EditText attack;
    EditText defense;
    //String upperString = myString.substring(0, 1).toUpperCase() + myString.substring(1).toLowerCase();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}