package com.example.concurso.modelo.utilidades;

import com.example.concurso.modelo.beans.Artista;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Archivador {
    private String archivo;

    public Archivador(String archivo) {
        this.archivo = archivo;
    }

    public void guardar(Artista artista) throws IOException {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true));
            bw.write(artista.toString());
        } catch (IOException _) {
            throw new IOException("Problema con el archivo: " + archivo);
        }
    }


}
