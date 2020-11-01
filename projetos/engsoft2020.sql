CREATE DATABASE  IF NOT EXISTS `engsoft2020` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `engsoft2020`;
-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: engsoft2020
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `contatos`
--

DROP TABLE IF EXISTS `contatos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contatos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `email` varchar(50) NOT NULL,
  `fone` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contatos`
--

LOCK TABLES `contatos` WRITE;
/*!40000 ALTER TABLE `contatos` DISABLE KEYS */;
INSERT INTO `contatos` VALUES (1,'Machado de Assis','machado@abl.org.br','2122.8800');
/*!40000 ALTER TABLE `contatos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionarios_a`
--

DROP TABLE IF EXISTS `funcionarios_a`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcionarios_a` (
  `id` int NOT NULL AUTO_INCREMENT,
  `matricula` int NOT NULL,
  `nome` varchar(150) NOT NULL,
  `cargo` varchar(45) NOT NULL,
  `salario` decimal(6,2) DEFAULT NULL,
  `comissao` decimal(2,2) DEFAULT NULL,
  `total_vendas` decimal(6,2) DEFAULT NULL,
  `valor_hora` decimal(3,2) DEFAULT NULL,
  `total_horas` int DEFAULT NULL,
  `tipo` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `matricula_UNIQUE` (`matricula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionarios_a`
--

LOCK TABLES `funcionarios_a` WRITE;
/*!40000 ALTER TABLE `funcionarios_a` DISABLE KEYS */;
/*!40000 ALTER TABLE `funcionarios_a` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionarios_b`
--

DROP TABLE IF EXISTS `funcionarios_b`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcionarios_b` (
  `id` int NOT NULL AUTO_INCREMENT,
  `matricula` int NOT NULL,
  `nome` varchar(150) NOT NULL,
  `cargo` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionarios_b`
--

LOCK TABLES `funcionarios_b` WRITE;
/*!40000 ALTER TABLE `funcionarios_b` DISABLE KEYS */;
INSERT INTO `funcionarios_b` VALUES (2,123,'Machado de Assis','Repórter'),(3,124,'Rachel de Queiroz','Escritora'),(4,125,'Clarice Lispector','Escritora');
/*!40000 ALTER TABLE `funcionarios_b` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `horistas`
--

DROP TABLE IF EXISTS `horistas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `horistas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_funcionario` int NOT NULL,
  `valor_hora` decimal(3,2) NOT NULL,
  `total_horas` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_funcionario_idx` (`id_funcionario`),
  CONSTRAINT `fk_funcionario_horista` FOREIGN KEY (`id_funcionario`) REFERENCES `funcionarios_b` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `horistas`
--

LOCK TABLES `horistas` WRITE;
/*!40000 ALTER TABLE `horistas` DISABLE KEYS */;
/*!40000 ALTER TABLE `horistas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mensalistas`
--

DROP TABLE IF EXISTS `mensalistas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mensalistas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_funcionario` int NOT NULL,
  `salario` decimal(6,2) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_funcionario_idx` (`id_funcionario`),
  CONSTRAINT `fk_funcionario` FOREIGN KEY (`id_funcionario`) REFERENCES `funcionarios_b` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mensalistas`
--

LOCK TABLES `mensalistas` WRITE;
/*!40000 ALTER TABLE `mensalistas` DISABLE KEYS */;
INSERT INTO `mensalistas` VALUES (1,2,6234.56),(2,3,4534.56),(3,4,7534.56);
/*!40000 ALTER TABLE `mensalistas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendedores`
--

DROP TABLE IF EXISTS `vendedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vendedores` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_mensalista` int NOT NULL,
  `comissao` decimal(2,2) NOT NULL,
  `total_vendas` decimal(6,2) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_mensalista_idx` (`id_mensalista`),
  CONSTRAINT `fk_mensalista` FOREIGN KEY (`id_mensalista`) REFERENCES `mensalistas` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendedores`
--

LOCK TABLES `vendedores` WRITE;
/*!40000 ALTER TABLE `vendedores` DISABLE KEYS */;
/*!40000 ALTER TABLE `vendedores` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-12 21:34:06
