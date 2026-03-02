CREATE TABLE inventory (
    id BIGINT NOT NULL AUTO_INCREMENT,
    quantity INT DEFAULT 0,
    sku_code VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);