-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 02 Jun 2020 pada 05.36
-- Versi server: 10.4.8-MariaDB
-- Versi PHP: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `supermarket`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `akun`
--

CREATE TABLE `akun` (
  `idAkun` int(11) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `noTelp` varchar(15) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `jabatan` varchar(10) DEFAULT NULL,
  `foto` blob DEFAULT NULL,
  `tglMasuk` date DEFAULT NULL,
  `username` varchar(15) DEFAULT NULL,
  `password` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `akun`
--

INSERT INTO `akun` (`idAkun`, `nama`, `noTelp`, `email`, `jabatan`, `foto`, `tglMasuk`, `username`, `password`) VALUES
(1, 'I Nyoman Wina Artha Setiawan', '08133822357x', 'arthazwina@gmail.com', 'Manager', NULL, '2020-05-24', 'admin', 'admin'),
(2, 'Hairul Lana', '081999999999', 'hairullana@gmail.com', 'Kasir', NULL, '2020-05-24', 'kasir', 'kasir'),
(3, 'Putu Bayu Baskara', '081888888888', 'yubayu@gmail.com', 'Karyawan', NULL, '2020-05-24', 'karyawan', 'karyawan');

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `idBarang` int(11) NOT NULL,
  `namaBarang` varchar(50) DEFAULT NULL,
  `idKategori` int(11) DEFAULT NULL,
  `stok` int(11) DEFAULT NULL,
  `satuan` varchar(10) DEFAULT NULL,
  `hargaJual` int(11) DEFAULT NULL,
  `diskon` int(11) DEFAULT NULL,
  `poin` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`idBarang`, `namaBarang`, `idKategori`, `stok`, `satuan`, `hargaJual`, `diskon`, `poin`) VALUES
