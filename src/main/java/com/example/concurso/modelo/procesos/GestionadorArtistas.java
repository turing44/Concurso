package com.example.concurso.modelo.procesos;

import com.example.concurso.modelo.beans.Artista;

public interface GestionadorArtistas {
    public Artista buscarArtistaPorId(Integer id) throws IllegalArgumentException;
    public void modificarArtista(Integer idArtistaAnterior, Artista nuevoArtista) throws IllegalArgumentException;
}
