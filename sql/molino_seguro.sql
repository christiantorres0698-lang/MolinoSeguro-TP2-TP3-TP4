CREATE DATABASE MolinoSeguro;

USE MolinoSeguro;

CREATE TABLE Operario (
    idOperario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    legajo VARCHAR(20),
    sector VARCHAR(50)
);

CREATE TABLE Incidente (
    idIncidente INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE,
    descripcion VARCHAR(255),
    gravedad VARCHAR(30),
    estado VARCHAR(30),
    tipo VARCHAR(50),
    idOperario INT,
    FOREIGN KEY (idOperario) REFERENCES Operario(idOperario)
);

INSERT INTO Operario (nombre, apellido, legajo, sector)
VALUES ('Christian', 'Torres', 'OP001', 'Molienda');

SELECT * FROM Operario;

INSERT INTO Incidente 
(fecha, descripcion, gravedad, estado, tipo, idOperario)
VALUES 
('2026-05-13', 'Caída en sector molienda', 'Media', 'Pendiente', 'Accidente', 1);

SELECT * FROM Incidente;