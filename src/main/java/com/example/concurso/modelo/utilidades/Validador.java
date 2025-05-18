package com.example.concurso.modelo.utilidades;

import com.example.concurso.modelo.beans.Artista;

import java.lang.reflect.Method;
import java.util.List;

public class Validador {
    private Validador() {}

    public static void validarArtista(Artista artista) throws IllegalArgumentException{
        validarAtributosGenerales(artista);
        validarAtributosEspecificos(artista);
    }

    private static void validarAtributosGenerales(Artista artista) throws IllegalArgumentException {
        if (artista == null) {
            throw new IllegalArgumentException("El artista es nulo");
        } else if (artista.getNombre() == null || artista.getNombre().trim().isBlank()) {
            throw new IllegalArgumentException("El nombre del artista es obligatorio");
        }
    }

    public static void validarIdDisponible(Integer id, List<Integer> lista) throws IllegalArgumentException {

    }

    private static void validarAtributosEspecificos(Artista artista) throws IllegalArgumentException{
        String[] atributos = artista.getTipo().getAtributos();

        for (String atributo : atributos) {
            try {
                Method metodo = artista.getClass().getMethod("get" + atributo);
                if (metodo.invoke(artista) == null || ((String)metodo.invoke(artista)).trim().isBlank()) {
                    throw new IllegalArgumentException("Atributos incompletos");
                }
            } catch (Exception e) {
                throw new IllegalArgumentException("Error llamando al método: " + atributo);
            }
        }

    }
}
