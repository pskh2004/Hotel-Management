package org.example.hotelmanagmentsystem.Controllers;

import javafx.event.ActionEvent;

import java.io.IOException;

public class Welcome {
    navigate n = new navigate();
    public void toSignupPageW(ActionEvent event)throws IOException {
        n.toSignupPage(event);
    }
    public void toLoginPageW(ActionEvent event)throws IOException{
        n.toLoginPage(event);
    }
    public void exitW(ActionEvent event)throws IOException{
        n.exit(event);
    }
}
