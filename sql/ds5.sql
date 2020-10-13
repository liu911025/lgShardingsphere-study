-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: ds5
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `health_level`
--

DROP TABLE IF EXISTS `health_level`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `health_level` (
  `level_id` bigint NOT NULL,
  `level_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `health_level`
--

LOCK TABLES `health_level` WRITE;
/*!40000 ALTER TABLE `health_level` DISABLE KEYS */;
/*!40000 ALTER TABLE `health_level` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `health_record0`
--

DROP TABLE IF EXISTS `health_record0`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `health_record0` (
  `record_id` bigint NOT NULL AUTO_INCREMENT,
  `user_id` bigint NOT NULL,
  `level_id` bigint NOT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB AUTO_INCREMENT=522816347550388225 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `health_record0`
--

LOCK TABLES `health_record0` WRITE;
/*!40000 ALTER TABLE `health_record0` DISABLE KEYS */;
INSERT INTO `health_record0` VALUES (522814298158927872,8,3,'Remark8'),(522816345029611521,5,0,'Remark5'),(522816347550388224,8,3,'Remark8');
/*!40000 ALTER TABLE `health_record0` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `health_record1`
--

DROP TABLE IF EXISTS `health_record1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `health_record1` (
  `record_id` bigint NOT NULL AUTO_INCREMENT,
  `user_id` bigint NOT NULL,
  `level_id` bigint NOT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB AUTO_INCREMENT=522814295642345474 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `health_record1`
--

LOCK TABLES `health_record1` WRITE;
/*!40000 ALTER TABLE `health_record1` DISABLE KEYS */;
INSERT INTO `health_record1` VALUES (522814292249153536,2,2,'Remark2'),(522814295642345473,5,0,'Remark5');
/*!40000 ALTER TABLE `health_record1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `health_record2`
--

DROP TABLE IF EXISTS `health_record2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `health_record2` (
  `record_id` bigint NOT NULL AUTO_INCREMENT,
  `user_id` bigint NOT NULL,
  `level_id` bigint NOT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB AUTO_INCREMENT=522816342513029121 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `health_record2`
--

LOCK TABLES `health_record2` WRITE;
/*!40000 ALTER TABLE `health_record2` DISABLE KEYS */;
INSERT INTO `health_record2` VALUES (522816342513029120,2,2,'Remark2');
/*!40000 ALTER TABLE `health_record2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `health_task0`
--

DROP TABLE IF EXISTS `health_task0`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `health_task0` (
  `task_id` bigint NOT NULL AUTO_INCREMENT,
  `user_id` bigint NOT NULL,
  `record_id` bigint NOT NULL,
  `task_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`task_id`)
) ENGINE=InnoDB AUTO_INCREMENT=522816347726548993 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `health_task0`
--

LOCK TABLES `health_task0` WRITE;
/*!40000 ALTER TABLE `health_task0` DISABLE KEYS */;
INSERT INTO `health_task0` VALUES (522816346048827393,5,522816345029611521,'TaskName5'),(522816347726548992,8,522816347550388224,'TaskName8');
/*!40000 ALTER TABLE `health_task0` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `health_task1`
--

DROP TABLE IF EXISTS `health_task1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `health_task1` (
  `task_id` bigint NOT NULL AUTO_INCREMENT,
  `user_id` bigint NOT NULL,
  `record_id` bigint NOT NULL,
  `task_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`task_id`)
) ENGINE=InnoDB AUTO_INCREMENT=522814296200187906 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `health_task1`
--

LOCK TABLES `health_task1` WRITE;
/*!40000 ALTER TABLE `health_task1` DISABLE KEYS */;
/*!40000 ALTER TABLE `health_task1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `health_task2`
--

DROP TABLE IF EXISTS `health_task2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `health_task2` (
  `task_id` bigint NOT NULL AUTO_INCREMENT,
  `user_id` bigint NOT NULL,
  `record_id` bigint NOT NULL,
  `task_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`task_id`)
) ENGINE=InnoDB AUTO_INCREMENT=522816342936653825 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `health_task2`
--

LOCK TABLES `health_task2` WRITE;
/*!40000 ALTER TABLE `health_task2` DISABLE KEYS */;
INSERT INTO `health_task2` VALUES (522816342936653824,2,522816342513029120,'TaskName2');
/*!40000 ALTER TABLE `health_task2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `user_id` bigint NOT NULL,
  `user_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
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

-- Dump completed on 2020-10-13 16:48:21
