-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 14, 2025 at 09:08 AM
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
-- Table structure for table `loginacc`
--

CREATE TABLE `loginacc` (
  `l_id` int(20) NOT NULL,
  `l_Name` varchar(30) NOT NULL,
  `l_email` varchar(50) NOT NULL,
  `l_username` varchar(30) NOT NULL,
  `l_password` varchar(30) NOT NULL,
  `l_status` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_activity`
--

CREATE TABLE `tbl_activity` (
  `activity_id` int(11) NOT NULL,
  `loan_id` int(11) NOT NULL,
  `loan_status_id` int(11) NOT NULL,
  `loan_type_id` int(11) NOT NULL,
  `amt_to_pay` decimal(10,2) NOT NULL,
  `date` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_activity`
--

INSERT INTO `tbl_activity` (`activity_id`, `loan_id`, `loan_status_id`, `loan_type_id`, `amt_to_pay`, `date`) VALUES
(1, 4, 1, 4, 100000.00, '2025-04-24 08:25:30'),
(5, 4, 1, 4, 10000.00, '2025-04-24 09:01:46'),
(6, 4, 1, 4, 5000.00, '2025-04-25 10:08:02');

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
(2, 4, 3, 1, 5000, 83600.00, '2025-04-24 07:23:58', 1, 'Month', 4.50, 'src/userimages/login.png'),
(3, 4, 3, 1, 20000, 84000.00, '2025-04-24 08:12:42', 1, 'Month', 5.00, ''),
(4, 4, 1, 1, 5000, 5250.00, '2025-04-24 08:25:27', 1, 'Month', 5.00, ''),
(6, 4, 1, 1, 20000, 21000.00, '2025-04-24 09:01:44', 1, 'Month', 5.00, 'src/userimages/BG1.png'),
(7, 4, 3, 1, 5000, 5225.00, '2025-04-25 10:08:01', 1, 'Month', 4.50, 'src/userimages/b0b516765c626e366ff657c7f50e68f4.jpg');

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
  `c_status` varchar(20) NOT NULL,
  `c_username` varchar(50) NOT NULL,
  `c_password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_customer`
--

INSERT INTO `tbl_customer` (`c_id`, `c_fname`, `c_lname`, `c_gender`, `c_address`, `c_contact`, `c_email`, `c_status`, `c_username`, `c_password`) VALUES
(1, 'Maica x Jema', 'JemaJema', 'Female', 'Sample Address only', '099934232334', 'jemaxx211@gmail.com', 'Married', 'maica', '211'),
(6, 'james', 'gwapo', 'Male', 'TALISAY', '099211', 'gwapo@gmail.com', 'Married', 'gwapo', '211'),
(8, 'name', 'lastname', 'Female', 'address sample', '0999', 'lkjsad@g,ail.com', 'Widowed', 'name', '211');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_loan`
--

CREATE TABLE `tbl_loan` (
  `loan_type_id` int(11) NOT NULL,
  `loan_name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_loan`
--

INSERT INTO `tbl_loan` (`loan_type_id`, `loan_name`) VALUES
(1, 'Home'),
(2, 'Personal'),
(3, 'Education'),
(4, 'Medical');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_log`
--

CREATE TABLE `tbl_log` (
  `log_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `log_date` datetime NOT NULL,
  `action` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_log`
--

INSERT INTO `tbl_log` (`log_id`, `user_id`, `log_date`, `action`) VALUES
(1, 4, '2025-04-03 08:13:47', 'Admin Add a User'),
(2, 4, '2025-04-06 02:53:49', 'Updated User with ID: 6'),
(3, 4, '2025-04-06 02:59:33', 'Updated User with ID: 7'),
(4, 4, '2025-04-06 03:03:08', 'Updated User with ID: 8'),
(5, 8, '2025-04-06 03:04:00', 'Added new user: admin2'),
(6, 8, '2025-04-06 03:09:15', 'Log In'),
(7, 8, '2025-04-06 03:09:29', 'Log Out'),
(8, 4, '2025-04-08 23:38:11', 'Log In'),
(9, 4, '2025-04-08 23:38:45', 'Updated User with ID: 9'),
(10, 4, '2025-04-08 23:45:31', 'Log In'),
(11, 4, '2025-04-08 23:47:08', 'Log In'),
(12, 4, '2025-04-08 23:48:18', 'Log In'),
(13, 4, '2025-04-08 23:50:30', 'Log In'),
(14, 4, '2025-04-09 01:14:00', 'Log In'),
(15, 4, '2025-04-09 01:16:11', 'Log In'),
(16, 4, '2025-04-09 03:42:24', 'Log In'),
(17, 4, '2025-04-09 03:44:28', 'Log In'),
(18, 4, '2025-04-09 03:45:22', 'Log In'),
(19, 4, '2025-04-13 01:38:02', 'Log In'),
(20, 4, '2025-04-20 00:40:08', 'Log In'),
(21, 4, '2025-04-20 01:03:40', 'Log In'),
(22, 4, '2025-04-20 01:12:15', 'Log In'),
(23, 4, '2025-04-22 07:25:03', 'Log In'),
(24, 4, '2025-04-22 07:25:30', 'Log Out'),
(25, 8, '2025-04-22 07:26:17', 'Log In'),
(26, 8, '2025-04-22 07:26:34', 'Updated User with ID: 6'),
(27, 8, '2025-04-22 07:26:50', 'Log Out'),
(28, 6, '2025-04-22 07:26:57', 'Log In'),
(29, 6, '2025-04-22 07:27:24', 'Log Out'),
(30, 6, '2025-04-22 07:28:03', 'Log In'),
(31, 6, '2025-04-22 07:29:23', 'Log In'),
(32, 4, '2025-04-23 06:51:41', 'Log In'),
(33, 4, '2025-04-23 23:44:47', 'Log In'),
(34, 4, '2025-04-24 00:03:36', 'Log In'),
(35, 4, '2025-04-24 00:07:37', 'Exit'),
(36, 4, '2025-04-24 00:16:25', 'Log In'),
(37, 4, '2025-04-24 00:17:11', 'Exit'),
(38, 4, '2025-04-24 00:19:22', 'Log In'),
(39, 4, '2025-04-25 14:33:45', 'Log In'),
(40, 0, '2025-04-25 14:54:58', 'Log Out'),
(41, 4, '2025-04-25 16:46:36', 'Log In'),
(42, 4, '2025-04-25 16:49:31', 'Applied A Loan'),
(43, 4, '2025-04-25 17:07:15', 'Log In'),
(44, 4, '2025-04-25 17:08:10', 'Applied A Loan'),
(45, 4, '2025-04-25 18:03:08', 'Log In'),
(46, 4, '2025-04-25 18:31:59', 'Log In'),
(47, 4, '2025-04-25 18:32:32', 'Log In'),
(48, 4, '2025-04-25 18:39:14', 'Applied A Loan'),
(49, 4, '2025-04-25 21:41:46', 'Log In'),
(50, 4, '2025-04-25 21:54:31', 'Log In'),
(51, 4, '2025-04-25 21:54:42', 'Log Out'),
(52, 8, '2025-04-25 21:55:23', 'Log In'),
(53, 8, '2025-04-29 22:56:31', 'Log In'),
(54, 8, '2025-04-29 22:56:39', 'Soft deleted Application ID: 2'),
(55, 8, '2025-04-29 22:58:26', 'Log Out'),
(56, 0, '2025-04-29 23:11:17', 'Updated User with ID: 9'),
(57, 0, '2025-04-29 23:11:32', 'Updated User with ID: 9'),
(58, 0, '2025-04-29 23:11:50', 'Updated User with ID: 9'),
(59, 0, '2025-04-30 15:14:54', 'Registered Successfully'),
(60, 4, '2025-04-30 16:29:58', 'Log In'),
(61, 4, '2025-04-30 16:30:12', 'Log Out'),
(62, 8, '2025-04-30 16:30:22', 'Log In'),
(63, 8, '2025-04-30 16:31:34', 'Saving data admin profile'),
(64, 8, '2025-05-04 22:08:36', 'Log In'),
(65, 8, '2025-05-04 22:11:00', 'Log In'),
(66, 4, '2025-05-04 23:00:58', 'Log In'),
(67, 4, '2025-05-04 23:01:40', 'Log Out'),
(68, 4, '2025-05-05 22:06:54', 'Log In'),
(69, 4, '2025-05-05 22:07:49', 'Soft deleted Application ID: 4'),
(70, 4, '2025-05-05 22:07:56', 'Soft deleted Application ID: 4'),
(71, 4, '2025-05-05 23:15:31', 'Log In'),
(72, 4, '2025-05-05 23:20:08', 'Log In'),
(73, 4, '2025-05-05 23:31:54', 'Log In'),
(74, 4, '2025-05-14 12:58:46', 'Log In');

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
(2, 'Staff'),
(3, 'Customer'),
(4, 'Cancelled');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_security`
--

CREATE TABLE `tbl_security` (
  `sq_id` int(11) NOT NULL,
  `u_id` int(11) NOT NULL,
  `question` varchar(100) NOT NULL,
  `answer` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_security`
--

INSERT INTO `tbl_security` (`sq_id`, `u_id`, `question`, `answer`) VALUES
(2, 8, 'What is the name of your first pet?', 'Fc9NSLPB/4svSjCvUwZ+KXLgjsHoW4AbQmjgFhq+TuA='),
(3, 8, 'What is the name of your first pet?', 'Fc9NSLPB/4svSjCvUwZ+KXLgjsHoW4AbQmjgFhq+TuA='),
(4, 4, 'What is the name of your first pet?', 'Fc9NSLPB/4svSjCvUwZ+KXLgjsHoW4AbQmjgFhq+TuA=');

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
(4, 'Inactive'),
(5, 'Cancelled');

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
  `role_id` varchar(50) NOT NULL,
  `profile_pic` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`u_id`, `u_fname`, `u_lname`, `u_username`, `u_password`, `u_address`, `u_email`, `u_contact`, `u_status`, `role_id`, `profile_pic`) VALUES
(1, 'testing', 'test9001', 'test', 'test', 'test', 'test@gmail.com', 22456984, 'Pending', '2', 'src/images/default.png'),
(2, 'testing1', 'test10101', 'test1', 'k36NX7tIvUlJU2zWW401xCa4DS+DDFwwjizexCKuIkQ=', 'SAMPLE', 'tes1t@gmail.com', 1231, 'Pending', '2', 'src/images/default.png'),
(3, 'testing', 'test', 'test2', '47DEQpj8HBSa+/TImW+5JCeuQeRkm5NMpJWZG3hSuFU=', 'SAMPLE2', 'test2@gmail.com', 99123456, 'Active', '4', 'src/images/default.png'),
(4, 'test3', 'test3', 'test3', 'uCLxzS3PxoW0foPjmAKJ/V2OP/OoLe8k19HWi7Jy6zI=', 'SAMPLE3', 'test3@gmail.com', 99123456, 'Active', '3', 'src/images/default.png'),
(6, 'user1', 'user1', 'user1', 'uCLxzS3PxoW0foPjmAKJ/V2OP/OoLe8k19HWi7Jy6zI=', 'SAmple of user1', 'user1@gmail.com', 993456127, 'Active', '2', 'src/images/default.png'),
(8, 'admin1', 'admin1', 'admin1', 'uCLxzS3PxoW0foPjmAKJ/V2OP/OoLe8k19HWi7Jy6zI=', 'Sample of admin1', 'admin10@gmail.com', 5419671, 'Active', '1', 'src/userimages/5860428b-4ec1-49f5-982e-8bfcc2f7cb31.jfif'),
(9, '1user1', '1user1', '1user1', 'ky88G1YlfOhTmsJp16q0JVDaz4gY0HXwvfGZBWKq4+8=', 'Sample 123 User', '1user1@gmail.com', 2416478, 'Pending', '1', 'src/images/default.png'),
(10, 'admin2', 'admin2', 'admin2', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'Sample admin 2', 'admin2@gmail.com', 21320213, 'Pending', '4', 'src/images/default.png'),
(11, 'asdasd', 'asdasd', 'asdasd', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', 'asdas213', 'asdasd@gmail.com', 949134319, 'Pending', '2', 'src/images/default.png'),
(12, 'First Name', 'Last Name', 'asd', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', 'asd213', 'asd123@gmail.com', 949134319, 'Pending', '1', 'src/images/default.png');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `loginacc`
--
ALTER TABLE `loginacc`
  ADD PRIMARY KEY (`l_id`);

--
-- Indexes for table `tbl_activity`
--
ALTER TABLE `tbl_activity`
  ADD PRIMARY KEY (`activity_id`),
  ADD KEY `loan_id` (`loan_id`),
  ADD KEY `loan_status_id` (`loan_status_id`),
  ADD KEY `loan_type_id` (`loan_type_id`);

--
-- Indexes for table `tbl_application`
--
ALTER TABLE `tbl_application`
  ADD PRIMARY KEY (`loan_id`),
  ADD KEY `user_id` (`user_id`),
  ADD KEY `loan_type_id` (`loan_type_id`),
  ADD KEY `loan_status_id` (`loan_status_id`);

--
-- Indexes for table `tbl_customer`
--
ALTER TABLE `tbl_customer`
  ADD PRIMARY KEY (`c_id`);

--
-- Indexes for table `tbl_loan`
--
ALTER TABLE `tbl_loan`
  ADD PRIMARY KEY (`loan_type_id`);

--
-- Indexes for table `tbl_log`
--
ALTER TABLE `tbl_log`
  ADD PRIMARY KEY (`log_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `tbl_role`
--
ALTER TABLE `tbl_role`
  ADD PRIMARY KEY (`role_id`);

--
-- Indexes for table `tbl_security`
--
ALTER TABLE `tbl_security`
  ADD PRIMARY KEY (`sq_id`),
  ADD KEY `u_id` (`u_id`);

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
-- AUTO_INCREMENT for table `loginacc`
--
ALTER TABLE `loginacc`
  MODIFY `l_id` int(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_activity`
--
ALTER TABLE `tbl_activity`
  MODIFY `activity_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tbl_application`
--
ALTER TABLE `tbl_application`
  MODIFY `loan_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tbl_customer`
--
ALTER TABLE `tbl_customer`
  MODIFY `c_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `tbl_loan`
--
ALTER TABLE `tbl_loan`
  MODIFY `loan_type_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `tbl_log`
--
ALTER TABLE `tbl_log`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=75;

--
-- AUTO_INCREMENT for table `tbl_security`
--
ALTER TABLE `tbl_security`
  MODIFY `sq_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `tbl_status`
--
ALTER TABLE `tbl_status`
  MODIFY `loan_status_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_activity`
--
ALTER TABLE `tbl_activity`
  ADD CONSTRAINT `tbl_activity_ibfk_1` FOREIGN KEY (`loan_id`) REFERENCES `tbl_application` (`loan_id`),
  ADD CONSTRAINT `tbl_activity_ibfk_2` FOREIGN KEY (`loan_status_id`) REFERENCES `tbl_status` (`loan_status_id`),
  ADD CONSTRAINT `tbl_activity_ibfk_3` FOREIGN KEY (`loan_type_id`) REFERENCES `tbl_loan` (`loan_type_id`);

--
-- Constraints for table `tbl_application`
--
ALTER TABLE `tbl_application`
  ADD CONSTRAINT `tbl_application_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `tbl_user` (`u_id`),
  ADD CONSTRAINT `tbl_application_ibfk_3` FOREIGN KEY (`loan_type_id`) REFERENCES `tbl_loan` (`loan_type_id`),
  ADD CONSTRAINT `tbl_application_ibfk_4` FOREIGN KEY (`loan_status_id`) REFERENCES `tbl_status` (`loan_status_id`);

--
-- Constraints for table `tbl_security`
--
ALTER TABLE `tbl_security`
  ADD CONSTRAINT `tbl_security_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `tbl_user` (`u_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
