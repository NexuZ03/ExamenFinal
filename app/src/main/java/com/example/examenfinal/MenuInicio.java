package com.example.examenfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuInicio extends AppCompatActivity {

    Button buttonHistorialEnvios;
    Button buttonBuscarEnvios;

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
                Intent i = new Intent(MenuInicio.this, Historial_de_Pedididos.class);
                startActivity(i);
            }
        });
    }
}