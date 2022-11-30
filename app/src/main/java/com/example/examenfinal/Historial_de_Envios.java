package com.example.examenfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Historial_de_Envios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial_de_envios);

        Spinner spinner_1 = (Spinner) findViewById(R.id.spinner);
        String [] opciones ={"Alta","Media","Baja"};
        ArrayAdapter <String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                opciones);
        spinner_1.setAdapter(adapter);
    }
}