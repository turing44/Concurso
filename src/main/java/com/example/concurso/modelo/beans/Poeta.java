package com.example.concurso.modelo.beans;


import java.util.Map;

public class Poeta extends Artista {
    // lo hago estatico porq esta bien que to el programa sepa que un artista es de tipo artista
    public static final TiposArtistas TIPO = TiposArtistas.POETA;

    private String tituloPoema;


    // como añado docu aqui?
    public Poeta(int ID, String nombre, String tituloPoema) {
        super(ID, nombre, Map.of(TIPO.getAtributos()[0], tituloPoema));
        this.setTituloPoema(tituloPoema);
    }



    public String getTituloPoema() {
        return tituloPoema;
    }

    public void setTituloPoema(String tituloPoema) {
        this.tituloPoema = tituloPoema;
    }

    @Override
    public TiposArtistas getTipo() {
        return TIPO;
    }

    @Override
    public String toString() {
        return (getID()+":"+getNombre()+":"+getTituloPoema());
    }

    @Override
    public String actuar() {
        return "Voy a recitar el poema "+ getTituloPoema();
    }

}
