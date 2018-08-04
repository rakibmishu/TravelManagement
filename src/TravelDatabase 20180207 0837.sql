-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.41-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema travel_management
--

CREATE DATABASE IF NOT EXISTS travel_management;
USE travel_management;

--
-- Definition of table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `First_Name` varchar(45) NOT NULL,
  `Last_Name` varchar(45) NOT NULL,
  `Address` varchar(45) NOT NULL,
  `E_mail` varchar(45) NOT NULL,
  `Mobile` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`id`,`First_Name`,`Last_Name`,`Address`,`E_mail`,`Mobile`) VALUES 
 (1,'Rakib','Hossain','Noakhali','rakib.mishu1990@gmail.com','01838983157'),
 (2,'Mohsin','kabir','Comilla','mohsin@gmail.com','01725894466'),
 (3,'Mohsin','kabir','Comilla','mohsin@gmail.com','01725894466'),
 (4,'Junayet','ahmed','magura','junayet@gmail.com','018758964'),
 (5,'Younus','Khan','Dhaka','younus@gmail.com','01724589');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;


--
-- Definition of table `signin`
--

DROP TABLE IF EXISTS `signin`;
CREATE TABLE `signin` (
  `ID` int(10) unsigned NOT NULL auto_increment,
  `Name` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `Father_Name` varchar(45) NOT NULL,
  `Age` int(10) unsigned NOT NULL,
  `User_Name` varchar(45) NOT NULL,
  `Security_Question` varchar(45) NOT NULL,
  `Confirm_Password` varchar(45) NOT NULL,
  `Mobile` int(10) unsigned default NULL,
  `Answer` varchar(45) NOT NULL,
  PRIMARY KEY  USING BTREE (`ID`,`Confirm_Password`,`Security_Question`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `signin`
--

/*!40000 ALTER TABLE `signin` DISABLE KEYS */;
INSERT INTO `signin` (`ID`,`Name`,`Password`,`Father_Name`,`Age`,`User_Name`,`Security_Question`,`Confirm_Password`,`Mobile`,`Answer`) VALUES 
 (1,'Rakib','123','Abul Hossain',27,'rakib','which is your favourite book?','123',1838983157,'The Vinci Code'),
 (2,'Rifat','456','',0,'','','',NULL,''),
 (3,'Babu','789','',0,'','','',NULL,''),
 (4,'Mohsin','123','',0,'','','',NULL,''),
 (5,'Mohsin','123','',0,'','','',NULL,''),
 (6,'Mohsin','123','',0,'','','',NULL,''),
 (7,'Mohsin','123','',0,'','','',NULL,''),
 (8,'Mohsin','123','',0,'','','',NULL,''),
 (9,'Mohsin','123','',0,'','','',NULL,''),
 (10,'Mohsin','123','',0,'','','',NULL,''),
 (11,'Mohsin','123','',0,'','','',NULL,''),
 (12,'Tushar Imran','which is your favourite book?','Md Mazed',13,'123','Tushar','123',1818834853,''),
 (13,'Rehnuma Tabassum','123','Md Mazed',16,'Upoma','which is your favourite book?','123',1720385194,''),
 (14,'Nishad','123','Titu',10,'nishad','who is your favourite teacher?','123',1829481359,''),
 (15,'Mazed','1234','Mofizur',40,'1234','who is your favourite teacher?','Mannan',1720385194,'mazed'),
 (16,'Rashida Akhter','1234','Abul Hossain',35,'koly','What is your father name?','1234',1833272764,'Abul Hossain'),
 (17,'Sokal Ahmed','123','Abul Hossain',27,'Sokal','who is your favourite teacher?','123',1812870119,'Abdul Bari');
/*!40000 ALTER TABLE `signin` ENABLE KEYS */;


--
-- Definition of table `traveller`
--

DROP TABLE IF EXISTS `traveller`;
CREATE TABLE `traveller` (
  `ID` int(10) unsigned NOT NULL auto_increment,
  `Name` varchar(45) NOT NULL,
  `Father_Name` varchar(45) NOT NULL,
  `Phone` int(10) unsigned NOT NULL,
  `Passport_No` varchar(45) NOT NULL,
  `Passport_Issue` varchar(45) NOT NULL,
  `Passport_Expiry` varchar(45) NOT NULL,
  `Address` varchar(45) NOT NULL,
  `Date` varchar(45) NOT NULL,
  `Path` varchar(45) NOT NULL,
  `Cost_Rate` int(10) unsigned NOT NULL,
  `Ticket_Rate` int(10) unsigned NOT NULL,
  `Net_Profit` int(10) unsigned NOT NULL,
  `Image` blob NOT NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `traveller`
--

/*!40000 ALTER TABLE `traveller` DISABLE KEYS */;
INSERT INTO `traveller` (`ID`,`Name`,`Father_Name`,`Phone`,`Passport_No`,`Passport_Issue`,`Passport_Expiry`,`Address`,`Date`,`Path`,`Cost_Rate`,`Ticket_Rate`,`Net_Profit`,`Image`) VALUES 
 (1,'eeer','rrr',1234,'f455','23e4','23er5','cfg','123','rrt',1234,345,654,'');
/*!40000 ALTER TABLE `traveller` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
