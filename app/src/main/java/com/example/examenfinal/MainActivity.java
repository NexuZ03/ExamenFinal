package com.example.examenfinal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    Button buttonIngresar;
    EditText editTextTextUser, editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonIngresar = (Button) findViewById(R.id.buttonIngresar);
        editTextTextUser = findViewById(R.id.editTextTextUser);
        editTextPassword = findViewById(R.id.editTextPassword);

    }
}
