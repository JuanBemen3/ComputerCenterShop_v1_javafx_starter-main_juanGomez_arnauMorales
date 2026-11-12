package view;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import service.ProductJdbcService;

public class ComputerCenterShopFxApp extends Application {
	private static Stage primaryStage;
	private static ProductJdbcService productService;

	@Override
	public void start(Stage stage) throws IOException {
		primaryStage = stage;
		primaryStage.setTitle("ComputerCenterShop RA2 JavaFX");
		showLogin();
		primaryStage.show();
	}

	static void showLogin() throws IOException {
		Parent root = load("/view/LoginView.fxml");
		primaryStage.setScene(new Scene(root, 900, 580));
	}

	static void startSession() throws Exception {
		if (productService == null) {
			productService = new ProductJdbcService();
		}
		FXMLLoader loader = new FXMLLoader(ComputerCenterShopFxApp.class.getResource("/view/ShopView.fxml"));
		Parent root = loader.load();
		ShopController controller = loader.getController();
		controller.setProductService(productService);
		primaryStage.setScene(new Scene(root, 1100, 680));
	}

	@Override
	public void stop() throws Exception {
		if (productService != null) {
			productService.close();
		}
	}

	private static Parent load(String resource) throws IOException {
		return FXMLLoader.load(ComputerCenterShopFxApp.class.getResource(resource));
	}

	public static void main(String[] args) {
		launch(args);
	}
}
