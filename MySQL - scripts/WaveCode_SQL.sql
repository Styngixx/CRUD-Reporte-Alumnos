CREATE DATABASE WaveCode;
USE WaveCode;

CREATE TABLE Alumno (
    cod_Alumno INT PRIMARY KEY,
    nombres VARCHAR(50) NOT NULL,
    apellidos VARCHAR(50) NOT NULL,
    dni CHAR(8) NOT NULL UNIQUE,
    edad INT NOT NULL CHECK (edad BETWEEN 0 AND 120),
    celular CHAR(9) UNIQUE NOT NULL,
    estado TINYINT NOT NULL CHECK (estado IN (0,1,2))
);

SELECT * FROM Alumno;
TRUNCATE TABLE Alumno;
drop table alumno;

INSERT INTO Alumno (cod_Alumno, nombres, apellidos, dni, edad, celular, estado) VALUES
(2356426, 'Mateo Andrés', 'González Rivas', '12345678', 20, '981234567', 1),
(2356427, 'Camila Fernanda', 'López Chávez', '87654321', 22, '982345678', 0),
(2356428, 'Sebastián Iván', 'Torres Aguilar', '23456789', 19, '983456789', 2),
(2356429, 'Valentina Sofía', 'Ramírez Paredes', '34567890', 21, '984567890', 1),
(2356430, 'Diego Alejandro', 'Salinas Huamán', '45678901', 23, '985678901', 0),
(2356431, 'Lucía Mariana', 'Cárdenas Quispe', '56789012', 20, '986789012', 2),
(2356432, 'Joaquín Eduardo', 'Vargas Medina', '67890123', 24, '987890123', 1),
(2356433, 'Isabella Nicole', 'Flores Rojas', '78901234', 18, '988901234', 0),
(2356434, 'Gabriel Alonso', 'Gutiérrez Salazar', '89012345', 25, '989012345', 2),
(2356435, 'María Paula', 'Reyes Torres', '90123456', 26, '990123456', 1),
(2356436, 'Tomás Emilio', 'Peña Vargas', '11223344', 19, '991234567', 0),
(2356437, 'Antonella Pilar', 'Morales Díaz', '22334455', 22, '992345678', 2),
(2356438, 'Bruno Nicolás', 'Chávez Romero', '33445566', 20, '993456789', 1),
(2356439, 'Renata Alejandra', 'Sánchez León', '44556677', 21, '994567890', 0),
(2356440, 'Martín Esteban', 'Castillo Ramos', '55667788', 23, '995678901', 2),
(2356441, 'Emilia Zoe', 'Paredes Gálvez', '66778899', 24, '996789012', 1),
(2356442, 'Facundo Javier', 'Mendoza Ruiz', '77889900', 18, '997890123', 0),
(2356443, 'Daniela Luciana', 'Vega Castañeda', '88990011', 25, '998901234', 2),
(2356444, 'Santiago Adrián', 'Quispe Herrera', '99001122', 26, '999012345', 1),
(2356445, 'Ariana Micaela', 'Huamán Delgado', '10111213', 20, '980123456', 0),
(2356446, 'Thiago Gabriel', 'Aguilar Peña', '12131415', 22, '981345678', 2),
(2356447, 'Florencia Carla', 'Torres Gutiérrez', '13141516', 19, '982456789', 1),
(2356448, 'Benjamín Elías', 'Rivas Morales', '14151617', 21, '983567890', 0),
(2356449, 'Julieta Andrea', 'Salazar Vargas', '15161718', 23, '984678901', 2),
(2356450, 'Maximiliano Hugo', 'Romero Castillo', '16171819', 24, '985789012', 1),
(2356451, 'Natalia Abril', 'León Sánchez', '17181920', 18, '986890123', 0),
(2356452, 'Emilio Rafael', 'Delgado Huamán', '18192021', 25, '987901234', 2),
(2356453, 'Valeria Antonella', 'Castañeda Reyes', '19202122', 26, '988012345', 1),
(2356454, 'Damián Mateo', 'Herrera Vega', '20212223', 20, '989123456', 0),
(2356455, 'Ximena Camila', 'Gálvez Mendoza', '21222324', 22, '990234567', 2);

