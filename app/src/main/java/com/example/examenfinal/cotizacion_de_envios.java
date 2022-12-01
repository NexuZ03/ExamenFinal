package com.example.examenfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class cotizacion_de_envios extends AppCompatActivity {

    Spinner spinner_depa, spinner_regi;
    ArrayList <String> arrayList_depa;
    ArrayAdapter <String> arrayAdapter_depa;

    ArrayList <String> arrayList_puno, arrayList_huancayo;
    ArrayAdapter <String> arrayAdapter_regi;

    Double valordepa,pesito;


    private EditText pesos;
    private TextView resul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cotizacion_de_envios);

        pesos=(EditText)findViewById(R.id.peso);
        resul=(TextView)findViewById(R.id.resul);


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
                    valordepa=2.00;
                }
                if (position==1){
                    arrayAdapter_regi=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,arrayList_huancayo);
                    valordepa=3.00;
                }

                spinner_regi.setAdapter(arrayAdapter_regi);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });







    }

    public void estimar (View view) {
        String peso_String = pesos.getText().toString();
        int peso_int=Integer.parseInt(peso_String);
        if(peso_int>=0 && peso_int<=5){
            pesito=3.0;
        }
        if(peso_int>6 && peso_int<=10){
            pesito=5.0;
        }
        else {
            pesito=10.0;
        }
        Double  total=(5.0+pesito+valordepa);


    }

}