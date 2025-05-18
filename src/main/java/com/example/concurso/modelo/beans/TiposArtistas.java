package com.example.concurso.modelo.beans;

public enum TiposArtistas {
    CANTANTE("Cantante", new String[]{"Canción"}),
    MUSICO("Musico", new String[]{"Melodia", "Instrumento"}),
    POETA("Poeta", new String[]{"Poema"});

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
