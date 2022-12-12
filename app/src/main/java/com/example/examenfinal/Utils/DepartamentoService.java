package com.example.examenfinal.Utils;


import com.example.examenfinal.Model.Departamento;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DepartamentoService {
    @GET("listar/")
    Call<List<Departamento>>getDepartamento();
}
