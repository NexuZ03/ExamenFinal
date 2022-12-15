package com.example.examenfinal;
import java.util.List;

import retrofit2.http.GET;
import retrofit2.Call;
import retrofit2.http.Query;

public interface ApiConfig {
    @GET("/Hojaenvio")
        Call<List<Historial_de_Envios>> getPost();

}

