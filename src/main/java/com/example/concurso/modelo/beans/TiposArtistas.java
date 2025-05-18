package com.example.concurso.modelo.beans;

public enum TiposArtistas {
    CANTANTE("Cantante", new String[]{"Titulo canción"}),
    MUSICO("Músico", new String[]{"Titulo melodía", "Instrumento"}),
    POETA("Poeta", new String[]{"Titulo poema"});

    private final String tipo;
    private final String[] atributos;

    TiposArtistas (String tipo, String[] atributos) {
        this.tipo = tipo;
        this.atributos = atributos;
    }

    public String getTipo() {
        return tipo;
    }
    public String[] getAtributos() {
        return atributos;
    }
}
