-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: team1
-- ------------------------------------------------------
-- Server version	5.7.19-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `konto`
--

DROP TABLE IF EXISTS `konto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `konto` (
  `Konto_type` varchar(45) DEFAULT NULL,
  `reg_nr` int(11) DEFAULT NULL,
  `konto_nr` int(11) NOT NULL,
  `rentesats` int(11) DEFAULT NULL,
  `saldo` int(11) DEFAULT NULL,
  `overtraeksgebyr` int(11) DEFAULT NULL,
  `overtraek` varchar(45) DEFAULT NULL,
  `id` int(11) DEFAULT NULL,
  PRIMARY KEY (`konto_nr`),
  KEY `Person_id_idx` (`id`),
  CONSTRAINT `Person_id` FOREIGN KEY (`id`) REFERENCES `bruger` (`Person_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `konto`
--

LOCK TABLES `konto` WRITE;
/*!40000 ALTER TABLE `konto` DISABLE KEYS */;
INSERT INTO `konto` VALUES ('Opsparingskonto',7845,258748965,1,500000,2000,'Nej',4),('Opsparingskonto',6985,264874259,1,600000,1200,'Nej',2),('Opsparingskonto',3698,478514789,1,600000,1000,'Nej',3),('Opsparingskonto',1457,547891203,1,250000,1200,'Nej',1),('Lønkonto',3652,568465125,1,100000,1200,'Ja',1),('Lønkonto',213,582102093,1,35000,1200,'Ja',5),('Lønkonto',1520,697564654,1,20000,500,'Ja',4),('Lønkonto',8748,698551789,2,10000,1500,'Ja',2),('Lønkonto',5874,748547989,1,41000,500,'Ja',3),('Opsparingskonto',8745,754864896,1,700000,1500,'Nej',5);
/*!40000 ALTER TABLE `konto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-27 11:38:28
