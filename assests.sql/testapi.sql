-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 06, 2020 at 12:49 AM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `testapi`
--
CREATE DATABASE IF NOT EXISTS `testapi` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `testapi`;

-- --------------------------------------------------------

--
-- Table structure for table `results`
--

DROP TABLE IF EXISTS `results`;
CREATE TABLE `results` (
  `category` varchar(200) NOT NULL,
  `type` varchar(200) DEFAULT NULL,
  `difficulty` varchar(200) DEFAULT NULL,
  `question` varchar(200) DEFAULT NULL,
  `correct_answer` varchar(200) DEFAULT NULL,
  `incorrect_answers` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `results`
--

INSERT INTO `results` (`category`, `type`, `difficulty`, `question`, `correct_answer`, `incorrect_answers`) VALUES
('', '1', NULL, NULL, NULL, NULL),
('MATH', 'Addition', 'EASY', '1+1', '2', '3'),
('MATH1', 'Addition', 'EASY', '1+1', '2', '3');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `results`
--
ALTER TABLE `results`
  ADD PRIMARY KEY (`category`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
