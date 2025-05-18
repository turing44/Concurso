package com.example.concurso.modelo.beans;


import java.util.Map;

/**
 * Created by Administrador on 15/03/2021.
 */
public abstract class Artista {

    private int ID;
    private String nombre;
    private int puntuacion;
    private Map<String, String> atributosEspecificos;

    // protected porque no tiene sentido que hayan artistas, debe haber cantantes, poetas...
    protected Artista(int ID, String nombre, Map<String, String> atributosEspecificos) {
        this.ID = ID;
        this.nombre = nombre;
        this.atributosEspecificos = atributosEspecificos;
    }

    public abstract TiposArtistas getTipo();
    public Map<String, String> getAtributosEspecificos() {
        return atributosEspecificos;
    };

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract String toString();
    public abstract String actuar();
    public String saludar() {
        return "Hola, me llamo "+this.nombre+", saludos!";
    }
    public String despedirse() {
        return "Y esto ha sido todo, muchas gracias!";
    }

}
