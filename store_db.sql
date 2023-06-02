CREATE
DATABASE java_store_project;

USE
java_store_project;

CREATE TABLE `customer`
(
    `id`         int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `username`   text NOT NULL,
    `password`   text NOT NULL,
    `first_name` text NOT NULL,
    `last_name`  text NOT NULL,
    `sex`        enum('Male','Female') NOT NULL,
    `phone_no`   bigint(20) NOT NULL,
    `address`    text NOT NULL
);

INSERT INTO `customer` (`id`, `username`, `password`, `first_name`, `last_name`, `sex`, `phone_no`, `address`)
VALUES (2, '1234', '1234', 'Arshya', 'Jafari', 'Female', 399333936949, 'Roma'),
       (3, '123', '123', '123', '123', 'Male', 9354651655465, 'asdasd');

CREATE TABLE `employee`
(
    `id`         int  NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `username`   text NOT NULL,
    `password`   text NOT NULL,
    `first_name` text NOT NULL,
    `last_name`  text NOT NULL,
    `sex`        enum('Male','Female') NOT NULL,
    `phone_no`   bigint(20) NOT NULL,
    `address`    text NOT NULL,
    `title`      enum('Manager','Accountant','Seller','Storekeeper') NOT NULL,
    `salary`     bigint(20) NOT NULL
);

INSERT INTO `employee` (`id`, `username`, `password`, `first_name`, `last_name`, `sex`, `phone_no`, `address`, `title`,
                        `salary`)
VALUES (4, 'arshya', '1234', 'Arshya', 'Jafari', 'Male', 98933936949, 'Sari', 'Seller', 10);

CREATE TABLE `product`
(
    `id`           int  NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `product_code` text NOT NULL,
    `name`         text NOT NULL,
    `price`        int  NOT NULL,
    `quantity`     int  NOT NULL
);

INSERT INTO `product` (`id`, `product_code`, `name`, `price`, `quantity`)
VALUES (4, '54566-445', 'Core i5-6200U', 150, 10),
       (5, '456651-455', 'Core i5-7200U', 200, 15),
       (6, '465777-221', 'GeForce 920M', 220, 5),
       (7, '45651156-554', 'Ram-8GB DDR3', 95, 13),
       (8, '131565-545', '1000GB-HDD', 320, 3);

CREATE TABLE `shoping_list`
(
    `id`           int  NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `customer_id`  int  NOT NULL,
    `product_code` text NOT NULL,
    `name`         text NOT NULL,
    `price`        int  NOT NULL
);

INSERT INTO `shoping_list` (`id`, `customer_id`, `product_code`, `name`, `price`)
VALUES (7, 2, '131565-545', '1000GB-HDD', 320);
