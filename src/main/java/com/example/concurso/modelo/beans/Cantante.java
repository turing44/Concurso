package com.example.concurso.modelo.beans;

import java.util.Map;

public class Cantante extends Artista {
    public static final TiposArtistas TIPO = TiposArtistas.CANTANTE;

    private String tituloCancion;

    public Cantante(int ID, String nombre, String tituloCancion) {
        super(ID, nombre, Map.of(TIPO.getAtributos()[0], tituloCancion));
        this.tituloCancion = tituloCancion;
    }


    public String getTituloCancion() {
        return tituloCancion;
    }
    public void setTituloCancion(String tituloCancion) {
        this.tituloCancion = tituloCancion;
    }

    @Override
    public TiposArtistas getTipo() {
        return TIPO;
    }

    @Override
    public String toString() {
        return (getID()+":"+getNombre()+":"+getTituloCancion());
    }

    @Override
    public String actuar() {
        return "Voy a interpretar la canción "+tituloCancion;
    }
}
