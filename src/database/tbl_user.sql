-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 04, 2025 at 01:46 PM
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
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