-- SHOW VARIABLES LIKE 'version';

CREATE TABLE Curso (
    codigo_Curso INT PRIMARY KEY,
    asignatura VARCHAR(50) NOT NULL,
    ciclo TINYINT NOT NULL CHECK (ciclo IN (0,1,2,3,4,5,6,7,8,9)),
    creditos INT NOT NULL,
    horas INT NOT NULL,
    dias VARCHAR(20) NOT NULL,
    hora_inicio TIME NOT NULL,
    hora_salida TIME NOT NULL
);


drop table Curso;

INSERT INTO Curso VALUES (202018, 'Diseño de Interfaces de Usuario', 5, 3, 6, 'Lun-Mie-Vie', '08:00:00', '10:00:00');
INSERT INTO Curso VALUES (202019, 'Programación Funcional', 5, 3, 3, 'Mar-Jue', '10:00:00', '11:30:00');
INSERT INTO Curso VALUES (202020, 'Gestión de Configuración de Software', 5, 3, 4, 'Lun-Mie', '14:00:00', '16:00:00');
INSERT INTO Curso VALUES (202021, 'Desarrollo de Software Seguro', 6, 4, 3, 'Vie-Sab', '09:00:00', '11:00:00');
INSERT INTO Curso VALUES (202022, 'Computación en la Nube', 6, 4, 5, 'Lun-Mie-Vie', '16:00:00', '18:00:00');
INSERT INTO Curso VALUES (202023, 'Arquitectura de Microservicios', 6, 3, 5, 'Mar-Jue', '08:00:00', '10:00:00');
INSERT INTO Curso VALUES (202024, 'Desarrollo Full Stack', 6, 4, 4, 'Lun-Mie', '10:00:00', '12:00:00');
INSERT INTO Curso VALUES (202025, 'Automatización de Pruebas', 7, 3, 3, 'Vie-Sab', '14:00:00', '16:00:00');
INSERT INTO Curso VALUES (202026, 'Gobierno y Auditoría de TI', 7, 3, 2, 'Mar-Jue', '18:00:00', '19:30:00');
INSERT INTO Curso VALUES (202027, 'Tópicos en Inteligencia Artificial', 7, 4, 2, 'Lun-Mie', '08:00:00', '10:00:00');
INSERT INTO Curso VALUES (202028, 'Ingeniería de Software Empírica', 7, 3, 4, 'Mar-Jue', '10:00:00', '12:00:00');
INSERT INTO Curso VALUES (202029, 'Proyecto de Tesis I', 8, 4, 3, 'Sab', '08:00:00', '11:00:00');
INSERT INTO Curso VALUES (202030, 'Proyecto de Tesis II', 9, 4, 7, 'Lun a Sab', '08:00:00', '10:00:00');
INSERT INTO Curso VALUES (202031, 'Ética y Responsabilidad Profesional', 9, 2, 6, 'Lun-Mie-Vie', '12:00:00', '14:00:00');
INSERT INTO Curso VALUES (202032, 'Innovación y Emprendimiento Digital', 9, 3, 5, 'Mar-Jue', '14:00:00', '16:00:00');
INSERT INTO Curso VALUES (202033, 'Diseño Centrado en el Usuario', 5, 3, 5, 'Lun-Mie-Vie', '10:00:00', '12:00:00');
INSERT INTO Curso VALUES (202034, 'Blockchain y Criptomonedas', 7, 3, 5, 'Mar-Jue', '16:00:00', '18:00:00');
INSERT INTO Curso VALUES (202035, 'Ciberseguridad Avanzada', 7, 4, 3, 'Vie-Sab', '08:00:00', '10:00:00');
INSERT INTO Curso VALUES (202036, 'Desarrollo de Videojuegos', 6, 4, 4, 'Lun-Mie', '14:00:00', '16:00:00');
INSERT INTO Curso VALUES (202037, 'Sistemas Distribuidos', 6, 4, 4, 'Mar-Jue', '10:00:00', '12:00:00');
INSERT INTO Curso VALUES (202038, 'Internet de las Cosas (IoT)', 6, 3, 3, 'Vie-Sab', '16:00:00', '18:00:00');
INSERT INTO Curso VALUES (202039, 'Diseño de Experiencia de Usuario (UX)', 5, 3, 3, 'Lun-Mie', '08:00:00', '09:30:00');
INSERT INTO Curso VALUES (202040, 'Big Data y Análisis de Datos', 7, 4, 4, 'Mar-Jue', '14:00:00', '16:00:00');
INSERT INTO Curso VALUES (202041, 'Visualización de Datos', 6, 3, 3, 'Lun-Mie', '16:00:00', '17:30:00');
INSERT INTO Curso VALUES (202042, 'Ingeniería de Software Ágil', 5, 3, 3, 'Mar-Jue', '08:00:00', '09:30:00');
INSERT INTO Curso VALUES (202043, 'Desarrollo Backend con Java', 5, 4, 4, 'Lun-Mie', '10:00:00', '12:00:00');
INSERT INTO Curso VALUES (202044, 'Desarrollo Frontend con React', 5, 4, 4, 'Mar-Jue', '14:00:00', '16:00:00');
INSERT INTO Curso VALUES (202045, 'Scripting y Automatización con Python', 4, 3, 5, 'Vie-Sab', '08:00:00', '10:00:00');
INSERT INTO Curso VALUES (202046, 'Modelado y Simulación de Sistemas', 6, 3, 6, 'Lun-Mie-Vie', '12:00:00', '14:00:00');
INSERT INTO Curso VALUES (202047, 'Computación Paralela y Concurrente', 7, 4, 5, 'Mar-Jue', '16:00:00', '18:00:00');
INSERT INTO Curso VALUES (202048, 'Taller de Integración de Sistemas', 8, 3, 5, 'Sab', '10:00:00', '13:00:00');
INSERT INTO Curso VALUES (202049, 'Gestión de Servicios de TI (ITIL)', 7, 3, 3, 'Lun-Mie', '08:00:00', '09:30:00');
INSERT INTO Curso VALUES (202050, 'Desarrollo de APIs RESTful', 5, 3, 4, 'Mar-Jue', '10:00:00', '12:00:00');
INSERT INTO Curso VALUES (202051, 'Taller de Innovación Tecnológica', 8, 3, 4, 'Vie-Sab', '14:00:00', '16:00:00');
INSERT INTO Curso VALUES (202052, 'Arquitectura Empresarial', 8, 3, 3, 'Lun-Mie', '16:00:00', '17:30:00');
SELECT * FROM Curso;


