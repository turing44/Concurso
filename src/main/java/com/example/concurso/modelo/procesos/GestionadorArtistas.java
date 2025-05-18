package com.example.concurso.modelo.procesos;

import com.example.concurso.modelo.beans.Artista;

import java.io.IOException;
import java.util.Optional;

public interface GestionadorArtistas {
    public Optional<Artista> buscarArtistaPorId(Integer id) throws IllegalArgumentException;

    // Añadirá el nuevo artista (Deberá tener un id distinto a los demas) y lo guardara en el archivo (lanza ioe si no encuentra el archivo)
    public void guardarArtista(Artista nuevoArtista) throws IllegalArgumentException, IOException;

}
