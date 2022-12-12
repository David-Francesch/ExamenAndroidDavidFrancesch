package com.example.examendavidfrancesch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class juegodificil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegodificil);
    }

    public void cerrarJuego(){
        finishAndRemoveTask();
    }
}