(1, 'Leo Kripik Kentang Rumput Laut 14gr', 1, 2, 'pcs', 1000, 500, 0),
(2, 'Leo Kripik Kentang Sapi Panggang 14gr', 1, -4, 'pcs', 1000, 0, 1000),
(3, 'Leo kripik kentang ayam original 14gr', 1, 5, 'pcs', 1000, 0, 0),
(4, 'Leanet Beef BBQ 8gr', 1, 0, 'pcs', 500, 0, 0),
(5, 'Leanet Seaweed 8gr', 1, 5, 'pcs', 500, 0, 0),
(6, 'Piattoz sapi panggang 12gr', 1, 5, 'pcs', 1000, 0, 0),
(7, 'Piattoz barbeque 12gr', 1, 5, 'pcs', 1000, 0, 0),
(8, 'Kentang goreng ala french fries 18gr', 1, 5, 'pcs', 1000, 0, 0),
(9, 'Twistko salsa rasa balado 17gr', 1, 5, 'pcs', 1000, 0, 0),
(10, 'Kenji net rasa ayam 16gr', 1, 5, 'pcs', 1000, 0, 0),
(11, 'Kenji net rasa dendeng 16gr', 1, 5, 'pcs', 1000, 0, 0),
(12, 'Kenji Kari ayam 10gr', 1, 5, 'pcs', 500, 0, 0),
(13, 'Kenji Sapi Panggang 10gr', 1, 5, 'pcs', 500, 0, 0),
(14, 'Spix soba rasa sambal balado 24gr', 1, 5, 'pcs', 1000, 0, 0),
(15, 'Go piramid kripik kentang 8gr', 1, 5, 'pcs', 500, 0, 0),
(16, 'Kriptella level 9 18gr', 1, 5, 'pcs', 500, 0, 0),
(17, 'Richeese nabati fire 10gr', 1, 5, 'pcs', 500, 0, 0),
(18, 'Richeese nabati Banana 10gr', 1, 5, 'pcs', 500, 0, 0),
(19, 'Momogi Tutti Frutti 10gr', 1, 5, 'pcs', 500, 0, 0),
(20, 'Gery toya-toya stick coklat 10gr', 1, 5, 'pcs', 500, 0, 0),
(21, 'Gery Toya Toya Beries 9gr', 1, 5, 'pcs', 500, 0, 0),
(22, 'Gery Toya Toya pisang 9gr', 1, 5, 'pcs', 500, 0, 0),
(23, 'Gery 2 Choco Roll Keju 11gr', 1, 5, 'pcs', 500, 0, 0),
(24, 'Gery 2 Choco Roll Coklat 11gr', 1, 5, 'pcs', 500, 0, 0),
(25, 'Gery Odonat 12gr', 1, 5, 'pcs', 500, 0, 0),
(26, 'Gery Chopstick 10gr', 1, 5, 'pcs', 500, 0, 0),
(27, 'Gery Bischoc 10gr', 1, 5, 'pcs', 500, 0, 0),
(28, 'Good Time 21gr', 1, 5, 'pcs', 1000, 0, 0),
(29, 'All stars 16gr', 1, 5, 'pcs', 1000, 0, 0),
(30, 'Morillo Balado pedas 9gr', 1, 5, 'pcs', 500, 0, 0),
(31, 'Morillo cream choclate 9gr', 1, 5, 'pcs', 500, 0, 0),
(32, 'Bismaxx 18gr', 1, 5, 'pcs', 500, 0, 0),
(33, 'Togo coklat 17,5gr', 1, 5, 'pcs', 500, 0, 0),
(34, 'Mori bee 14gr', 1, 5, 'pcs', 500, 0, 0),
(35, 'Bolu pandan 12gr', 1, 5, 'pcs', 500, 0, 0),
(36, 'Bolu chocholate 12gr', 1, 5, 'pcs', 500, 0, 0),
(37, 'Top strawberry 11gr', 1, 5, 'pcs', 500, 0, 0),
(38, 'Top caramel 11gr', 1, 5, 'pcs', 500, 0, 0),
(39, 'Tango wafer susu vanila 10gr', 1, 5, 'pcs', 500, 0, 0),
(40, 'Fenisia  crim coklat 90gr', 1, 5, 'pcs', 3000, 0, 0),
(41, 'Fenisia crim coklat 280gr', 1, 5, 'pcs', 5500, 0, 0),
(42, 'Fenisia crim vanila 280gr', 1, 5, 'pcs', 5500, 0, 0),
(43, 'Richoco nabati time break 12gr', 1, 5, 'pcs', 500, 0, 0),
(44, 'Gery wafelatos 10gr', 1, 5, 'pcs', 500, 0, 0),
(45, 'Kraft tuc seaweed 21gr', 1, 5, 'pcs', 500, 0, 0),
(46, 'Roma biscuit kelapa 300gr', 1, 5, 'pcs', 6500, 0, 0),
(47, 'Malkist rasa abon sapi 145gr', 1, 5, 'pcs', 4500, 0, 0),
(48, 'Malkist crackers 137gr', 1, 5, 'pcs', 4500, 0, 0),
(49, 'Kukis mochachino 300gr', 1, 5, 'pcs', 5500, 0, 0),
(50, 'kukis durian 300gr', 1, 5, 'pcs', 5500, 0, 0),
(51, 'Kukis butter 300g4', 1, 5, 'pcs', 5500, 0, 0),
(52, 'Kukis kelapa 115gr', 1, 5, 'pcs', 3000, 0, 0),
(53, 'Better susu vanila 115gr', 1, 5, 'pcs', 3000, 0, 0),
(54, 'Orenz Chocolate 16gr', 1, 5, 'pcs', 500, 0, 0),
(55, 'OrenzChoco Duo 16gr', 1, 5, 'pcs', 500, 0, 0),
(56, 'Monde Favourite 575gr', 1, 5, 'pcs', 75000, 0, 0),
(57, 'Monde Butter Cookies 908gr', 1, 5, 'pcs', 84000, 0, 0),
(58, 'Beng-beng karamel 20gr', 1, 5, 'pcs', 1000, 0, 0),
(59, 'Beng-beng hazelnut 20gr', 1, 5, 'pcs', 1000, 0, 0),
(60, 'origo chocolate 16,5gr', 1, 5, 'pcs', 500, 0, 0),
(61, 'Go smily coklat 16gr', 1, 5, 'pcs', 500, 0, 0),
(62, 'Mini coco vanila coklat 17gr', 1, 5, 'pcs', 500, 0, 0),
(63, 'Goriorio kelapa 16gr', 1, 5, 'pcs', 500, 0, 0),
(64, 'Goriorio mix 16gr', 1, 5, 'pcs', 500, 0, 0),
(65, 'Goriorio tiramisu 16gr', 1, 5, 'pcs', 500, 0, 0),
(66, 'Ahh triple cheese 8gr', 1, 5, 'pcs', 500, 0, 0),
(67, 'Choclate bigar 10gr', 1, 5, 'pcs', 500, 0, 0),
(68, 'Chocolatos 14,5gr', 1, 5, 'pcs', 500, 0, 0),
(69, 'Fullo Twist 12gr', 1, 5, 'pcs', 500, 0, 0),
(70, 'Fullo Vanila 12gr', 1, 5, 'pcs', 500, 0, 0),
(71, 'Zuperr keju 13gr', 1, 5, 'pcs', 500, 0, 0),
(72, 'DM Margaroni Telur', 1, 5, 'pcs', 500, 0, 0),
(73, 'DM Kacang Kapri', 1, 5, 'pcs', 500, 0, 0),
(74, 'DM Morning Jagung', 1, 5, 'pcs', 500, 0, 0),
(75, 'DM Pang Pang', 1, 5, 'pcs', 500, 0, 0),
(76, 'Mie salam ayam special 65gr', 1, 5, 'pcs', 1000, 0, 0),
(77, 'Mie salam goreng 65gr', 1, 5, 'pcs', 1000, 0, 0),
(78, 'Mie sedap kuah soto 75gr', 1, 5, 'pcs', 1500, 0, 0),
(79, 'Mie sedap kuah ayam bawang 70gr', 1, 5, 'pcs', 1500, 0, 0),
(80, 'Mie sedap kuah ayam special 69gr', 1, 5, 'pcs', 1500, 0, 0),
(81, 'Indomie sambel ijo 65gr', 1, 5, 'pcs', 1700, 0, 0),
(82, 'Indomie goreng 85gr', 1, 5, 'pcs', 2500, 0, 0),
(83, 'Sprite 200ml', 2, 5, 'pcs', 2500, 0, 0),
(84, 'Sprite 425ml', 2, 5, 'pcs', 4000, 0, 0),
(85, 'Fanta Merah 425ml', 2, 5, 'pcs', 4000, 0, 0),
(86, 'Fanta merah 200ml', 2, 5, 'pcs', 2500, 0, 0),
(87, 'Fanta orange 200ml', 2, 5, 'pcs', 2500, 0, 0),
(88, 'Fanta putih 200ml', 2, 5, 'pcs', 2500, 0, 0),
(89, 'Frestea 200ml', 2, 5, 'pcs', 2000, 0, 0),
(90, 'Cocacola 200ml', 2, 5, 'pcs', 2500, 0, 0),
(91, 'Pulpy orange 200ml', 2, 5, 'pcs', 6000, 0, 0),
(92, 'Happy jus 200ml', 2, 5, 'pcs', 2000, 0, 0),
(93, 'Fruit tea apple 200ml', 2, 5, 'pcs', 2000, 0, 0),
(94, 'Fruit tea blackcurant 200ml', 2, 5, 'pcs', 2000, 0, 0),
(95, 'Frisian flag coolberry 200ml', 2, 5, 'pcs', 2000, 0, 0),
(96, 'Clevo Strowberry 85ml', 2, 5, 'pcs', 2000, 0, 0),
(97, 'Clevo Chocolate 125ml', 2, 5, 'pcs', 2000, 0, 0),
(98, 'Teh hijau rasa apel hijau 225ml', 2, 5, 'pcs', 1000, 0, 0),
(99, 'Teh botol sosro \'JT\' 200ml', 2, 5, 'pcs', 2000, 0, 0),
(100, 'Calpino anggur 85ml', 2, 3, 'pcs', 1000, 0, 0),
(101, 'Calpino original 85ml', 2, 5, 'pcs', 1000, 0, 0),
(102, 'Teh jawa \'GT\' 200ml', 2, 5, 'pcs', 1000, 0, 0),
(103, 'Teh gelas 200ml', 2, 5, 'pcs', 1000, 0, 0),
(104, 'Teh eco 240ml', 2, 5, 'pcs', 1000, 0, 0),
(105, 'Tiky jambu merah 200ml', 2, 5, 'pcs', 500, 0, 0),
(106, 'Tiky jeruk mangga madu 200ml', 2, 5, 'pcs', 500, 0, 0),
(107, 'ABC Kacang Hijau', 2, 5, 'pcs', 2500, 0, 0),
(108, 'Canting \'SAJ\' 200ml', 2, 5, 'pcs', 500, 0, 0),
(109, 'Teh rio 200ml', 2, 5, 'pcs', 1000, 0, 0),
(110, 'Milkuat 85ml', 2, 5, 'pcs', 1000, 0, 0),
(111, 'Pocari sweet 350ml', 2, 5, 'pcs', 4500, 0, 0),
(112, 'Glit gula asam 200ml', 2, 5, 'pcs', 500, 0, 0),
(113, 'Frute zone orange 200ml', 2, 5, 'pcs', 500, 0, 0),
(114, 'Frute zone hijau 200ml', 2, 5, 'pcs', 500, 0, 0),
(115, 'Larutan Penyegar Sinde 200ml', 2, 5, 'pcs', 4000, 0, 0),
(116, 'Aqua 600ml', 2, 5, 'pcs', 2000, 0, 0),
(117, 'Aquarius 250ml', 2, 5, 'pcs', 4500, 0, 0),
(118, 'Club 600ml', 2, 5, 'pcs', 1500, 0, 0),
(119, 'Minute  Maid Fresh Jm', 2, 5, 'pcs', 3500, 0, 0),
(120, 'Minute  Maid Fresh Markisa', 2, 5, 'pcs', 3500, 0, 0),
(121, 'Mizone Laci Lemon 500ml', 2, 5, 'pcs', 3500, 0, 0),
(122, 'You C1000 Apple 140ml', 2, 5, 'pcs', 3950, 0, 0),
(123, 'You C1000 Orange 140ml', 2, 5, 'pcs', 3950, 0, 0),
(124, 'Floridina orange 360ml', 2, 5, 'pcs', 3000, 0, 0),
(125, 'Ades 600ml', 2, 5, 'pcs', 2000, 0, 0),
(126, 'Liquid Chlorophyll 500ml', 2, 5, 'pcs', 125000, 0, 0),
(127, 'Marjan Boudoin Melon 630ml', 2, 5, 'pcs', 17500, 0, 0),
(128, 'Pedia sure Coklat 900gr', 2, 5, 'pcs', 204000, 0, 0),
(129, 'Pedia sure Madu 900gr', 2, 5, 'pcs', 204000, 0, 0),
(130, 'Enfaprow A+ 800gr', 2, 5, 'pcs', 137800, 0, 0),
(131, 'Enfagrow A+ Madu 900gr', 2, 5, 'pcs', 245000, 0, 0),
(132, 'Enfakid A+ Madu 900gr', 2, 5, 'pcs', 178600, 0, 0),
(133, 'Enfakid A+ Madu 800gr', 2, 5, 'pcs', 168600, 0, 0),
(134, 'Kapal Api Kopi Susu 31gr', 2, 5, 'pcs', 1000, 0, 0),
(135, 'Tora Bika full Cream 30gr', 2, 5, 'pcs', 1000, 0, 0),
(136, 'Sido Muncul kopi Jahe 28gr', 2, 5, 'pcs', 1000, 0, 0),
(137, 'Anget Sari Kopi Jahe 28gr', 2, 5, 'pcs', 1000, 0, 0),
(138, 'Anget Sari susu  Jahe 28gr', 2, 5, 'pcs', 1000, 0, 0),
(139, 'Kuku Bima Kopi gingseng 32gr', 2, 5, 'pcs', 1000, 0, 0),
(140, 'Jahe Jreeng 30gr', 2, 5, 'pcs', 1000, 0, 0),
(141, 'Energen Vanila 30gr', 2, 5, 'pcs', 1200, 0, 0),
(142, 'Indomilk Putih 42gr', 2, 5, 'pcs', 1000, 0, 0),
(143, 'Indomilk Coklat 42gr', 2, 5, 'pcs', 1000, 0, 0),
(144, 'Sari Wangi 9,25gr', 2, 5, 'pcs', 2000, 0, 0),
(145, 'Pantene anti dandruf 340ml', 3, 5, 'pcs', 26500, 0, 0),
(146, 'Pantene Long black 340ml', 3, 5, 'pcs', 25000, 0, 0),
(147, 'Pantene nature care 70ml', 3, 5, 'pcs', 7500, 0, 0),
(148, 'Pantene hair fall control 70ml', 3, 5, 'pcs', 6000, 0, 0),
(149, 'Pantene silky smooth care 170ml', 3, 5, 'pcs', 19500, 0, 0),
(150, 'Pantene lively 180ml', 3, 5, 'pcs', 20500, 0, 0),
(151, 'Pantene long black 180ml', 3, 5, 'pcs', 20000, 0, 0),
(152, 'Rejoice anti frizz 170ml', 3, 5, 'pcs', 18000, 0, 0),
(153, 'rejoice anti dandruf 90ml', 3, 5, 'pcs', 5500, 0, 0),
(154, 'Rejoice manageable 170ml', 3, 5, 'pcs', 18000, 0, 0),
(155, 'Rejoice manageable 70ml', 3, 5, 'pcs', 5000, 0, 0),
(156, 'Rijoice Rich 90ml', 3, 5, 'pcs', 5000, 0, 0),
(157, 'Rijoice 3 in 1 180ml', 3, 5, 'pcs', 17500, 0, 0),
(158, 'Rijoice Rich 170ml', 3, 5, 'pcs', 17000, 0, 0),
(159, 'Rijoice hair fall 70ml', 3, 5, 'pcs', 5500, 0, 0),
(160, 'Emeron 7ml', 3, 5, 'pcs', 500, 0, 0),
(161, 'Head & shoulders 10ml', 3, 5, 'pcs', 500, 0, 0),
(162, 'Sunslik black shine 90ml', 3, 5, 'pcs', 8000, 0, 0),
(163, 'Sunslik hair fall 10ml', 3, 5, 'pcs', 500, 0, 0),
(164, 'Sunslik S&S 10ml', 3, 5, 'pcs', 500, 0, 0),
(165, 'Lifebuoy anti dandruf 90ml', 3, 5, 'pcs', 6000, 0, 0),
(166, 'Lifebuoy anti dandruf 10ml', 3, 5, 'pcs', 500, 0, 0),
(167, 'Clear men ice cool 90ml', 3, 5, 'pcs', 15500, 0, 0),
(168, 'Clear ice cool menthol 90ml', 3, 5, 'pcs', 13500, 0, 0),
(169, 'Clear women 10ml', 3, 5, 'pcs', 500, 0, 0),
(170, 'Clear ice mentol 10ml', 3, 5, 'pcs', 500, 0, 0),
(171, 'Give pepaya 80gr', 4, 5, 'pcs', 1500, 0, 0),
(172, 'Give soya bear 80gr', 4, 5, 'pcs', 1500, 0, 0),
(173, 'Give bengkoang 80gr', 4, 5, 'pcs', 1500, 0, 0),
(174, 'Lifebuoy cool fresh mentol 80gr', 4, 5, 'pcs', 2000, 0, 0),
(175, 'Lifebuoy naturepure daun sirih 80gr', 4, 5, 'pcs', 2000, 0, 0),
(176, 'Lifebuoy total 80gr', 4, 5, 'pcs', 2000, 0, 0),
(177, 'Lifebuoy Vita Protect 80gr', 4, 5, 'pcs', 2000, 0, 0),
(178, 'Lifebuoy naturepure 300ml', 4, 5, 'pcs', 13500, 0, 0),
(179, 'Lifebuoy cool fresh mentol 100ml', 4, 5, 'pcs', 4500, 0, 0),
(180, 'Lifebuoy total 10 100ml', 4, 5, 'pcs', 4500, 0, 0),
(181, 'Lux velvet touch 85gr', 4, 5, 'pcs', 2500, 0, 0),
(182, 'Lux White Glemour 220gr', 4, 5, 'pcs', 12500, 0, 0),
(183, 'Claudia Silky Soft 70gr', 4, 5, 'pcs', 1500, 0, 0),
(184, 'Caludia Silky Smoth 70gr', 4, 5, 'pcs', 1500, 0, 0),
(185, 'Citra Bubuk Mutiara 70gr', 4, 5, 'pcs', 2500, 0, 0),
(186, 'Marina 75gr', 4, 5, 'pcs', 1200, 0, 0),
(187, 'Harmony orange 70gr', 4, 5, 'pcs', 1500, 0, 0),
(188, 'Harmony fuji apple 70gr', 4, 5, 'pcs', 1500, 0, 0),
(189, 'Harmony grape 70gr', 4, 5, 'pcs', 1500, 0, 0),
(190, 'Harmony green apple 70gr', 4, 5, 'pcs', 1500, 0, 0),
(191, 'Nuvo cool 80gr', 4, 5, 'pcs', 1500, 0, 0),
(192, 'Nuvo caring 80gr', 4, 5, 'pcs', 1500, 0, 0),
(193, 'Nuvo energizing 80gr', 4, 5, 'pcs', 1500, 0, 0),
(194, 'Nuvo clasic 80gr', 4, 5, 'pcs', 1500, 0, 0),
(195, 'Wardah Moisturizer gel 40gr', 5, 5, 'pcs', 15000, 0, 0),
(196, 'Viva face tonic bengkoang 100ml', 5, 5, 'pcs', 3500, 0, 0),
(197, 'Viva milk cleanser 100ml', 5, 5, 'pcs', 4000, 0, 0),
(198, 'Rexona teens 25ml', 5, 5, 'pcs', 5000, 0, 0),
(199, 'Rexona floral 34gr', 5, 5, 'pcs', 7500, 0, 0),
(200, 'Rexona women whitening 40ml', 5, 5, 'pcs', 12000, 0, 0),
(201, 'Pixy woody 34gr', 5, 5, 'pcs', 4500, 0, 0),
(202, 'Pucelle Joy 75gr', 5, 5, 'pcs', 5500, 0, 0),
(203, 'Pucelle Mist cologne 150gr', 5, 5, 'pcs', 13000, 0, 0),
(204, 'Gatsby musky 175gr', 5, 5, 'pcs', 17000, 0, 0),
(205, 'Citra Hazelin 40gr', 5, 5, 'pcs', 10500, 0, 0),
(206, 'Pepsodent 65gr', 6, 5, 'pcs', 3000, 0, 0),
(207, 'Sunlight jeruk nipis 100 90ml', 7, 5, 'pcs', 1500, 0, 0),
(208, 'Sunlight jeruk nipis 100 200ml', 7, 5, 'pcs', 3000, 0, 0),
(209, 'Vixal lebih wangi 800ml', 7, 5, 'pcs', 15000, 0, 0),
(210, 'Vixal lebih wangi 500ml', 7, 5, 'pcs', 7500, 0, 0),
(211, 'Vixal kuat narum 800ml', 7, 5, 'pcs', 15000, 0, 0),
(212, 'Vixal kuat narum 500ml', 7, 5, 'pcs', 7500, 0, 0),
(213, 'Citra bengkoang 250ml', 7, 5, 'pcs', 15000, 0, 0),
(214, 'Citra teh hijau 60ml', 7, 5, 'pcs', 3500, 0, 0),
(215, 'Citra bubuk mutiara 120ml', 7, 5, 'pcs', 10000, 0, 0),
(216, 'Citra bubuk mutiara 60ml', 7, 5, 'pcs', 4500, 0, 0),
(217, 'Citra bengkoang 60ml', 7, 5, 'pcs', 4000, 0, 0),
(218, 'Citra bengkoang 120ml', 7, 5, 'pcs', 10000, 0, 0),
(219, 'Citra beras jepang 250ml', 7, 5, 'pcs', 15500, 0, 0),
(220, 'Citra beras jepang120ml', 7, 5, 'pcs', 10500, 0, 0),
(221, 'Citra mangir jawa 120ml', 7, 5, 'pcs', 11000, 0, 0),
(222, 'Lovely caring glow 120ml', 7, 5, 'pcs', 4500, 0, 0),
(223, 'Garnier pure aktif scrub 100ml', 8, 5, 'pcs', 19500, 0, 0),
(224, 'Garnier pure aktif scrub 50ml', 8, 5, 'pcs', 12000, 0, 0),
(225, 'Pond\'s white beauty 50gr', 8, 5, 'pcs', 10000, 0, 0),
(226, 'Pond\'s white beauty 100gr', 8, 5, 'pcs', 15000, 0, 0),
(227, 'Pond\'s perfect matte 50gr', 8, 5, 'pcs', 9500, 0, 0),
(228, 'Wardah facial wash 60ml', 8, 5, 'pcs', 12000, 0, 0);

