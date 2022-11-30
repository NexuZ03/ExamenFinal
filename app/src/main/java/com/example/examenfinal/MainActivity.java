package com.example.examenfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button eliminar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    eliminar = (Button)findViewById(R.id.eliminar);

        eliminar.setOnClickListener(new View.OnClickListener() {


        @Override
        public void onClick(View view) {
            Intent i = new Intent(MainActivity.this,Historial_de_Pedididos.class);
            startActivity(i);
        }
    });
}
}