package kurs.java.fx.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class StackPaneController implements Initializable {
	
    @FXML
    private Button button;
	
	public StackPaneController() {
		System.out.println("Jestem Kontrolerm");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		button.setText("Nowa nazwa");
		
	}

}
