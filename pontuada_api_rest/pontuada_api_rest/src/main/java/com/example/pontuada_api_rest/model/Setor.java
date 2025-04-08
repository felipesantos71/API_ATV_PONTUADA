package com.example.pontuada_api_rest.model;

public enum Setor {
    ENGENHARIA("Engenharia"),
    SAUDE("Saude"),
    JURIDICO("Juridico");

    private String descricaoSetor;

    Setor(String descricaoSetor) {
        this.descricaoSetor = descricaoSetor;
    }

    public String getDescricaoSetor() {
        return descricaoSetor;
    }
}
