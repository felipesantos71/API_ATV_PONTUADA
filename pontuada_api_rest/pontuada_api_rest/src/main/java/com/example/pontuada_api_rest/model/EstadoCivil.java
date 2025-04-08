package com.example.pontuada_api_rest.model;

public enum EstadoCivil {
    SOLTEIRO("Solteiro"),
    CASADO("Casado"),
    SEPARACAO("Sepadado"),
    DIVORCIADO("Divorciado"),
    VIUVO("Viuvo");

    private String descricaoEstadoCivil;

    EstadoCivil(String descricaoEstadoCivil) {
        this.descricaoEstadoCivil = descricaoEstadoCivil;
    }

    public String getDescricaoEstadoCivil() {
        return descricaoEstadoCivil;
    }
}
