package com.example.examendavidfrancesch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    EditText useret;
    String usernom;
    RadioButton facil, medio, dificil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        facil = (RadioButton) findViewById(R.id.nivel1);
        medio = (RadioButton) findViewById(R.id.nivel2);
        dificil = (RadioButton) findViewById(R.id.nivel3);
        usernom = "";
        useret = (EditText) findViewById(R.id.nombreet);
    }

    public void openJuego(View view) {
        Intent juegofacil = new Intent(this, juegofacil.class);
        Intent juegomedio = new Intent(this, juegomedio.class);
        Intent juegodificil = new Intent(this, juegodificil.class);

        if (facil.isChecked()){
            usernom = String.valueOf(useret.getText());
            juegofacil.putExtra("test",usernom);
            startActivity(juegofacil);
        }

        if(medio.isChecked()){
            usernom = String.valueOf(useret.getText());
            juegomedio.putExtra("test",usernom);
            startActivity(juegomedio);
        }

        if(dificil.isChecked()){
            usernom = String.valueOf(useret.getText());
            juegodificil.putExtra("test",usernom);
            startActivity(juegodificil);
        }
        usernom = String.valueOf(useret.getText());
        juegofacil.putExtra("test",usernom);
        startActivity(juegofacil);
    }

    public void cerrarJuego(){
        finishAndRemoveTask();
    }
}