module com.example.concurso {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.concurso to javafx.fxml;
    exports com.example.concurso;
    exports com.example.concurso.controlador;
    opens com.example.concurso.controlador to javafx.fxml;
}