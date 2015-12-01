/*
SQLyog v10.2 
MySQL - 5.1.49-community : Database - lab
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`lab` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `lab`;

/*Table structure for table `sample` */

DROP TABLE IF EXISTS `sample`;

CREATE TABLE `sample` (
  `id` varchar(45) NOT NULL,
  `company` varchar(45) NOT NULL,
  `type` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sample` */

insert  into `sample`(`id`,`company`,`type`) values ('000001','南理工1','天平'),('000002','南理工2','温湿计'),('000003','南理工1','温湿计'),('000004','南理工1','血压'),('000005','南理工2','温湿计');

/*Table structure for table `staff` */

DROP TABLE IF EXISTS `staff`;

CREATE TABLE `staff` (
  `id` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `position` varchar(45) NOT NULL,
  `isInService` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `staff` */

insert  into `staff`(`id`,`password`,`name`,`position`,`isInService`) values ('s001','111','admin','管理员',1);

/*Table structure for table `stan_equip` */

DROP TABLE IF EXISTS `stan_equip`;

CREATE TABLE `stan_equip` (
  `id` varchar(45) NOT NULL,
  `type` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `stan_equip` */

/*Table structure for table `tianping_data` */

DROP TABLE IF EXISTS `tianping_data`;

CREATE TABLE `tianping_data` (
  `staff_id` varchar(45) NOT NULL,
  `equip_id` varchar(45) NOT NULL,
  `sample_id` varchar(45) NOT NULL,
  `stan_pressure` double NOT NULL,
  `sample_pressure` double NOT NULL,
  `testtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`staff_id`,`equip_id`,`sample_id`,`testtime`),
  KEY `equipid_index` (`equip_id`),
  KEY `sampleid_index` (`sample_id`),
  CONSTRAINT `tianping_data_ibfk_1` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `tianping_data_ibfk_2` FOREIGN KEY (`equip_id`) REFERENCES `stan_equip` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `tianping_data_ibfk_3` FOREIGN KEY (`sample_id`) REFERENCES `sample` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tianping_data` */

/*Table structure for table `wenshiji_data` */

DROP TABLE IF EXISTS `wenshiji_data`;

CREATE TABLE `wenshiji_data` (
  `staff_id` varchar(45) NOT NULL,
  `equip_id` varchar(45) NOT NULL,
  `sample_id` varchar(45) NOT NULL,
  `stan_wendu` double NOT NULL,
  `stan_shidu` double NOT NULL,
  `sample_wendu` double NOT NULL,
  `sample_shidu` double NOT NULL,
  `testtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`staff_id`,`equip_id`,`sample_id`,`testtime`),
  KEY `equipid_index` (`equip_id`),
  KEY `sampleid_index` (`sample_id`),
  CONSTRAINT `wenshiji_data_ibfk_1` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `wenshiji_data_ibfk_2` FOREIGN KEY (`equip_id`) REFERENCES `stan_equip` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `wenshiji_data_ibfk_3` FOREIGN KEY (`sample_id`) REFERENCES `sample` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `wenshiji_data` */

/*Table structure for table `xueya_data` */

DROP TABLE IF EXISTS `xueya_data`;

CREATE TABLE `xueya_data` (
  `staff_id` varchar(45) NOT NULL,
  `equip_id` varchar(45) NOT NULL,
  `sample_id` varchar(45) NOT NULL,
  `stan_high` double NOT NULL,
  `stan_low` double NOT NULL,
  `sample_high` double NOT NULL,
  `sample_low` double NOT NULL,
  `testtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`staff_id`,`equip_id`,`sample_id`,`testtime`),
  KEY `equipid_index` (`staff_id`),
  KEY `sampleid_index` (`sample_id`),
  KEY `equip_id` (`equip_id`),
  CONSTRAINT `xueya_data_ibfk_1` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `xueya_data_ibfk_2` FOREIGN KEY (`equip_id`) REFERENCES `stan_equip` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `xueya_data_ibfk_3` FOREIGN KEY (`sample_id`) REFERENCES `sample` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `xueya_data` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
