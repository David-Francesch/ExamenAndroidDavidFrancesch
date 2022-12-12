package com.example.examendavidfrancesch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class juegomedio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegomedio);
    }

    public void cerrarJuego(){
        finishAndRemoveTask();
    }
}