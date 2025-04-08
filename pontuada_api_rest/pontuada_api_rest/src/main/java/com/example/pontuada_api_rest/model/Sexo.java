package com.example.pontuada_api_rest.model;

public enum Sexo {
    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private String descricaoSexo;

    Sexo(String descricaoSexo) {
        this.descricaoSexo = descricaoSexo;
    }

    public String getDescricaoSexo() {
        return descricaoSexo;
    }
}
