package com.example.examenfinal;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiCliente {
    public static final String Base_URL="http://127.0.0.1:8080/apirestmovil/";
    public static Retrofit retrofit;

    public static Retrofit getCliente(){
    if(retrofit==null){
        retrofit=new Retrofit.Builder().baseUrl(Base_URL)
                .addConverterFactory(GsonConverterFactory.create()).build();

    }
    return  retrofit;
    }
}
