DROP TABLE IF EXISTS accounts;

CREATE TABLE `accounts` (
  `id` int AUTO_INCREMENT  PRIMARY KEY,
  `name` varchar(100) NOT NULL
);

INSERT INTO `accounts` (`id`,`name`) VALUES (1,'Vipul Kumar');
INSERT INTO `accounts` (`id`,`name`) VALUES (2,'Yama Srikant');
INSERT INTO `accounts` (`id`,`name`) VALUES (3,'Avinash Dabhade');
