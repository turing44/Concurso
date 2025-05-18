package com.example.concurso.modelo.procesos;

import com.example.concurso.modelo.beans.Artista;
import com.example.concurso.modelo.utilidades.Archivador;
import com.example.concurso.modelo.utilidades.CreaArtistas;
import com.example.concurso.modelo.utilidades.Validador;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GestionadorArtistasImpl implements GestionadorArtistas {

    private List<Artista> artistas = new ArrayList<>();
    private Archivador archivador = new Archivador("resutados.txt");

    public GestionadorArtistasImpl() throws IOException {
        inicializarArtistas();
    }


    @Override
    public Optional<Artista> buscarArtistaPorId(Integer id) {
        Optional<Artista> artistaEncontrado = Optional.empty();

        if (id != null) {
            for (Artista artista : artistas) {
                if (artista.getID() == id) {
                    artistaEncontrado = Optional.of(artista);
                } else {
                    artistaEncontrado = Optional.empty();
                }
            }
        }

        return artistaEncontrado;
    }

    @Override
    public void guardarArtista(Artista nuevoArtista) throws IllegalArgumentException, IOException {
        Validador.validarArtista(nuevoArtista);
        // es correcto pasarle la lista de artistas?
        Validador.validarIdDisponible(nuevoArtista.getID(), artistas);
        artistas.add(nuevoArtista);
        archivarArtista(nuevoArtista);
    }

    private void archivarArtista(Artista nuevoArtista) throws IllegalArgumentException, IOException {
        Validador.validarArtista(nuevoArtista);
        archivador.guardar(nuevoArtista);
    }


    private void inicializarArtistas() throws IOException {
        for (Artista artista : CreaArtistas.creaArtistas()) {
            this.artistas.add(artista);
            guardarArtista(artista);
        }
    }

}
