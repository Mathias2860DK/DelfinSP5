-- MySQL dump 10.13  Distrib 8.0.22, for macos10.15 (x86_64)
--
-- Host: 127.0.0.1    Database: delfin
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `medlem`
--

DROP TABLE IF EXISTS `medlem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medlem` (
  `medlem_id` int NOT NULL AUTO_INCREMENT,
  `navn` varchar(200) DEFAULT NULL,
  `aargang` int NOT NULL,
  `medlem_status` varchar(200) DEFAULT NULL,
  `medlem_gruppe` varchar(200) DEFAULT NULL,
  `medlem_type` varchar(200) DEFAULT NULL,
  `medlem_balance` int DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`medlem_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medlem`
--

LOCK TABLES `medlem` WRITE;
/*!40000 ALTER TABLE `medlem` DISABLE KEYS */;
INSERT INTO `medlem` VALUES (6,'mathias4',2001,'Aktiv','Senior','Motionist',-481,'Mand'),(7,'Jørgen',1970,'Aktiv','Senior','Konkurrence svømmer',1600,'Mand'),(8,'kurt',2000,'Aktiv','Senior','Konkurrence svømmer',-1600,'Kvinde'),(9,'Hans',1988,'Aktiv','Senior','Konkurrence svømmer',-1600,'Mand'),(10,'tesst',1111,'Aktiv','Senior','Konkurrence svømmer',-1600,'Mand'),(11,'Mark',2000,'Aktiv','Senior','Motionist',0,'Mand');
/*!40000 ALTER TABLE `medlem` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-15 11:49:21
