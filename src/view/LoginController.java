package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LoginController {
	@FXML
	private Label statusLabel;

	@FXML
	private void handleConnect() {
		statusLabel.setText("Connectant amb la base de dades...");
		try {
			ComputerCenterShopFxApp.startSession();
		} catch (Exception e) {
			statusLabel.setText("No s'ha pogut obrir la connexio: " + e.getMessage());
		}
	}
}
