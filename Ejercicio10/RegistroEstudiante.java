package Ejercicio10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RegistroEstudiante extends Application {

    @Override
    public void start(Stage stage) {

        Label titulo = new Label("Registro de estudiante");

        TextField txtNombre = new TextField();
        txtNombre.setPromptText("Nombre");

        TextField txtMatricula = new TextField();
        txtMatricula.setPromptText("Matrícula");

        Button btnRegistrar = new Button("Registrar");

        Label resultado = new Label();

        btnRegistrar.setOnAction(event -> {

            String nombre = txtNombre.getText();
            String matricula = txtMatricula.getText();

            Estudiante estudiante = new Estudiante(nombre, matricula);

            resultado.setText(
                "Nombre: " + estudiante.getNombre()
                + "\nMatrícula: " + estudiante.getMatricula()
            );
        });

        VBox vbox = new VBox(10);

        vbox.getChildren().addAll(
            titulo,
            txtNombre,
            txtMatricula,
            btnRegistrar,
            resultado
        );

        Scene scene = new Scene(vbox, 350, 250);

        stage.setTitle("Registro de Estudiante");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}