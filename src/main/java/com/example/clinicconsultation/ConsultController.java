package com.example.clinicconsultation;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ConsultController {
  @FXML
  private Label welcomeText;

  @FXML
  protected void onLoginButtonClick() {
    welcomeText.setText("Welcome to JavaFX Application!");
  }
}
