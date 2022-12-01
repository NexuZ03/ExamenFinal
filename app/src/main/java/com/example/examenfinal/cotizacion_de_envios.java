package com.example.examenfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class cotizacion_de_envios extends AppCompatActivity {

    Spinner spinner_depa, spinner_regi;
    ArrayList <String> arrayList_depa;
    ArrayAdapter <String> arrayAdapter_depa;

    ArrayList <String> arrayList_puno, arrayList_huancayo;
    ArrayAdapter <String> arrayAdapter_regi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cotizacion_de_envios);

        //departamentos
        spinner_depa = (Spinner) findViewById(R.id.spinner_depa);
        spinner_regi = (Spinner) findViewById(R.id.spinner_regi);

        arrayList_depa=new ArrayList<>();
        arrayList_depa.add("Puno");
        arrayList_depa.add("Huancayo");

        arrayAdapter_depa=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_depa);
        spinner_depa.setAdapter(arrayAdapter_depa);

        //regiones
        arrayList_puno=new ArrayList<>();
        arrayList_puno.add("Lampa");
        arrayList_puno.add("Carabaya");
        arrayList_puno.add("Chucuito");

        arrayList_huancayo=new ArrayList<>();
        arrayList_huancayo.add("Satipo");
        arrayList_huancayo.add("Jauja");
        arrayList_huancayo.add("Tarma");

        spinner_depa.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

                if (position==0){
                    arrayAdapter_regi=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,arrayList_puno);
                }
                if (position==1){
                    arrayAdapter_regi=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,arrayList_huancayo);
                }

                spinner_regi.setAdapter(arrayAdapter_regi);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




    }


}