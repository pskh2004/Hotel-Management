package org.example.hotelmanagmentsystem;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.io.IOException;

public class navigate {
    private Stage stage;
    private Parent root;
    @FXML
    public RadioButton reservationist , guest , admin ;
    public void exit(ActionEvent event) {
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("You are about to exit");
        alert.setContentText("Are you sure you want to exit?");
        if (alert.showAndWait().get()== ButtonType.OK){
            System.exit(0);
        }
    }
    public void toLoginPage(ActionEvent event) throws IOException {
        stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage.setTitle("LOGIN");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void toSignupPage(ActionEvent event) throws IOException {
        stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("signUp.fxml"));
        stage.setTitle("SIGN UP");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void choiceTitleSU (ActionEvent event) throws IOException {
        if (reservationist.isSelected()) {
            guest.setSelected(false);
        } else if (guest.isSelected()) {
            reservationist.setSelected(false);
        }
    }
    public void backToWelcome(ActionEvent event) throws IOException {
        stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage.setTitle("MOTELLA");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void choiceTitle (ActionEvent event) throws IOException {
        if(reservationist.isSelected()){
            guest.setSelected(false);
            admin.setSelected(false);
        }
        else if(guest.isSelected()){
            reservationist.setSelected(false);
            admin.setSelected(false);
        }
        else if(admin.isSelected()){
            reservationist.setSelected(false);
            guest.setSelected(false);
        }
    }
    public void login(ActionEvent event) throws IOException {
        if(reservationist.isSelected()){
            stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("reservationist.fxml"));
            stage.setTitle("RESERVATIONIST");
            stage.setScene(new Scene(root));
            stage.show();
        }
        else if(guest.isSelected()){
            stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("guest.fxml"));
            stage.setTitle("GUEST");
            stage.setScene(new Scene(root));
            stage.show();
        }
        else if(admin.isSelected()){
            stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("admin.fxml"));
            stage.setTitle("<<<ADMIN>>>");
            stage.setScene(new Scene(root));
            stage.show();
        }
    }
    public void toSettingPageRes(ActionEvent event) throws IOException {
        stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("settingreservationist.fxml"));
        stage.setTitle("SETTING");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void toSettingPageGue(ActionEvent event) throws IOException {
        stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("settingguest.fxml"));
        stage.setTitle("SETTING");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void backFromSettingRes(ActionEvent event) throws IOException {
        stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("reservationist.fxml"));
        stage.setTitle("RESERVATIONIST");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void backFromSettingGue(ActionEvent event) throws IOException {
        stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("guest.fxml"));
        stage.setTitle("GUEST");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void toReservePage(ActionEvent event) throws IOException {
        stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("reservation.fxml"));
        stage.setTitle("RESERVE");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void toGuestPage(ActionEvent event) throws IOException {
        stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("guest.fxml"));
        stage.setTitle("GUEST");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void toPaymentPage(ActionEvent event) throws IOException {
        stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("payment.fxml"));
        stage.setTitle("PAYMENT");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void toInformationPage(ActionEvent event) throws IOException {
        stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("information.fxml"));
        stage.setTitle("INFORMATION");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
