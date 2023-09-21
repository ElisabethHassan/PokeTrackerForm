package com.example.poketrackerform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Variables
    EditText nationalNum;
    EditText name;
    EditText species;
    EditText weight;
    EditText height;
    EditText hp;
    EditText attack;
    EditText defense;
    Spinner spinner;
    //RadioButton
    //String upperString = myString.substring(0, 1).toUpperCase() + myString.substring(1).toLowerCase();

    //Listeners
    AdapterView.OnItemSelectedListener spinListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            // adapterView.getSelectedItem(); //
            String message = adapterView.getItemAtPosition(i).toString();
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();

        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };
     TextWatcher textWatcher = new TextWatcher() {
         @Override
         public void beforeTextChanged(CharSequence s, int start, int count, int after) {

         }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            // get the content of both the edit text
            //String emailInput = etEmail.getText().toString();
            //String passwordInput = etPassword.getText().toString();

            // check whether both the fields are empty or not
            //bLogin.setEnabled(!emailInput.isEmpty() && !passwordInput.isEmpty());
        }

         @Override
         public void afterTextChanged(Editable s) {

         }

    };

     //OnCreate

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nationalNum = findViewById(R.id.national_editview);
        name = findViewById(R.id.name_editText);
        species = findViewById(R.id.species_editText);
        weight = findViewById(R.id.weight_editText);
        height = findViewById(R.id.height_editText);
        hp = findViewById(R.id.hp_editText);
        attack = findViewById(R.id.attack_editText);
        defense = findViewById(R.id.defense_editText);

        //Listener Calls
        spinner.setOnItemSelectedListener(spinListener);

    }
}