package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import model.Product;

public interface ProductDao {
	void connect() throws SQLException;

	void disconnect() throws SQLException;

	void initSchema() throws SQLException;

	ArrayList<Product> getInventory() throws SQLException;

	Product findProductByName(String name) throws SQLException;

	int insertProduct(Product product) throws SQLException;

	int updateStock(String name, int newStock) throws SQLException;

	int deleteProduct(String name) throws SQLException;

	void registerStockChange(String name, int unitsToAdd) throws SQLException;

	boolean evaluateStockAlertWithProcedure(int stock) throws SQLException;
}
