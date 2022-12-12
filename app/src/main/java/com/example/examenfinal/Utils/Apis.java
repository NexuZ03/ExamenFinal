package com.example.examenfinal.Utils;

import com.example.examenfinal.Model.Departamento;

public class Apis {
    public static final String URL_001="http://125.564.12.1:3306/";
    public static DepartamentoService getDepartamentoService(){
        return Cliente.getCliente(URL_001).create(DepartamentoService.class);
    }
}
