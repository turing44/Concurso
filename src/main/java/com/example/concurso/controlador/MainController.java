package com.example.concurso.controlador;

import com.example.concurso.modelo.beans.TiposArtistas;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class MainController {
    @FXML
    TextField campoId;

    @FXML
    ComboBox<String> desplegableEspecialidad;

    @FXML
    HBox contenedorAtributos;
    @FXML
    HBox contenedorPuntuacionYGuardar;
    @FXML
    Button btnGuardar;
    @FXML
    Spinner<Integer> spinnerPuntuacion;

    @FXML
    public void initialize() {

    }

    @FXML
    public void guardar() {

    }

}
