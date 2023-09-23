package com.example.poketrackerform;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
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
    TextView nationalNumLabel;
    TextView nameLabel;
    TextView speciesLabel;
    TextView weightLabel;
    TextView heightLabel;
    TextView hpLabel;
    TextView attackLabel;
    TextView defenseLabel;
    Spinner spinner;
    Button saveButton;
    Button resetButton;
    String nameText = name.getText().toString();
    Double hpText;
    Double attackText;
    Double defenseText;
    Double heightText;
    Double weightText;
    //RadioButton
    //String upperString = myString.substring(0, 1).toUpperCase() + myString.substring(1).toLowerCase();

    //Listeners
    View.OnClickListener resetButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            name.setText("Glastrier");
            species.setText("Wild Horse Pokémon");
            weight.setText("2.2");
            height.setText("800.0");
            hp.setText("0");
            attack.setText("0");
            defense.setText("0");
        }
    };

    View.OnClickListener saveButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (nameCheck(name) && hpCheck(hp) && attackCheck(attack) &&
                    defenseCheck(defense) && heightCheck(height)
                    && weightCheck(weight)) {
                Toast.makeText(getApplicationContext(), "The information was successfully stored in the database.", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "An error occured. Fix the fields in red.", Toast.LENGTH_LONG);
            }
            if (!nameCheck(name)) nameLabel.setTextColor(Color.RED);
            if (!hpCheck(hp)) hpLabel.setTextColor(Color.RED);
            if (!attackCheck(attack)) attackLabel.setTextColor(Color.RED);
            if (!defenseCheck(defense)) defenseLabel.setTextColor(Color.RED);
            if (!heightCheck(height)) heightLabel.setTextColor(Color.RED);
            if (!weightCheck(weight)) weightLabel.setTextColor(Color.RED);

        }
    };

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


     //OnCreate

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nationalNum = findViewById(R.id.national_editview);
        nationalNumLabel = findViewById(R.id.nationalLabel_tv);
        name = findViewById(R.id.name_editText);
        nameLabel = findViewById(R.id.nameLabel_tv);
        species = findViewById(R.id.species_editText);
        speciesLabel = findViewById(R.id.speciesLabel_tv);
        weight = findViewById(R.id.weight_editText);
        weightLabel = findViewById(R.id.weightLabel_tv);
        height = findViewById(R.id.height_editText);
        heightLabel = findViewById(R.id.heightLabel_tv);
        hp = findViewById(R.id.hp_editText);
        hpLabel = findViewById(R.id.hpLabel_tv);
        attack = findViewById(R.id.attack_editText);
        attackLabel = findViewById(R.id.attackLabel_tv);
        defense = findViewById(R.id.defense_editText);
        defenseLabel = findViewById(R.id.defenseLabel_tv);

         hpText = Double.parseDouble(hp.getText().toString());
         attackText = Double.parseDouble(attack.getText().toString());
         defenseText = Double.parseDouble(defense.getText().toString());
         heightText = Double.parseDouble(height.getText().toString());
         weightText = Double.parseDouble(weight.getText().toString());

        //Listener Calls
        spinner.setOnItemSelectedListener(spinListener);
        saveButton.setOnClickListener(saveButtonListener);
        resetButton.setOnClickListener(resetButtonListener);

    }


    private boolean nameCheck(EditText name){
        String nameText = name.getText().toString();
        if (!nameText.isEmpty() && 3 <= nameText.length() && nameText.length() <= 12){
            return true;
        }
        return false;
    }

    private boolean hpCheck(EditText editText){
        String hpStringtext = editText.getText().toString();
        if (!hpStringtext.isEmpty() && 1 <=  hpText && hpText <= 362){
            return true;
        }
        return false;
    }

    private boolean attackCheck(EditText attack){
        String attackStringtext = attack.getText().toString();
        if (!attackStringtext.isEmpty() && 5 <=  attackText && attackText <= 526){
            return false;
        }
        return true;
    }

    private boolean defenseCheck(EditText editText){
        String defenseStringtext = editText.getText().toString();
        if (!defenseStringtext.isEmpty() && 5 <=  defenseText && defenseText <= 614){
            return false;
        }
        return true;
    }

    private boolean heightCheck(EditText editText){
        String heightStringtext = editText.getText().toString();
        if (!heightStringtext.isEmpty() && 0.3 <=  heightText && heightText <= 19.99){
            return false;
        }
        return true;
    }

    private boolean weightCheck(EditText editText){
        String weightStringtext = editText.getText().toString();
        if (!weightStringtext.isEmpty() && 0.1 <=  weightText && weightText <= 820.0){
            return false;
        }
        return true;
    }

}