package org.example.hotelmanagmentsystem.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.example.hotelmanagmentsystem.Guest;
import org.example.hotelmanagmentsystem.Reservationist;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class SignUp {
    private Stage stage;
    private Parent root;
    @FXML
    private Button b1;
    @FXML
    private Label l1;
    @FXML
    private TextField t1;
    @FXML
    private TextField t2;
    @FXML
    private TextField t3;
    @FXML
    private PasswordField t4;
    @FXML
    private PasswordField t5;
    @FXML
    private RadioButton reservationist;
    @FXML
    private RadioButton guest;
    Reservationist r=new Reservationist();
    Guest g=new Guest();
    public void setUsernameAndPassword(ActionEvent event) throws IOException {
        if (!t1.getText().isEmpty()&&!t2.getText().isEmpty()&&!t3.getText().isEmpty()&&!t4.getText().isEmpty()&&!t5.getText().isEmpty()) {
            if (t4.getText().equals(t5.getText())) {
                if (t4.getText().length() >= 8) {
                    if (reservationist.isSelected()) {

                        r.setUsernameAndPass(t3.getText(), t4.getText());
                        r.SignUp();
                        stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
                        root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
                        stage.setTitle("MOTELLA");
                        stage.setScene(new Scene(root));
                        stage.show();
                    } else if (guest.isSelected()) {
                        g.setUsernameAndPass(t3.getText(), t4.getText());
                        g.SignUp();
                        stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
                        root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
                        stage.setTitle("MOTELLA");
                        stage.setScene(new Scene(root));
                        stage.show();
                    }


                } else {
                    l1.setText("Your password must be at least 8 character");
                }

            } else {
                l1.setText("Passwords are not the same!");
            }


        }else {
            l1.setText("Please enter all wanted information");

        }

    }
}
