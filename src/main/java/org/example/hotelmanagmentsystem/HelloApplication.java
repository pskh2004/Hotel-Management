package org.example.hotelmanagmentsystem;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.swing.text.IconView;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("MOTELLA");
        Image image=new Image(getClass().getResource("IMG_20240615_184227_034.png" ).toExternalForm());
        stage.getIcons().add(image);
        stage.setResizable(false);
        stage.setFullScreen(false);
        stage.setScene(scene);

        stage.show();
        stage.setOnCloseRequest(event -> {
            try {
                event.consume();
                Exit(stage);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
    public void Exit(Stage stage) throws IOException {
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("You're about to exit");
        alert.setContentText("Are you sure you want to exit?");
        if(alert.showAndWait().get()== ButtonType.OK){
            stage.close();
        }

    }

    public static void main(String[] args) {
        launch();
    }
}