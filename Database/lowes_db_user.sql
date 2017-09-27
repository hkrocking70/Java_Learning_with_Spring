CREATE DATABASE  IF NOT EXISTS `lowes_db` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `lowes_db`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: lowes_db
-- ------------------------------------------------------
-- Server version	5.5.44-log

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
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `company` int(11) DEFAULT NULL,
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(20) DEFAULT NULL,
  `umail` varchar(20) DEFAULT NULL,
  `contactno` varchar(20) DEFAULT NULL,
  `addr` int(11) DEFAULT NULL,
  PRIMARY KEY (`uid`),
  KEY `addr` (`addr`),
  KEY `company` (`company`),
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`addr`) REFERENCES `address` (`aid`),
  CONSTRAINT `user_ibfk_2` FOREIGN KEY (`company`) REFERENCES `company` (`comp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (NULL,1,'anmol','anmol@gmail.com','9795798808',1),(NULL,2,'himanshi','himanshu@zolo','8795789654',2),(NULL,3,'Arshdeep C','arsh@iphone.c','123456987',NULL),(NULL,4,'shubham','shu@gmail.com','987654123',NULL),(NULL,5,'anmol Agarw','anmol@ag123','12345678',NULL),(NULL,7,'Kamal','koma@azam.in','215457879',NULL),(NULL,8,'Rohit Thakur','rohitl@gmail.com','654987123',NULL),(1,10,'Mukul','mukul@chutiya.com','007',9),(1,11,'Mukul','mukul@chutiya.com','007',10),(1,12,'Mukul','mukul@chutiya.com','007',11);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-09-27  8:26:40
