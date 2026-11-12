CREATE TABLE IF NOT EXISTS products (
  id IDENTITY PRIMARY KEY,
  name VARCHAR(80) NOT NULL UNIQUE,
  wholesaler_price DECIMAL(10,2) NOT NULL,
  available BOOLEAN NOT NULL,
  stock INT NOT NULL
);

CREATE TABLE IF NOT EXISTS inventory_history (
  id IDENTITY PRIMARY KEY,
  product_id BIGINT NOT NULL,
  action VARCHAR(40) NOT NULL,
  quantity INT NOT NULL,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY (product_id) REFERENCES products(id)
);

INSERT INTO products(name, wholesaler_price, available, stock) VALUES
('SSD 1TB', 60.00, TRUE, 8),
('RAM 32GB', 90.50, TRUE, 3),
('Teclat mecanic', 45.00, TRUE, 6);
