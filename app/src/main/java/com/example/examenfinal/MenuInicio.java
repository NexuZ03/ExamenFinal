package com.example.examenfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
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
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        searchView=findViewById(R.id.sc);
        recyclerView.setHasFixedSize(true);
        fetchHistorial("peru","");

    }

    private void fetchHistorial(String type, String key) {
        apiConfig = ApiCliente.getCliente().create(ApiConfig.class);
        Call<List<Historial_de_Envios>> call = apiConfig.getContact(type, key);
        call.enqueue(new Callback<List<Historial_de_Envios>>() {
            @Override
            public void onResponse(Call<List<Historial_de_Envios>> call, Response<List<Historial_de_Envios>> response) {
                historial_de_envios = response.body();
                adaptador_historial_envios = new Adaptador_Historial_Envios(historial_de_envios, MenuInicio.this);
                recyclerView.setAdapter(adaptador_historial_envios);
            }

            @Override
            public void onFailure(Call<List<Historial_de_Envios>> call, Throwable t) {
                Toast.makeText(MenuInicio.this, "error", Toast.LENGTH_SHORT).show();

            }
        });
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                fetchHistorial("peru", query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                fetchHistorial("peru", newText);
                return false;
            }
        });


    }
}