package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;

import model.Product;

public class ProductDaoImplJDBC implements ProductDao {
	private static final String DEFAULT_DB_URL = "jdbc:h2:./data/computercenter_v1_starter;AUTO_SERVER=FALSE";
	private static final String DEFAULT_USER = "sa";
	private static final String DEFAULT_PASSWORD = "";

	private Connection conn;

	@Override
	public void connect() throws SQLException {
		String url = System.getProperty("computercenter.db.url", DEFAULT_DB_URL);
		String user = System.getProperty("computercenter.db.user", DEFAULT_USER);
		String password = System.getProperty("computercenter.db.password", DEFAULT_PASSWORD);

		// TODO RA2-ISSUE-02: obrir la connexio amb DriverManager i guardar-la a conn.
		// Pista: usa url, user i password, i comprova com es declara el connector al pom.xml.
		throw pending("RA2-ISSUE-02 pendent: implementa la connexio JDBC amb DriverManager.");
	}

	@Override
	public void disconnect() throws SQLException {
		if (conn != null && !conn.isClosed()) {
			conn.close();
		}
	}

	@Override
	public void initSchema() throws SQLException {
		// TODO RA2-ISSUE-03: crear products, inventory_history i l'alias STOCK_ALERT_LIMIT.
		// Pista: resol-ho amb Statement i try-with-resources, i afegeix seed inicial si la taula es buida.
		throw pending("RA2-ISSUE-03 pendent: implementa DDL i inicialitzacio de l'esquema.");
	}

	@Override
	public ArrayList<Product> getInventory() throws SQLException {
		// TODO RA2-ISSUE-07: executar SELECT ordenat i convertir cada fila en Product amb mapProduct().
		throw pending("RA2-ISSUE-07 pendent: implementa consulta d'inventari i recorregut de ResultSet.");
	}

	@Override
	public Product findProductByName(String name) throws SQLException {
		// TODO RA2-ISSUE-07: buscar per nom amb PreparedStatement i retornar null si no hi ha resultat.
		throw pending("RA2-ISSUE-07 pendent: implementa consulta parametritzada per nom.");
	}

	@Override
	public int insertProduct(Product product) throws SQLException {
		// TODO RA2-ISSUE-04: inserir name, wholesaler_price, available i stock amb PreparedStatement.
		throw pending("RA2-ISSUE-04 pendent: implementa insercio amb PreparedStatement.");
	}

	@Override
	public int updateStock(String name, int newStock) throws SQLException {
		// TODO RA2-ISSUE-05: actualitzar stock i available segons newStock amb PreparedStatement.
		throw pending("RA2-ISSUE-05 pendent: implementa actualitzacio d'estoc.");
	}

	@Override
	public int deleteProduct(String name) throws SQLException {
		// TODO RA2-ISSUE-06: eliminar per nom i comprovar files afectades.
		throw pending("RA2-ISSUE-06 pendent: implementa eliminacio controlada.");
	}

	@Override
	public void registerStockChange(String name, int unitsToAdd) throws SQLException {
		// TODO RA2-ISSUE-09: desactivar autoCommit, actualitzar estoc, inserir historial, commit o rollback.
		throw pending("RA2-ISSUE-09 pendent: implementa transaccio commit/rollback.");
	}

	@Override
	public boolean evaluateStockAlertWithProcedure(int stock) throws SQLException {
		// TODO RA2-ISSUE-10: cridar STOCK_ALERT_LIMIT amb CallableStatement i parametre d'entrada.
		throw pending("RA2-ISSUE-10 pendent: implementa procediment o alias amb CallableStatement.");
	}

	public static int stockAlertLimit(int stock) {
		return stock < 5 ? 1 : 0;
	}

	private Product mapProduct(ResultSet resultSet) throws SQLException {
		// TODO RA2-ISSUE-07: crear Product amb name, wholesaler_price, available, stock i assignar id.
		throw pending("RA2-ISSUE-07 pendent: implementa mapatge de ResultSet a Product.");
	}

	private SQLFeatureNotSupportedException pending(String message) {
		return new SQLFeatureNotSupportedException(message);
	}

	@SuppressWarnings("unused")
	private Connection requireConnection() throws SQLException {
		if (conn == null || conn.isClosed()) {
			throw new SQLException("Connexio no disponible. Revisa RA2-ISSUE-02.");
		}
		return conn;
	}
}
