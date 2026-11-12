package view;

import java.util.ArrayList;

import javafx.beans.property.ReadOnlyIntegerWrapper;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Product;
import service.ProductJdbcService;

public class ShopController {
	@FXML
	private TableView<Product> inventoryTable;
	@FXML
	private TableColumn<Product, Number> idColumn;
	@FXML
	private TableColumn<Product, String> nameColumn;
	@FXML
	private TableColumn<Product, String> priceColumn;
	@FXML
	private TableColumn<Product, Number> stockColumn;
	@FXML
	private TableColumn<Product, String> availableColumn;
	@FXML
	private TextField nameField;
	@FXML
	private TextField priceField;
	@FXML
	private TextField stockField;
	@FXML
	private TextField unitsField;
	@FXML
	private Label statusLabel;

	private ProductJdbcService productService;

	@FXML
	private void initialize() {
		idColumn.setCellValueFactory(cell -> new ReadOnlyIntegerWrapper(cell.getValue().getId()));
		nameColumn.setCellValueFactory(cell -> new ReadOnlyStringWrapper(cell.getValue().getName()));
		priceColumn.setCellValueFactory(cell -> new ReadOnlyStringWrapper(formatPrice(cell.getValue())));
		stockColumn.setCellValueFactory(cell -> new ReadOnlyIntegerWrapper(cell.getValue().getStock()));
		availableColumn.setCellValueFactory(cell -> new ReadOnlyStringWrapper(cell.getValue().isAvailable() ? "Si" : "No"));

		inventoryTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, selected) -> {
			if (selected != null) {
				nameField.setText(selected.getName());
				priceField.setText(String.valueOf(selected.getWholesalerPrice().getValue()));
				stockField.setText(String.valueOf(selected.getStock()));
			}
		});
	}

	void setProductService(ProductJdbcService productService) {
		this.productService = productService;
		refreshInventory();
	}

	@FXML
	private void handleRefresh() {
		refreshInventory();
	}

	@FXML
	private void handleInitSchema() {
		try {
			productService.initializeSchema();
			refreshInventory();
			showStatus("Estructura relacional inicialitzada.");
		} catch (Exception e) {
			showError(e);
		}
	}

	@FXML
	private void handleAddProduct() {
		try {
			productService.createProduct(nameField.getText(), parseDouble(priceField.getText()), parseInt(stockField.getText()));
			refreshInventory();
			showStatus("Producte inserit.");
		} catch (Exception e) {
			showError(e);
		}
	}

	@FXML
	private void handleUpdateStock() {
		try {
			productService.updateStock(resolveProductName(), parseInt(stockField.getText()));
			refreshInventory();
			showStatus("Estoc actualitzat.");
		} catch (Exception e) {
			showError(e);
		}
	}

	@FXML
	private void handleDeleteProduct() {
		try {
			int rows = productService.deleteProduct(resolveProductName());
			refreshInventory();
			showStatus("Files eliminades: " + rows);
		} catch (Exception e) {
			showError(e);
		}
	}

	@FXML
	private void handleStockChange() {
		try {
			productService.registerStockChange(resolveProductName(), parseInt(unitsField.getText()));
			refreshInventory();
			showStatus("Transaccio d'estoc confirmada.");
		} catch (Exception e) {
			showError(e);
		}
	}

	@FXML
	private void handleStockAlert() {
		try {
			Product product = selectedProduct();
			boolean alert = productService.evaluateStockAlert(product.getStock());
			showStatus(alert ? "Alerta d'estoc per a " + product.getName() : "Estoc suficient per a " + product.getName());
		} catch (Exception e) {
			showError(e);
		}
	}

	private void refreshInventory() {
		try {
			ArrayList<Product> inventory = productService.getInventory();
			inventoryTable.setItems(FXCollections.observableArrayList(inventory));
			showStatus("Inventari carregat: " + inventory.size() + " productes.");
		} catch (Exception e) {
			showError(e);
		}
	}

	private String resolveProductName() {
		Product selected = inventoryTable.getSelectionModel().getSelectedItem();
		return selected != null ? selected.getName() : nameField.getText();
	}

	private Product selectedProduct() {
		Product selected = inventoryTable.getSelectionModel().getSelectedItem();
		if (selected == null) {
			throw new IllegalArgumentException("Selecciona un producte de la taula.");
		}
		return selected;
	}

	private int parseInt(String value) {
		return Integer.parseInt(value.trim());
	}

	private double parseDouble(String value) {
		return Double.parseDouble(value.trim());
	}

	private String formatPrice(Product product) {
		return String.format("%.2f EUR", product.getWholesalerPrice().getValue());
	}

	private void showStatus(String message) {
		statusLabel.setText(message);
	}

	private void showError(Exception e) {
		statusLabel.setText("Error: " + e.getMessage());
	}
}
