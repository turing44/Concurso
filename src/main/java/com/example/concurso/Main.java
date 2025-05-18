package com.example.concurso;

import com.example.concurso.modelo.beans.Artista;
import com.example.concurso.modelo.beans.Cantante;
import com.example.concurso.modelo.beans.Poeta;
import com.example.concurso.modelo.beans.TiposArtistas;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("principal.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {


        Cantante robe = new Cantante(21, "Roberto", "En el fondo del mar");

        System.out.println(((Artista) robe).getClass());
        ;
        //launch();
    }
}