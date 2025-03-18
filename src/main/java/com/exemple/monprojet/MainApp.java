package com.exemple.monprojet;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    public static void main(String[] args) {
        // Lancement de l'application JavaFX
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Création d'un label affichant "Hello World!"
        Label helloWorld = new Label("Hello World!");

        // Création d'une racine de type StackPane
        StackPane root = new StackPane();
        root.getChildren().add(helloWorld);

        // Création de la scène avec une taille de 400x300
        Scene scene = new Scene(root, 400, 300);

        // Configuration de la fenêtre principale
        primaryStage.setTitle("Hello JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
