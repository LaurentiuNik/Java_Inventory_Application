-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: pocbase
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `ProductID` int NOT NULL AUTO_INCREMENT,
  `ProductName` varchar(100) COLLATE utf8_romanian_ci NOT NULL,
  `Brand` varchar(100) COLLATE utf8_romanian_ci NOT NULL,
  `ModelNumber` varchar(50) COLLATE utf8_romanian_ci NOT NULL,
  `ModelYear` int NOT NULL,
  `Description` varchar(1000) COLLATE utf8_romanian_ci NOT NULL,
  UNIQUE KEY `idproduct_UNIQUE` (`ProductID`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_romanian_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'LG G8','LG','8',2019,'167g, 8.4mm thickness, Android 9.0, up to Android 10, LG UX 9.0128GB storage, microSDXC'),(2,'Samsung Galaxy S21','Samsung','21',2021,'169g (Sub6), 171g (mmWave), 7.9mm thicknessAndroid 11, One UI 3.1, 128GB/256GB storage'),(3,'ZenBook 14','ASUS','UX425EA',2021,'Procesor Intel® Core™ i5-1135G7, 14\", Full HD, 8GB, 512GB SSD, Intel Iris Xᵉ Graphics'),(4,'Iphone 13 mini','Apple','13',2021,'Ecran 6.1 inch, 174 g, Memorie interna:128 GB, Memorie RAM:4 GB, Model procesor:Apple A15 Bionic'),(5,'Iphone 13 PRO','Apple','13',2021,'Dimensiuni:146.7 x 71.5 x 7.7 mm, GPU:Apple GPU (4-core graphics), Numar nuclee:6'),(6,'Galaxy Watch','Samsung','Original',2018,'63g, 13mm thickness Tizen OS 5.5, 4GB 768MB RAM storage, no card slot'),(7,'P40 Pro','Huawei','4',2020,'209g, 9mm thickness Android 10, EMUI 10.1, 128GB/256GB/512GB storage, NM'),(8,'X1 Soul','Allview','X1',2013,'129.4g, 7.9mm thickness Android 4.2, 32GB storage, no card slot'),(9,'Pavilion 15','HP','15-dk2028nq',2020,'Procesor Intel® Core™ i5-11300H, 15.6\", Full HD, 8GB, 512GB SSD, NVIDIA GeForce RTX 3050 Ti 4GB'),(10,'43X81J','Sony','43X81J',2018,'TV, 108 cm, Smart Andoid, 4K Ultra HD, LED, Clasa G'),(11,'Ryzen™ 7','AMD','7',2021,'Procesor 5700G, 20MB, 3.8GHz, Socket AM4, Wraith Stealth'),(12,'24TN510S-PZ','LG','24TN510S-PZ',2018,'Televizor / monitor, 60 cm, Smart, HD, Clasa F'),(13,'Mi','Xiaomi','-',2020,'Casti In-Ear,True Wireless Earbuds Basic 2, Black'),(14,'Mi Body Composition','Xiaomi','Scale 2',2020,'Cantar inteligent, Bluetooth, 10 functii de masurare cu afisarea greutatii, masei musculare, a nivelului de grasime si de apa din corp, stocare pana la 16 profiluri de utilizator, 150 kg, Alb'),(15,'Watch GT2','Huawei','2',2020,'Ceas sport de 46mm, rezistent la apa pana la 50 metri, cu o durata de viata a bateriei de aproape doua saptamani, functii integrate precum apeluri Bluetooth, redare muzicii, monitorizarea calitatii somnului si a activitatii fizice, monitorizarea ritmului cardiac, urmarire GPS si multe altele'),(16,'Galaxy Tab A7 Lite','Samsung','7',2020,'Tableta, Octa-Core, 8.7\", 3GB RAM, 32GB, Wi-Fi, Gray');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-16 12:00:54
