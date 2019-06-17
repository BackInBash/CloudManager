--
-- Database: `CloudManager`
--

-- --------------------------------------------------------

--
-- Table structure for table `Server`
--

CREATE TABLE `Server` (
  `ID` bigint(20) NOT NULL PRIMARY KEY,
  `IP` varchar(32) COLLATE utf8_bin NOT NULL,
  `Name` varchar(255) COLLATE utf8_bin NOT NULL,
  `Tag` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `SSH`
--

CREATE TABLE `SSH` (
  `ID` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `ServerID` bigint(20) NOT NULL,
  `PublicKey` varchar(1024) COLLATE utf8_bin NOT NULL,
  `PrivateKey` varchar(1024) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Table structure for table `CloudInit`
--

CREATE TABLE `CloudInit` (
  `ID` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `Name` varchar(255) COLLATE utf8_bin NOT NULL,
  `Payload` mediumtext COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;