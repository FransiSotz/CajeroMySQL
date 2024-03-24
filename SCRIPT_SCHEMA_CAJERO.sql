CREATE DATABASE CAJERO;
USE CAJERO;
--CREACION DE TABLA CUENTA
CREATE TABLE `cuenta` (
  `idTarjeta` varchar(20) NOT NULL,
  `Cliente` varchar(45) NOT NULL,
  `Pin` varchar(45) NOT NULL,
  `Saldo` double NOT NULL,
  PRIMARY KEY (`idTarjeta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--CREACION TABLA MOVIMIENTO
CREATE TABLE `movimiento` (
  `idMovimiento` int NOT NULL AUTO_INCREMENT,
  `idTarjeta` varchar(45) DEFAULT NULL,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Concepto` varchar(400) DEFAULT NULL,
  `Cantidad` float DEFAULT NULL,
  PRIMARY KEY (`idMovimiento`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--INSERCION DE DATOS DE PRUEBA
INSERT INTO `cajero`.`cuenta` (`idTarjeta`, `Cliente`, `Pin`, `Saldo`) VALUES ('123456789012', 'MON LAFERTE', '1234', '30000');

