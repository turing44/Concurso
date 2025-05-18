package com.example.concurso.vista;

public class ValidadorFormato {
    private ValidadorFormato() {}

    public static String validarTexto(String texto) throws IllegalArgumentException{
        if (texto == null || texto.trim().isBlank()) {
            throw new IllegalArgumentException("Debes completar todos los campos");
        }
        return texto;
    }

    public static Integer validarEntero(String entero) throws IllegalArgumentException{
        if (entero == null || entero.isBlank()) {
            throw new IllegalArgumentException("Todos los campos deben estar rellenos");
        }
        try {
            return Integer.parseInt(entero);

        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Formato incorrecto");
        }
    }

}
