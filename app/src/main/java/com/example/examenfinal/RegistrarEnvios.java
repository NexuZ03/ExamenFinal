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

public class RegistrarEnvios extends AppCompatActivity {

    Spinner spDepartamento, spPesos151;
    CheckBox siSobres1, siCajas1;
    LinearLayout linearLayoutCuadro5, linearLayoutCuadro4;
    TextView CuartaPregunta4, TipodePeso1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_envios);

        spDepartamento = (Spinner)findViewById(R.id.spDepartamento15);
        spPesos151 = (Spinner)findViewById(R.id.spPesos151);
        siSobres1 = findViewById(R.id.siSobres1);
        siCajas1 = findViewById(R.id.siCajas1);
        linearLayoutCuadro5 = findViewById(R.id.linearLayoutCuadro5);
        linearLayoutCuadro4 = findViewById(R.id.linearLayoutCuadro4);
        CuartaPregunta4 = findViewById(R.id.CuartaPregunta4);
        TipodePeso1 = findViewById(R.id.TipodePeso1);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.lista, android.R.layout.simple_list_item_1);
        spPesos151.setAdapter(adapter);

        siCajas1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    siSobres1.setChecked(false);
                    spPesos151.setVisibility(View.VISIBLE);
                    CuartaPregunta4.setVisibility(View.VISIBLE);
                    linearLayoutCuadro4.setVisibility(View.VISIBLE);
                    linearLayoutCuadro5.setVisibility(View.VISIBLE);
                    TipodePeso1.setVisibility(View.GONE);
                }else{
                    spPesos151.setVisibility(View.GONE);
                    CuartaPregunta4.setVisibility(View.GONE);
                    linearLayoutCuadro4.setVisibility(View.GONE);
                    linearLayoutCuadro5.setVisibility(View.GONE);
                    TipodePeso1.setVisibility(View.VISIBLE);
                }

            }
        });
        siSobres1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    siCajas1.setChecked(false);
                    spPesos151.setVisibility(View.GONE);
                    CuartaPregunta4.setVisibility((View.GONE));
                    linearLayoutCuadro4.setVisibility(View.GONE);
                    linearLayoutCuadro5.setVisibility(View.GONE);
                    TipodePeso1.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}