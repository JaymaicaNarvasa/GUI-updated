-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 31, 2025 at 12:23 PM
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
  `amount` int(20) NOT NULL,
  `application_date` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_customer`
--

CREATE TABLE `tbl_customer` (
  `c_id` int(20) NOT NULL,
  `c_fname` varchar(50) NOT NULL,
  `c_lname` varchar(50) NOT NULL,
  `c_gender` varchar(10) NOT NULL,
  `c_address` varchar(50) NOT NULL,
  `c_contact` varchar(15) NOT NULL,
  `c_email` varchar(30) NOT NULL,
  `c_status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_customer`
--

INSERT INTO `tbl_customer` (`c_id`, `c_fname`, `c_lname`, `c_gender`, `c_address`, `c_contact`, `c_email`, `c_status`) VALUES
(1, 'Maica x Jema', 'JemaJema', 'Female', 'Sample Address only', '099934232334', 'jemaxx211@gmail.com', 'Married'),
(6, 'james', 'gwapo', 'Male', 'TALISAY', '099211', 'gwapo@gmail.com', 'Married'),
(8, 'name', 'lastname', 'Female', 'address sample', '0999', 'lkjsad@g,ail.com', 'Widowed');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_log`
--

CREATE TABLE `tbl_log` (
  `log_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `log_date` timestamp NOT NULL DEFAULT current_timestamp(),
  `action` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_payment`
--

CREATE TABLE `tbl_payment` (
  `payment_id` int(20) NOT NULL,
  `loan_id` int(20) NOT NULL,
  `amount_paid` int(20) NOT NULL,
  `payment_due` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_role`
--

CREATE TABLE `tbl_role` (
  `role_id` int(20) NOT NULL,
  `role_name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_role`
--

INSERT INTO `tbl_role` (`role_id`, `role_name`) VALUES
(1, 'Admin'),
(2, 'User');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_status`
--

CREATE TABLE `tbl_status` (
  `loan_status_id` int(20) NOT NULL,
  `status_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_status`
--

INSERT INTO `tbl_status` (`loan_status_id`, `status_name`) VALUES
(1, 'Pending'),
(2, 'Approved'),
(3, 'Rejected'),
(4, 'Disbursed'),
(5, 'Fully Paid'),
(6, 'Overdue');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `u_id` int(10) NOT NULL,
  `u_fname` varchar(30) NOT NULL,
  `u_lname` varchar(30) NOT NULL,
  `u_username` varchar(50) NOT NULL,
  `u_password` varchar(255) NOT NULL,
  `u_address` varchar(50) NOT NULL,
  `u_email` varchar(50) NOT NULL,
  `u_contact` int(15) NOT NULL,
  `u_status` varchar(20) NOT NULL DEFAULT 'Active',
  `role_id` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`u_id`, `u_fname`, `u_lname`, `u_username`, `u_password`, `u_address`, `u_email`, `u_contact`, `u_status`, `role_id`) VALUES
(1, 'testing', 'test9001', 'test', 'test', 'test', 'test@gmail.com', 22456984, 'Pending', '2'),
(2, 'testing1', 'test10101', 'test1', 'k36NX7tIvUlJU2zWW401xCa4DS+DDFwwjizexCKuIkQ=', 'SAMPLE', 'tes1t@gmail.com', 1231, 'Pending', '2'),
(3, 'testing', 'test', 'test2', '47DEQpj8HBSa+/TImW+5JCeuQeRkm5NMpJWZG3hSuFU=', 'SAMPLE2', 'test2@gmail.com', 99123456, 'Active', '1'),
(4, 'test3', 'test3', 'test3', 'uCLxzS3PxoW0foPjmAKJ/V2OP/OoLe8k19HWi7Jy6zI=', 'SAMPLE3', 'test3@gmail.com', 99123456, 'Active', '1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_application`
--
ALTER TABLE `tbl_application`
  ADD PRIMARY KEY (`loan_id`),
  ADD KEY `user_id` (`user_id`),
  ADD KEY `loan_status_id` (`loan_status_id`);

--
-- Indexes for table `tbl_customer`
--
ALTER TABLE `tbl_customer`
  ADD PRIMARY KEY (`c_id`);

--
-- Indexes for table `tbl_log`
--
ALTER TABLE `tbl_log`
  ADD PRIMARY KEY (`log_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `tbl_payment`
--
ALTER TABLE `tbl_payment`
  ADD PRIMARY KEY (`payment_id`),
  ADD KEY `loan_id` (`loan_id`);

--
-- Indexes for table `tbl_role`
--
ALTER TABLE `tbl_role`
  ADD PRIMARY KEY (`role_id`);

--
-- Indexes for table `tbl_status`
--
ALTER TABLE `tbl_status`
  ADD PRIMARY KEY (`loan_status_id`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_application`
--
ALTER TABLE `tbl_application`
  MODIFY `loan_id` int(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_customer`
--
ALTER TABLE `tbl_customer`
  MODIFY `c_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `tbl_log`
--
ALTER TABLE `tbl_log`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_payment`
--
ALTER TABLE `tbl_payment`
  MODIFY `payment_id` int(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_status`
--
ALTER TABLE `tbl_status`
  MODIFY `loan_status_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_application`
--
ALTER TABLE `tbl_application`
  ADD CONSTRAINT `tbl_application_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `tbl_user` (`u_id`),
  ADD CONSTRAINT `tbl_application_ibfk_2` FOREIGN KEY (`loan_status_id`) REFERENCES `tbl_status` (`loan_status_id`);

--
-- Constraints for table `tbl_log`
--
ALTER TABLE `tbl_log`
  ADD CONSTRAINT `tbl_log_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `tbl_user` (`u_id`);

--
-- Constraints for table `tbl_payment`
--
ALTER TABLE `tbl_payment`
  ADD CONSTRAINT `tbl_payment_ibfk_1` FOREIGN KEY (`loan_id`) REFERENCES `tbl_application` (`loan_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
