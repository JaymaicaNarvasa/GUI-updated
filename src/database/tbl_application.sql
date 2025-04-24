-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 24, 2025 at 10:16 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gui_bank`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_application`
--

CREATE TABLE `tbl_application` (
  `loan_id` int(20) NOT NULL,
  `user_id` int(20) NOT NULL,
  `loan_status_id` int(20) NOT NULL,
  `loan_type_id` int(20) NOT NULL,
  `amount` int(20) NOT NULL,
  `application_date` varchar(20) NOT NULL,
  `tenure_value` int(11) NOT NULL,
  `tenure_unit` enum('Month','Year') NOT NULL,
  `interest_rate` int(11) NOT NULL,
  `validid_path` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_application`
--

INSERT INTO `tbl_application` (`loan_id`, `user_id`, `loan_status_id`, `loan_type_id`, `amount`, `application_date`, `tenure_value`, `tenure_unit`, `interest_rate`, `validid_path`) VALUES
(1, 9, 3, 2, 500000, '5/20/2019', 5, 'Month', 6, '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_application`
--
ALTER TABLE `tbl_application`
  ADD PRIMARY KEY (`loan_id`),
  ADD KEY `user_id` (`user_id`),
  ADD KEY `loan_type_id` (`loan_type_id`),
  ADD KEY `loan_status_id` (`loan_status_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_application`
--
ALTER TABLE `tbl_application`
  MODIFY `loan_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_application`
--
ALTER TABLE `tbl_application`
  ADD CONSTRAINT `tbl_application_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `tbl_user` (`u_id`),
  ADD CONSTRAINT `tbl_application_ibfk_3` FOREIGN KEY (`loan_type_id`) REFERENCES `tbl_loan` (`loan_type_id`),
  ADD CONSTRAINT `tbl_application_ibfk_4` FOREIGN KEY (`loan_status_id`) REFERENCES `tbl_status` (`loan_status_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
