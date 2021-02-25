DROP TABLE IF EXISTS products CASCADE;
CREATE table products (id BIGSERIAL PRIMARY KEY, name VARCHAR(255), cost int);
INSERT INTO products(name, cost) VALUES
('good1', 1),
('good2', 2),
('good3', 3),
('good4', 4),
('good5', 5),
('good6', 6),
('good7', 7),
('good8', 8),
('good9', 9),
('good10', 10),
('good11', 11),
('good12', 12),
('good13', 13),
('good14', 14),
('good15', 15),
('good16', 16),
('good17', 17),
('good18', 18),
('good19', 19),
('good20', 20);