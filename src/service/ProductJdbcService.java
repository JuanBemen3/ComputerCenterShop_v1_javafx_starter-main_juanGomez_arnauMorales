package service;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.ProductDao;
import dao.ProductDaoImplJDBC;
import model.Amount;
import model.Product;

public class ProductJdbcService implements AutoCloseable {
	private final ProductDao productDao;

	public ProductJdbcService() throws SQLException {
		this(new ProductDaoImplJDBC());
	}

	ProductJdbcService(ProductDao productDao) throws SQLException {
		this.productDao = productDao;
		this.productDao.connect();
		this.productDao.initSchema();
	}

	public void initializeSchema() throws SQLException {
		productDao.initSchema();
	}

	public ArrayList<Product> getInventory() throws SQLException {
		return productDao.getInventory();
	}

	public Product findProductByName(String name) throws SQLException {
		return productDao.findProductByName(cleanName(name));
	}

	public int createProduct(String name, double wholesalerPrice, int stock) throws SQLException {
		validateStock(stock);
		return productDao.insertProduct(new Product(cleanName(name), new Amount(wholesalerPrice), stock > 0, stock));
	}

	public int updateStock(String name, int newStock) throws SQLException {
		validateStock(newStock);
		return productDao.updateStock(cleanName(name), newStock);
	}

	public int deleteProduct(String name) throws SQLException {
		return productDao.deleteProduct(cleanName(name));
	}

	public void registerStockChange(String name, int unitsToAdd) throws SQLException {
		if (unitsToAdd == 0) {
			throw new IllegalArgumentException("Les unitats han de ser diferents de zero.");
		}
		productDao.registerStockChange(cleanName(name), unitsToAdd);
	}

	public boolean evaluateStockAlert(int stock) throws SQLException {
		validateStock(stock);
		return productDao.evaluateStockAlertWithProcedure(stock);
	}

	@Override
	public void close() throws SQLException {
		productDao.disconnect();
	}

	private String cleanName(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("El nom del producte es obligatori.");
		}
		return name.trim();
	}

	private void validateStock(int stock) {
		if (stock < 0) {
			throw new IllegalArgumentException("L'estoc no pot ser negatiu.");
		}
	}
}
