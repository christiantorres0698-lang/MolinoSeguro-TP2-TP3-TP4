-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-06-2026 a las 16:10:54
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `molinoseguro`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `incidente`
--

CREATE TABLE `incidente` (
  `idIncidente` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `gravedad` varchar(30) DEFAULT NULL,
  `estado` varchar(30) DEFAULT NULL,
  `tipo` varchar(50) DEFAULT NULL,
  `idOperario` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `incidente`
--

INSERT INTO `incidente` (`idIncidente`, `fecha`, `descripcion`, `gravedad`, `estado`, `tipo`, `idOperario`) VALUES
(1, '2026-05-13', 'Caída en sector molienda', 'Media', 'Pendiente', 'Accidente', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `incidentes_ap4`
--

CREATE TABLE `incidentes_ap4` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  `gravedad` varchar(30) NOT NULL,
  `estado` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `incidentes_ap4`
--

INSERT INTO `incidentes_ap4` (`id`, `descripcion`, `gravedad`, `estado`) VALUES
(1, 'Caída en sector molienda', 'Alta', 'Resuelto'),
(2, 'Temperatura elevada en molino', 'Media', 'Pendiente'),
(3, 'Temperatura elevada en molino', 'Media', 'Pendiente'),
(4, 'Temperatura elevada en molino', 'Media', 'Pendiente');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `operario`
--

CREATE TABLE `operario` (
  `idOperario` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `legajo` varchar(20) DEFAULT NULL,
  `sector` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `operario`
--

INSERT INTO `operario` (`idOperario`, `nombre`, `apellido`, `legajo`, `sector`) VALUES
(1, 'Christian', 'Torres', 'OP001', 'Molienda');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `incidente`
--
ALTER TABLE `incidente`
  ADD PRIMARY KEY (`idIncidente`),
  ADD KEY `idOperario` (`idOperario`);

--
-- Indices de la tabla `incidentes_ap4`
--
ALTER TABLE `incidentes_ap4`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `operario`
--
ALTER TABLE `operario`
  ADD PRIMARY KEY (`idOperario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `incidente`
--
ALTER TABLE `incidente`
  MODIFY `idIncidente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `incidentes_ap4`
--
ALTER TABLE `incidentes_ap4`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `operario`
--
ALTER TABLE `operario`
  MODIFY `idOperario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `incidente`
--
ALTER TABLE `incidente`
  ADD CONSTRAINT `incidente_ibfk_1` FOREIGN KEY (`idOperario`) REFERENCES `operario` (`idOperario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
