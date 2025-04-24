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
(38, 4, '2025-04-24 00:19:22', 'Log In');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_log`
--
ALTER TABLE `tbl_log`
  ADD PRIMARY KEY (`log_id`),
  ADD KEY `user_id` (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_log`
--
ALTER TABLE `tbl_log`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_log`
--
ALTER TABLE `tbl_log`
  ADD CONSTRAINT `tbl_log_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `tbl_user` (`u_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
