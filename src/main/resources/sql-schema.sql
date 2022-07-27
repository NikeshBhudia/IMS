drop schema if exists ims;

CREATE SCHEMA IF NOT EXISTS ims;

USE ims ;

CREATE TABLE IF NOT EXISTS customers (
    id INT(10) NOT NULL AUTO_INCREMENT,
    firstName VARCHAR(40) NOT NULL,
    surname VARCHAR(40) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS orders (
    id INT(10) NOT NULL AUTO_INCREMENT,
    Customer_id INT(10) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (Customer_id) REFERENCES customers(id)
);

CREATE TABLE IF NOT EXISTS item (
    id INT(10) NOT NULL AUTO_INCREMENT,
    itemName VARCHAR(40) NOT NULL,
    price DECIMAL NOT NULL,
    PRIMARY KEY (id)  
);

CREATE TABLE IF NOT EXISTS itemrecipt (
    id INT NOT NULL AUTO_INCREMENT,
    ItemID INT(10) NOT NULL,
    OrderID INT(10) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (ItemID) REFERENCES item(id),
    FOREIGN KEY (OrderID) REFERENCES orders(id)
);
