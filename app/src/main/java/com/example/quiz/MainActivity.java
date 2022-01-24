package com.example.quiz;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button res;
    Button ann;
    EditText taille;
    TextView resultat;
    RadioButton homme;
    RadioButton femme;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res = (Button) findViewById(R.id.res);
        ann = (Button) findViewById(R.id.ann);
        taille = (EditText) findViewById(R.id.taille);
        resultat = (TextView) findViewById(R.id.resultat);
        homme = (RadioButton) findViewById(R.id.homme);
        femme = (RadioButton) findViewById(R.id.femme);

        res.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onClick(View v) {
                float r = 0;
                int t = Integer.parseInt(taille.getText().toString());




                if(homme.isChecked() || femme.isChecked()){
                    if (homme.isChecked()){
                        r = (float) (t - 100 - (t - 150)/4);
                        resultat.setText(" "+r);
                    }
                    else if (femme.isChecked()) {
                        r = (float) (t - 100 - (t - 150)/2.5);
                        resultat.setText(" "+r);
                    }
                }
                else {
                    Toast toast ;
                    toast = Toast.makeText(MainActivity.this, "please choose a gender", Toast.LENGTH_SHORT) ;
                    toast.show() ;
                }






            }
        });

        ann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taille.setText("");
                resultat.setText("");

            }
        });


    }
}