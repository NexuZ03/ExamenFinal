package com.example.examenfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class Cotizador_de_Envios extends AppCompatActivity {

    Spinner spDepartametno, spProvincia, spDistrito, spPesos15;
    CheckBox siSobres, siCajas;
    LinearLayout linearLayoutMarco5, linearLayoutMarco4;
    TextView CuartaPregunta, TipodePeso;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cotizador_de_envios);

        spDepartametno = (Spinner)findViewById(R.id.spDepartametno);
        spProvincia = (Spinner)findViewById((R.id.spProvincia));
        spDistrito=(Spinner)findViewById(R.id.spDistrito);
        spPesos15 = (Spinner)findViewById(R.id.spPesos15);
        siSobres = findViewById(R.id.siSobres);
        siCajas = findViewById(R.id.siCajas);
        linearLayoutMarco5 = findViewById(R.id.linearLayoutMarco5);
        linearLayoutMarco4 = findViewById(R.id.linearLayoutMarco4);
        CuartaPregunta = findViewById(R.id.CuartaPregunta);
        TipodePeso = findViewById(R.id.TipodePeso);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.lista, android.R.layout.simple_list_item_1);
        spPesos15.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapter1= ArrayAdapter.createFromResource(this,R.array.lista1, android.R.layout.simple_list_item_1);
        spDepartametno.setAdapter(adapter1);
        ArrayAdapter<CharSequence> adapter2= ArrayAdapter.createFromResource(this,R.array.lista2, android.R.layout.simple_list_item_1);
        spProvincia.setAdapter(adapter2);
        ArrayAdapter<CharSequence> adapter3= ArrayAdapter.createFromResource(this,R.array.lista3, android.R.layout.simple_list_item_1);
        spDistrito.setAdapter(adapter3);

        siCajas.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    siSobres.setChecked(false);
                    spPesos15.setVisibility(View.VISIBLE);
                    CuartaPregunta.setVisibility(View.VISIBLE);
                    linearLayoutMarco4.setVisibility(View.VISIBLE);
                    linearLayoutMarco5.setVisibility(View.VISIBLE);
                    TipodePeso.setVisibility(View.GONE);
                }else{
                    spPesos15.setVisibility(View.GONE);
                    CuartaPregunta.setVisibility(View.GONE);
                    linearLayoutMarco4.setVisibility(View.GONE);
                    linearLayoutMarco5.setVisibility(View.GONE);
                    TipodePeso.setVisibility(View.VISIBLE);
                }

            }
        });
        siSobres.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    siCajas.setChecked(false);
                    spPesos15.setVisibility(View.GONE);
                    CuartaPregunta.setVisibility((View.GONE));
                    linearLayoutMarco4.setVisibility(View.GONE);
                    linearLayoutMarco5.setVisibility(View.GONE);
                    TipodePeso.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}