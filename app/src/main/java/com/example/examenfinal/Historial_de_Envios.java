package com.example.examenfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class Historial_de_Envios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial_de_envios);
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

    public Historial_de_Envios(int idEnvio, int idUsuario, int idDepartamento, int idProvincia, int idDistrito, String costoEnvio, boolean estado) {
        IdEnvio = idEnvio;
        IdUsuario = idUsuario;
        IdDepartamento = idDepartamento;
        IdProvincia = idProvincia;
        IdDistrito = idDistrito;
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


}