CREATE TABLE Matricula (
    numero_Matricula INT PRIMARY KEY,
    codigo_Estudiante INT,
    codigo_Curso INT,
    fecha DATE NOT NULL,
    hora TIME NOT NULL,
    CONSTRAINT fk_matricula_alumno FOREIGN KEY (codigo_Estudiante)
        REFERENCES Alumno(cod_Alumno)
        ON DELETE CASCADE,
    CONSTRAINT fk_matricula_curso FOREIGN KEY (codigo_Curso)
        REFERENCES Curso(codigo_Curso)
        ON DELETE CASCADE
);

SELECT * FROM Matricula;

INSERT INTO Matricula (numero_Matricula, codigo_Estudiante, codigo_Curso, fecha, hora) VALUES
(3001, 2356426, 202018, '2025-03-01', '08:00:00'),
(3002, 2356427, 202019, '2025-03-01', '10:00:00'),
(3003, 2356428, 202020, '2025-03-02', '14:00:00'),
(3004, 2356429, 202021, '2025-03-02', '09:00:00'),
(3005, 2356430, 202022, '2025-03-03', '16:00:00'),
(3006, 2356431, 202023, '2025-03-03', '08:00:00'),
(3007, 2356432, 202024, '2025-03-04', '10:00:00'),
(3008, 2356433, 202025, '2025-03-04', '14:00:00'),
(3009, 2356434, 202026, '2025-03-05', '18:00:00'),
(3010, 2356435, 202027, '2025-03-05', '08:00:00'),
(3011, 2356436, 202028, '2025-03-06', '10:00:00'),
(3012, 2356437, 202029, '2025-03-06', '08:00:00'),
(3013, 2356438, 202030, '2025-03-07', '08:00:00'),
(3014, 2356439, 202031, '2025-03-07', '12:00:00'),
(3015, 2356440, 202032, '2025-03-08', '14:00:00'),
(3016, 2356441, 202033, '2025-03-08', '10:00:00'),
(3017, 2356442, 202034, '2025-03-09', '16:00:00'),
(3018, 2356443, 202035, '2025-03-09', '08:00:00'),
(3019, 2356444, 202036, '2025-03-10', '14:00:00'),
(3020, 2356445, 202037, '2025-03-10', '10:00:00'),
(3021, 2356446, 202038, '2025-03-11', '16:00:00'),
(3022, 2356447, 202039, '2025-03-11', '08:00:00'),
(3023, 2356448, 202040, '2025-03-12', '14:00:00'),
(3024, 2356449, 202041, '2025-03-12', '16:00:00'),
(3025, 2356450, 202042, '2025-03-13', '08:00:00'),
(3026, 2356451, 202043, '2025-03-13', '10:00:00'),
(3027, 2356452, 202044, '2025-03-14', '14:00:00'),
(3028, 2356453, 202045, '2025-03-14', '08:00:00'),
(3029, 2356454, 202046, '2025-03-15', '12:00:00'),
(3030, 2356455, 202047, '2025-03-15', '16:00:00');

