


CREATE DATABASE  IF NOT EXISTS `product_det`;

USE `product_det`;


DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `brand` varchar(45) DEFAULT NULL,
  `desc` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;




INSERT INTO `product` VALUES 
    
    (1, "Nike", "This is the best sport shoes brand in the world", 999.99),
		(2, "Adidas", "Adidas is popular for its unique designs and quality", 999.99),
		(3, "Terra", "Terra is one of the fastest growing brand in India", 699.99),
		(4, "Teva", "Good Product For Price", 499.99),
		(5, "Clarks", "Clarks brand is a British based shoe manufacturer & founded in year 1825", 899.99),
		(6, "Fila", "Top Quality sportswear and accessories", 999.99),
		(7, "Territory Boots", "Lee Cooper is widely popular for its exquisite range of apparels, accessories, and Shoes", 799.99),
		(8, "Woodland", "Woodland makes rough and tough shoes, boots", 999.99),
		(9, "Tentree", "Good Quality", 399.99),
		(10, "Puma", "Puma is a globally famous Shoes and apparel brand", 999.99),
		(11, "Ted Baker", "Best You can Have!", 299.99),
		(12, "Reebok", "Established in 1895 in England, Reebok is one of the major admired brands", 899.99),
    
    (13, "Starbucks", "This is the best sport shoes brand in the world", 999.99),
		(14, "Xfinity", "Xfinity is popular for its unique designs and quality", 999.99),
		(15, "Spectrum", "Spectrum is one of the fastest growing brand in India", 699.99),
		(16, "Accenture", "Good Product For Price", 499.99),
		(17, "Moutai", "Moutai brand is a British based shoe manufacturer & founded in year 1825", 899.99),
		(18, "Baidu", "Top Quality sportswear and accessories", 999.99),
		(19, "Verizon Boots", "Verizon Boots is widely popular for its exquisite range of apparels, accessories, and Shoes", 799.99),
		(20, "Marlboro", "Marlboro makes rough and tough shoes, boots", 999.99),
		(21, "Orange", "Good Quality", 399.99),
		(22, "Puma", "Puma is a globally famous Shoes and apparel brand", 999.99),
		(23, "Costco", "Best You can Have!", 299.99),
		(24, "IKEA", "Established in 1895 in England, Reebok is one of the major admired brands", 899.99),
    (25, "Ted IKEA", "Best You can Have!", 299.99),
		(26, "TD Boots", "Established in 1895 in England, Reebok is one of the major admired brands", 899.99);
    
    
    

