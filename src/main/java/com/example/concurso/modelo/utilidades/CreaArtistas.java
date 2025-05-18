package com.example.concurso.modelo.utilidades;

import com.example.concurso.modelo.beans.Artista;
import com.example.concurso.modelo.beans.Cantante;
import com.example.concurso.modelo.beans.Musico;
import com.example.concurso.modelo.beans.Poeta;

import java.util.ArrayList;

/**
 * Created by edu on 19/05/2021.
 */
public class CreaArtistas {
    public static ArrayList<Artista> creaArtistas() {
        ArrayList<Artista> listaArtistas = new ArrayList<Artista>();

        listaArtistas.add(new Cantante(10, "Ángela", "Si lo sé no vengo"));
        listaArtistas.add(new Cantante(5, "Luis", "Mr. Chicken"));
        listaArtistas.add(new Cantante(8, "Mario", "En el fondo del mar"));
        listaArtistas.add(new Cantante(2, "Paula", "La lechuga está pocha"));
        listaArtistas.add(new Cantante(9, "Cristóbal", "Si lo sé no vengo"));
        listaArtistas.add(new Cantante(12, "María del Mar", "Como una loncha de queso. Amén"));
        listaArtistas.add(new Cantante(21, "Roberto", "En el fondo del mar"));
        listaArtistas.add(new Poeta(11,"Raúl", "Vamos que nos vamos"));
        listaArtistas.add(new Poeta(25,"Álvaro", "El entierro de la sardina"));
        listaArtistas.add(new Poeta(33, "Antonio", "Si lo sé no vengo"));
        listaArtistas.add(new Poeta(22, "Susana", "En el fondo del mar"));
        listaArtistas.add(new Poeta(32, "Mariano", "Resucitando"));
        listaArtistas.add(new Poeta(26, "Elisa", "Aguántame el cubata"));
        listaArtistas.add(new Poeta(27, "Cristina", "Salto y no caigo"));
        listaArtistas.add(new Musico(23, "Fernando", "Marieta", "piano"));
        listaArtistas.add(new Musico(28, "Penélope", "En el fondo del mar", "armónica"));
        listaArtistas.add(new Musico(31, "Bruno", "Ola ke ase", "violín"));
        listaArtistas.add(new Musico(29, "Sebastián", "Si lo sé no vengo","trompeta"));
        listaArtistas.add(new Musico(24, "Laura", "Mr. Chicken", "gaita"));
        listaArtistas.add(new Musico(30, "Tomás", "Te borro del Feisbuh", "tambor"));
        return listaArtistas;
    }
}
