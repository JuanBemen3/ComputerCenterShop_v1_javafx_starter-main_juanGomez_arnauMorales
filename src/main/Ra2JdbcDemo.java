package main;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.ProductDao;
import dao.ProductDaoImplJDBC;
import model.Amount;
import model.Product;

public class Ra2JdbcDemo {
	public static void main(String[] args) {
		ProductDao dao = new ProductDaoImplJDBC();
		try {
			dao.connect();
			dao.initSchema();

			System.out.println("Inventari inicial:");
			printInventory(dao.getInventory());

			dao.deleteProduct("Dock USB-C");
			dao.insertProduct(new Product("Dock USB-C", new Amount(35.00), true, 4));
			dao.updateStock("SSD 1TB", 10);
			dao.registerStockChange("RAM 32GB", 2);

			Product product = dao.findProductByName("Dock USB-C");
			System.out.println("Producte consultat: " + product);
			System.out.println("Alerta d'estoc per a Dock USB-C: " + dao.evaluateStockAlertWithProcedure(product.getStock()));

			System.out.println("Inventari final:");
			printInventory(dao.getInventory());
		} catch (SQLException e) {
			System.out.println("Error JDBC: " + e.getMessage());
		} finally {
			try {
				dao.disconnect();
			} catch (SQLException e) {
				System.out.println("No s'ha pogut tancar la connexio: " + e.getMessage());
			}
		}
	}

	private static void printInventory(ArrayList<Product> inventory) {
		for (Product product : inventory) {
			System.out.println("- " + product);
		}
	}
}