Drop table Matricula;

-- DROP TABLE MATRICULA;

CREATE TABLE Retiro (
    numero_Retiro INT PRIMARY KEY,
    matricula INT,
    fecha DATE NOT NULL,
    hora TIME NOT NULL,
    CONSTRAINT fk_retiro_matricula FOREIGN KEY (matricula)
        REFERENCES Matricula(numero_Matricula)
        ON DELETE CASCADE
);


SELECT * FROM Retiro;
DROP TABLE Retiro;
use wavecode;

INSERT INTO Retiro (numero_Retiro, matricula, fecha, hora) VALUES
(4001, 3001, '2025-04-01', '09:00:00'),
(4002, 3002, '2025-04-02', '10:30:00'),
(4003, 3003, '2025-04-03', '11:00:00'),
(4004, 3004, '2025-04-04', '08:45:00'),
(4005, 3005, '2025-04-05', '09:15:00'),
(4006, 3006, '2025-04-06', '10:00:00'),
(4007, 3007, '2025-04-07', '11:30:00'),
(4008, 3008, '2025-04-08', '08:00:00'),
(4009, 3009, '2025-04-09', '09:45:00'),
(4010, 3010, '2025-04-10', '10:15:00'),
(4011, 3011, '2025-04-11', '11:00:00'),
(4012, 3012, '2025-04-12', '08:30:00'),
(4013, 3013, '2025-04-13', '09:00:00'),
(4014, 3014, '2025-04-14', '10:30:00'),
(4015, 3015, '2025-04-15', '11:15:00'),
(4016, 3016, '2025-04-16', '08:45:00'),
(4017, 3017, '2025-04-17', '09:30:00'),
(4018, 3018, '2025-04-18', '10:00:00'),
(4019, 3019, '2025-04-19', '11:30:00'),
(4020, 3020, '2025-04-20', '08:00:00'),
(4021, 3021, '2025-04-21', '09:45:00'),
(4022, 3022, '2025-04-22', '10:15:00'),
(4023, 3023, '2025-04-23', '11:00:00'),
(4024, 3024, '2025-04-24', '08:30:00'),
(4025, 3025, '2025-04-25', '09:00:00'),
(4026, 3026, '2025-04-26', '10:30:00'),
(4027, 3027, '2025-04-27', '11:15:00'),
(4028, 3028, '2025-04-28', '08:45:00'),
(4029, 3029, '2025-04-29', '09:30:00'),
(4030, 3030, '2025-04-30', '10:00:00');
Drop table Retiro;


