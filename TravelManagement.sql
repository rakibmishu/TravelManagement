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
 (17,'Sokal Ahmed','123','Abul Hossain',27,'Sokal','who is your favourite teacher?','123',1812870119,'Abdul Bari'),
 (18,'riaj','123','sobhan',27,'riaj','who is your favourite teacher?','123',17589654,'bari'),
 (19,'rrrrrrr','234','tttttttttt',34,'123','who is your favourite teacher?','234',12346,'asdfg'),
 (20,'Rakib Hossain','123','Abul Hossain',28,'Mishu','who is your favourite teacher?','123',1838983157,'*******'),
 (21,'Sadat Bin Fakhrullah','123','Fakhrullah',7,'ihan','What is your father name?','123',1840991066,'fakhrullah');
/*!40000 ALTER TABLE `signin` ENABLE KEYS */;


--
-- Definition of table `specialpackage`
--

DROP TABLE IF EXISTS `specialpackage`;
CREATE TABLE `specialpackage` (
  `ID` int(10) unsigned NOT NULL auto_increment,
  `Customer_ID` varchar(45) NOT NULL,
  `First_Name` varchar(45) NOT NULL,
  `Last_Name` varchar(45) NOT NULL,
  `Address` varchar(45) NOT NULL,
  `E_mail` varchar(45) NOT NULL,
  `Mobile` varchar(45) NOT NULL,
  `Bus` varchar(45) NOT NULL,
  `Depurture` varchar(45) NOT NULL,
  `Destination` varchar(45) NOT NULL,
  `Accommodation` varchar(45) NOT NULL,
  `Vehicle` varchar(45) NOT NULL,
  `Sub_Total` int(10) unsigned NOT NULL,
  `Tax` int(10) unsigned NOT NULL,
  `Total` int(10) NOT NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `specialpackage`
--

/*!40000 ALTER TABLE `specialpackage` DISABLE KEYS */;
INSERT INTO `specialpackage` (`ID`,`Customer_ID`,`First_Name`,`Last_Name`,`Address`,`E_mail`,`Mobile`,`Bus`,`Depurture`,`Destination`,`Accommodation`,`Vehicle`,`Sub_Total`,`Tax`,`Total`) VALUES 
 (1,'h24','ssdd','fgttt','rrrr','eeee','345','AC','Fokirapul','Cox\'s Bazar-3 days','Double','By Air',16700,668,17368),
 (2,'1','Rakib','Hossain','Noakhali','rakib.mishu1990@gmail.com','01838983157','AC','Sayedabad','Sylhet- 3 days','Double','By Air',16200,648,16848),
 (3,'2','Rakib','','rakib.mishu1990@gmail.com','','01838983157','AC','Sayedabad','Saint Martins- 5 days','Double','None',16200,648,16848),
 (4,'3','Tanveer','Hossain','Dhaka','tanver@gmail.com','01254','Non_AC','Komolapur','Saint Martins- 5 days','Double','By Air',16000,640,16640),
 (5,'4','Baby','Naznin','DEMRA','babynaznin@gmail.com','012586','Non_AC','Fokirapul','Cox\'s Bazar-3 days','Double','Bus',12500,500,13000),
 (6,'4','Baby','Naznin','DEMRA','babynaznin@gmail.com','012586','Non_AC','Fokirapul','Saint Martins- 5 days','Single','By Air',15000,600,15600),
 (7,'4','Baby','Naznin','DEMRA','babynaznin@gmail.com','012586','AC','Fokirapul','Saint Martins- 5 days','Single','Bus',13200,528,13728),
 (8,'6','','','','','','Non_AC','Sayedabad','Sylhet- 3 days','Double','By Air',16200,648,16848),
 (9,'3','Tanveer','Hossain','Dhaka','tanver@gmail.com','01254','Non_AC','Komolapur','Sylhet- 3 days','Double','By Air',16200,648,16848),
 (10,'123','kkkk','kkkk','jkkl','asddf','0125896','Non_AC','Sayedabad','Sylhet- 3 days','Single','By Air',15200,608,15808),
 (11,'123','dfgh','','','','','Non_AC','Shaymoli','Sylhet- 3 days','Single','Bus',11000,440,11440),
 (12,'1236061','Rakib','Mishu','Noakhali','rakibmishu1990@gmail.com','01838983157','Non_AC','Sayedabad','Saint Martins- 5 days','Single','Bus',12000,480,12480),
 (13,'111','qqqq','wwww','aaa','aaaa','123dffg','Non_AC','Sayedabad','Sylhet- 3 days','Double','By Air',16200,648,16848),
 (14,'12360362','Rakib','Mishu','Noakhali','rakibmishu1990@gmail.com','01838983157','Non_AC','Sayedabad','Sylhet- 3 days','Double','By Air',16200,648,16848);
/*!40000 ALTER TABLE `specialpackage` ENABLE KEYS */;


--
-- Definition of table `traveller`
--

DROP TABLE IF EXISTS `traveller`;
CREATE TABLE `traveller` (
  `ID` int(10) unsigned NOT NULL auto_increment,
  `Name` varchar(45) NOT NULL,
  `Father_Name` varchar(45) NOT NULL,
  `Phone` varchar(45) NOT NULL,
  `Passport_No` varchar(45) NOT NULL,
  `Passport_Issue` varchar(45) NOT NULL,
  `Passport_Expiry` varchar(45) NOT NULL,
  `Address` varchar(45) NOT NULL,
  `Date` varchar(45) NOT NULL,
  `Cost_Rate` int(10) unsigned NOT NULL,
  `Ticket_Rate` int(10) unsigned NOT NULL,
  `Net_Profit` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `traveller`
--

/*!40000 ALTER TABLE `traveller` DISABLE KEYS */;
INSERT INTO `traveller` (`ID`,`Name`,`Father_Name`,`Phone`,`Passport_No`,`Passport_Issue`,`Passport_Expiry`,`Address`,`Date`,`Cost_Rate`,`Ticket_Rate`,`Net_Profit`) VALUES 
 (1,'dfgh','qwer','dfgg','dfggh','ddrty4','45tgg','fghh','23445',1234,234,1000),
 (2,'mohsin','dfgghjh','34r56yyu','ghjkkl','errtyu','rttyu','yyuii','ghhjk',1236,235,1001),
 (3,'Rongdhonu','Akash','ojana','00000000no','Feb 10, 2018','Feb 8, 2023','soFar','Feb 7, 2018',3000,2500,500),
 (4,'Samsul ajam','Shahadat Hossain','019856321','h568gt','Feb 9, 2018','Feb 16, 2024','Noakhali','Feb 11, 2018',3000,2000,1000);
/*!40000 ALTER TABLE `traveller` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
