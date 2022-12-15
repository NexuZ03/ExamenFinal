package com.example.examenfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Historial_de_Envios extends AppCompatActivity {

    public RecyclerView recyclerView;
    public RecyclerView.LayoutManager layoutManager;
    public List<Historial_de_Envios> historial_de_envios;
    public Adaptador_Historial_Envios adaptador_historial_envios;
    public ApiConfig apiConfig;
    String[] item;
    SearchView searchView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial_de_envios);

        recyclerView = findViewById(R.id.listar);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        searchView = findViewById(R.id.SearchViewMostrardatos);
        recyclerView.setHasFixedSize(true);
        fetchHistorial("peru", "");

    }
    private int IdEnvio;
    private int IdUsuario;
    private int IdDepartamento;
    private int IdProvincia;
    private int IdDistrito;
    private String CostoEnvio;
    private boolean estado;

    public Historial_de_Envios() {
    }

    public Historial_de_Envios(int idenvio, int idUsuario, int iddepartamento, int idprovincia, int iddistrito, String costoEnvio, boolean estado) {
        IdEnvio = idenvio;
        IdUsuario = idUsuario;
        IdDepartamento = iddepartamento;
        IdProvincia = idprovincia;
        IdDistrito = iddistrito;
        CostoEnvio = costoEnvio;
        this.estado = estado;
    }

    public int getIdEnvio() {
        return IdEnvio;
    }

    public void setIdEnvio(int idEnvio) {
        IdEnvio = idEnvio;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        IdUsuario = idUsuario;
    }

    public int getIdDepartamento() {
        return IdDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        IdDepartamento = idDepartamento;
    }

    public int getIdProvincia() {
        return IdProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        IdProvincia = idProvincia;
    }

    public int getIdDistrito() {
        return IdDistrito;
    }

    public void setIdDistrito(int idDistrito) {
        IdDistrito = idDistrito;
    }

    public String getCostoEnvio() {
        return CostoEnvio;
    }

    public void setCostoEnvio(String costoEnvio) {
        CostoEnvio = costoEnvio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    private void fetchHistorial(String type, String key) {
        apiConfig = ApiCliente.getCliente().create(ApiConfig.class);
        Call<List<Historial_de_Envios>> call = apiConfig.getContact(type, key);
        call.enqueue(new Callback<List<Historial_de_Envios>>() {
            @Override
            public void onResponse(Call<List<Historial_de_Envios>> call, Response<List<Historial_de_Envios>> response) {
                historial_de_envios = response.body();
                adaptador_historial_envios = new Adaptador_Historial_Envios(historial_de_envios, Historial_de_Envios.this);
                recyclerView.setAdapter(adaptador_historial_envios);
            }

            @Override
            public void onFailure(Call<List<Historial_de_Envios>> call, Throwable t) {
                Toast.makeText(Historial_de_Envios.this, "error", Toast.LENGTH_SHORT).show();

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