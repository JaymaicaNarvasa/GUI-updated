-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 04, 2025 at 01:49 PM
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
  `amt_to_pay` decimal(10,2) NOT NULL,
  `application_date` datetime NOT NULL,
  `tenure_value` int(11) NOT NULL,
  `tenure_unit` enum('Month','Year') NOT NULL,
  `interest_rate` decimal(5,2) NOT NULL,
  `validid_path` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_application`
--

INSERT INTO `tbl_application` (`loan_id`, `user_id`, `loan_status_id`, `loan_type_id`, `amount`, `amt_to_pay`, `application_date`, `tenure_value`, `tenure_unit`, `interest_rate`, `validid_path`) VALUES
(1, 9, 3, 1, 80000, 0.00, '2025-04-24 07:23:58', 1, 'Month', 5.00, ''),
(2, 4, 3, 1, 80000, 0.00, '2025-04-24 07:23:58', 1, 'Month', 5.00, 'src/userimages/login.png'),
(3, 4, 3, 1, 80000, 0.00, '2025-04-24 08:12:42', 1, 'Month', 5.00, ''),
(4, 4, 4, 1, 5000, 84000.00, '2025-04-24 08:25:27', 1, 'Month', 5.00, ''),
(6, 4, 3, 1, 80000, 0.00, '2025-04-24 09:01:44', 1, 'Month', 5.00, 'src/userimages/BG1.png'),
(7, 4, 3, 1, 80000, 0.00, '2025-04-25 10:08:01', 1, 'Month', 5.00, 'src/userimages/b0b516765c626e366ff657c7f50e68f4.jpg');

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
  MODIFY `loan_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

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
