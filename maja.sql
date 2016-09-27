
-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Sep 15, 2016 at 09:47 PM
-- Server version: 10.0.20-MariaDB
-- PHP Version: 5.2.17

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `u677217375_majac`
--

-- --------------------------------------------------------

--
-- Table structure for table `maja`
--

CREATE TABLE IF NOT EXISTS `maja` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `street` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `zanimanje` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `plata` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  FULLTEXT KEY `name` (`name`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=11 ;

--
-- Dumping data for table `maja`
--

INSERT INTO `maja` (`id`, `name`, `street`, `zanimanje`, `plata`) VALUES
(1, 'maja', 'jerkovic', 'tehnolog', '500'),
(2, 'pera', 'ulica', 'majstor', '300'),
(3, 'laza', 'jerkovic', 'tehnolog', '300'),
(4, 'mika', 'bulevar', 'advokat', '800'),
(5, 'ana', 'bulevar', 'prodavac', '200'),
(6, 'bojana', 'jerkovic', 'novinar', '400'),
(7, 'bojana', 'bulevar', 'advokat', '750'),
(8, 'maja', 'kumodraska', 'frizer', '200'),
(9, 'milica', 'jerkovic', 'nastavnik', '350'),
(10, 'jelena', 'ulica', 'pedagog', '250');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
