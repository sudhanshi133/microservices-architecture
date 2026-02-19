CREATE TABLE `orders` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `order_number` VARCHAR(255) DEFAULT NULL,
    `sku_code` VARCHAR(255) DEFAULT NULL,
    `quantity` INT(11) DEFAULT NULL,
    `price` DECIMAL(19, 2) DEFAULT NULL,
    PRIMARY KEY (`id`)
);