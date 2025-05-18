package com.example.concurso.modelo.beans;

import java.util.Map;

public class Musico extends Artista {
    public static final TiposArtistas TIPO = TiposArtistas.MUSICO;

    private String tituloMelodia;
    private String instrumento;

    public Musico(int ID, String nombre, String tituloMelodia, String instrumento) {
        super(ID, nombre,
                Map.of(
                TIPO.getAtributos()[0], tituloMelodia,
                TIPO.getAtributos()[1], instrumento
        ));
        this.tituloMelodia = tituloMelodia;
        this.setInstrumento(instrumento);
    }


    public String getTituloMelodia() {
        return tituloMelodia;
    }

    public void setTituloMelodia(String tituloMelodia) {
        this.tituloMelodia = tituloMelodia;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public String toString() {
        return (getID()+":"+getNombre()+":"+getTituloMelodia()+getInstrumento());
    }
    public String actuar() {
        return "Voy a interpretar la melodía "+tituloMelodia+" con "+ getInstrumento();
    }


}
