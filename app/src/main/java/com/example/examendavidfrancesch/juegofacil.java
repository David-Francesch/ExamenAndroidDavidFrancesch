package com.example.examendavidfrancesch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class juegofacil extends AppCompatActivity {

    TextView username;
    String c1,c2,c3,c4;
    String[] colores;
    EditText guesser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegofacil);

        guesser = (EditText) findViewById(R.id.nombreet);
        username = (TextView) findViewById(R.id.usertx);
        Bundle mainact = getIntent().getExtras();
        username.setText(mainact.getString("test"));

        jugar();

    }

    public void jugar(){
        c1 = "V";
        c2 = "R";
        c3 = "Am";
        c4 = "Az";
        int colorand;
        String frase = "";
        colores = new String[4];

        colores[0] = c1;
        colores[1] = c2;
        colores[2] = c3;
        colores[3] = c4;

        for (int i = 0; i < 0; i++) {
            colorand = (int) (Math.random()*3);
            frase = frase.concat(colores[colorand]);

            //guesser.setText(colores.indexOf(colorand));
        }
        guesser.setText(frase);
    }

    public void cerrarJuego(){
        finishAndRemoveTask();
    }
}