-- --------------------------------------------------------

--
-- Struktur dari tabel `kategori`
--

CREATE TABLE `kategori` (
  `idKategori` int(11) NOT NULL,
  `namaKategori` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `kategori`
--

INSERT INTO `kategori` (`idKategori`, `namaKategori`) VALUES
(1, 'Makanan'),
(2, 'Minuman'),
(3, 'Sampo'),
(4, 'Sabun Mandi'),
(5, 'Kosmetik'),
(6, 'Pasta Gigi'),
(7, 'Pembersih'),
(8, 'Facial Foam');

-- --------------------------------------------------------

--
-- Struktur dari tabel `keperluan`
--

CREATE TABLE `keperluan` (
  `idKeperluan` int(11) NOT NULL,
  `namaKeperluan` varchar(40) NOT NULL,
  `tanggal` date NOT NULL,
  `harga` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `keperluan`
--

INSERT INTO `keperluan` (`idKeperluan`, `namaKeperluan`, `tanggal`, `harga`, `quantity`, `total`) VALUES
(2, 'Bayar listrik', '2020-06-02', 400000, 2, 800000),
(3, 'Bayar gaji pegawai', '2020-06-02', 2000000, 4, 8000000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `log`
--

CREATE TABLE `log` (
  `idLog` int(11) NOT NULL,
  `jabatan` varchar(20) DEFAULT NULL,
  `idAkun` int(11) DEFAULT NULL,
  `aktivitas` text DEFAULT NULL,
  `tanggal` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `pelanggan`
--

CREATE TABLE `pelanggan` (
  `idPelanggan` int(11) NOT NULL,
  `namaPelanggan` varchar(20) DEFAULT NULL,
  `noTelp` varchar(15) DEFAULT NULL,
  `email` varchar(20) NOT NULL,
  `poin` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pelanggan`
--

INSERT INTO `pelanggan` (`idPelanggan`, `namaPelanggan`, `noTelp`, `email`, `poin`) VALUES
(1, 'Nadya', '081222222222', 'nadya@gmail.com', 991000),
(2, 'Nadyo', '083333333333', 'nadyo@gmail.com', 200);

-- --------------------------------------------------------

--
-- Struktur dari tabel `restok`
--

CREATE TABLE `restok` (
  `idRestok` int(11) NOT NULL,
  `idKaryawan` int(11) DEFAULT NULL,
  `tanggal` date DEFAULT NULL,
  `totalPembelian` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `restok`
--

INSERT INTO `restok` (`idRestok`, `idKaryawan`, `tanggal`, `totalPembelian`) VALUES
(1, 3, '2020-05-24', 20),
(2, 3, '2020-05-24', 6),
(3, 3, '2020-05-24', 12),
(4, 3, '2020-05-24', 42),
(5, 3, '2020-05-25', 20),
(6, 3, '2020-05-25', 20000),
(7, 3, '2020-05-25', 8000),
(8, 3, '2020-05-25', 2000),
(9, 3, '2020-05-25', 5000),
(10, 3, '2020-05-25', 5000),
(11, 3, '2020-05-25', 64800),
(12, 3, '2020-05-25', 8000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `restok_detail`
--

CREATE TABLE `restok_detail` (
  `tdRd` int(11) NOT NULL,
  `idRestok` int(11) DEFAULT NULL,
  `idBarang` int(11) NOT NULL,
  `qTerima` int(11) DEFAULT NULL,
  `qBonus` int(11) DEFAULT NULL,
  `hargaBeliSatuan` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `restok_detail`
--

INSERT INTO `restok_detail` (`tdRd`, `idRestok`, `idBarang`, `qTerima`, `qBonus`, `hargaBeliSatuan`) VALUES
(1, 4, 2, 3, 5, 4),
(2, 4, 3, 4, 2, 5),
(3, 4, 4, 5, 1, 2),
(4, 5, 2, 4, 9, 5),
(5, 5, 2, 4, 3, 5000),
(6, 5, 3, 4, 6, 2000),
(7, 5, 5, 1, 1, 2000),
(8, 5, 4, 1, 2, 5000),
(9, 5, 3, 1, 1, 5000),
(10, 5, 1, 2, 4, 32000),
(11, 5, 5, 4, 3, 200),
(12, 5, 1, 2, 2, 4000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `idTransaksi` int(11) NOT NULL,
  `idKasir` int(11) DEFAULT NULL,
  `idPelanggan` int(11) DEFAULT NULL,
  `tanggal` date DEFAULT NULL,
  `totalBelanja` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`idTransaksi`, `idKasir`, `idPelanggan`, `tanggal`, `totalBelanja`) VALUES
(1, 2, 0, '2020-05-24', 7500),
(2, 2, 1, '2020-05-24', 10000),
(3, 2, 0, '2020-05-24', 10000),
(4, 2, 1, '2020-05-25', 5500),
(5, 2, 0, '2020-05-25', 4500),
(6, 2, 0, '2020-05-25', 2000),
(7, 2, 2, '2020-06-02', 2000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi_detail`
--

CREATE TABLE `transaksi_detail` (
  `tdID` int(11) NOT NULL,
  `idTransaksi` int(11) DEFAULT NULL,
  `idBarang` int(11) DEFAULT NULL,
  `hargaJual` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `diskon` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `transaksi_detail`
--

INSERT INTO `transaksi_detail` (`tdID`, `idTransaksi`, `idBarang`, `hargaJual`, `quantity`, `diskon`) VALUES
(1, 4, 2, 1000, 4, 0),
(2, 4, 5, 500, 3, 0),
(3, 4, 3, 1000, 2, 0),
(4, 1, 2, 1000, 4, 0),
(5, 1, 3, 1000, 5, 0),
(6, 1, 4, 1000, 1, 0),
(7, 3, 2, 1000, 4, 0),
(8, 3, 3, 1000, 5, 0),
(9, 3, 4, 1000, 1, 0),
(10, 4, 1, 1000, 2, 0),
(11, 4, 4, 500, 5, 0),
(12, 4, 5, 500, 2, 0),
(13, 4, 2, 1000, 4, 0),
(14, 4, 5, 500, 1, 0),
(15, 4, 1, 1000, 2, 0),
(16, 4, 1, 1000, 3, 0),
(17, 4, 4, 500, 5, 0),
(18, 7, 100, 1000, 2, 0);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tukarpoin`
--

CREATE TABLE `tukarpoin` (
  `idTukar` int(11) NOT NULL,
  `idKasir` int(11) NOT NULL,
  `idPelanggan` int(11) NOT NULL,
  `tanggal` date NOT NULL,
  `totalPoin` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tukarpoin`
--

INSERT INTO `tukarpoin` (`idTukar`, `idKasir`, `idPelanggan`, `tanggal`, `totalPoin`) VALUES
(1, 2, 1, '2020-05-29', 1000),
(2, 2, 1, '2020-05-29', 4000),
(3, 2, 1, '2020-06-02', 4000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tukarpoin_detail`
--

CREATE TABLE `tukarpoin_detail` (
  `tpID` int(11) NOT NULL,
  `idTukar` int(11) NOT NULL,
  `idBarang` int(11) NOT NULL,
  `hargaPoin` int(11) NOT NULL,
  `quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tukarpoin_detail`
--

INSERT INTO `tukarpoin_detail` (`tpID`, `idTukar`, `idBarang`, `hargaPoin`, `quantity`) VALUES
(1, 1, 2, 1000, 1),
(2, 1, 2, 1000, 4),
(3, 3, 2, 1000, 4);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`idAkun`);

--
-- Indeks untuk tabel `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`idBarang`);

--
-- Indeks untuk tabel `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`idKategori`);

--
-- Indeks untuk tabel `keperluan`
--
ALTER TABLE `keperluan`
  ADD PRIMARY KEY (`idKeperluan`);

--
-- Indeks untuk tabel `log`
--
ALTER TABLE `log`
  ADD PRIMARY KEY (`idLog`);

--
-- Indeks untuk tabel `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`idPelanggan`);

--
-- Indeks untuk tabel `restok`
--
ALTER TABLE `restok`
  ADD PRIMARY KEY (`idRestok`);

--
-- Indeks untuk tabel `restok_detail`
--
ALTER TABLE `restok_detail`
  ADD PRIMARY KEY (`tdRd`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`idTransaksi`);

--
-- Indeks untuk tabel `transaksi_detail`
--
ALTER TABLE `transaksi_detail`
  ADD PRIMARY KEY (`tdID`);

--
-- Indeks untuk tabel `tukarpoin`
--
ALTER TABLE `tukarpoin`
  ADD PRIMARY KEY (`idTukar`);

--
-- Indeks untuk tabel `tukarpoin_detail`
--
ALTER TABLE `tukarpoin_detail`
  ADD PRIMARY KEY (`tpID`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `akun`
--
ALTER TABLE `akun`
  MODIFY `idAkun` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT untuk tabel `barang`
--
ALTER TABLE `barang`
  MODIFY `idBarang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=229;

--
-- AUTO_INCREMENT untuk tabel `kategori`
--
ALTER TABLE `kategori`
  MODIFY `idKategori` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT untuk tabel `keperluan`
--
ALTER TABLE `keperluan`
  MODIFY `idKeperluan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `log`
--
ALTER TABLE `log`
  MODIFY `idLog` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `pelanggan`
--
ALTER TABLE `pelanggan`
  MODIFY `idPelanggan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT untuk tabel `restok`
--
ALTER TABLE `restok`
  MODIFY `idRestok` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT untuk tabel `restok_detail`
--
ALTER TABLE `restok_detail`
  MODIFY `tdRd` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `idTransaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT untuk tabel `transaksi_detail`
--
ALTER TABLE `transaksi_detail`
  MODIFY `tdID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT untuk tabel `tukarpoin`
--
ALTER TABLE `tukarpoin`
  MODIFY `idTukar` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `tukarpoin_detail`
--
ALTER TABLE `tukarpoin_detail`
  MODIFY `tpID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
