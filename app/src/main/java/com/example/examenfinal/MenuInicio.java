package com.example.examenfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SearchView;

import java.util.List;

import retrofit2.Retrofit;

public class MenuInicio extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private List<Historial_de_Envios> historial_de_envios;
    private Adaptador_Historial_Envios adaptador_historial_envios;
    private ApiConfig apiConfig;
    String[] item;
    SearchView searchView;



    Button buttonHistorialEnvios;
    Button buttonBuscarEnvios;
    Button buttonCEProvincias;
    Button buttonRegistrarEnvios;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inicio);
        buttonHistorialEnvios=(Button) findViewById(R.id.buttonHistorialEnvios);
        buttonHistorialEnvios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuInicio.this, Historial_de_Envios.class);
                startActivity(i);
            }
        });

        buttonBuscarEnvios=(Button) findViewById(R.id.buttonBuscarEnvios);
        buttonBuscarEnvios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MenuInicio.this, Buscar_Envios.class);
                startActivity(a);
            }
        });

        buttonCEProvincias=(Button) findViewById(R.id.buttonCEProvincias);
        buttonCEProvincias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(MenuInicio.this, Cotizador_de_Envios.class);
                startActivity(e);
            }
        });
        buttonRegistrarEnvios=(Button) findViewById(R.id.buttonRegistrarEnvios);
        buttonRegistrarEnvios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(MenuInicio.this, RegistrarEnvios.class);
                startActivity(e);
            }
        });

        recyclerView=findViewById(R.id.listar);

    }




}