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

INSERT INTO Alumno (cod_Alumno, nombres, apellidos, dni, edad, celular, estado) VALUES
(1001,'Mateo','González','12345678',20,'900000001',1),
(1002,'Camila','López','12345679',21,'900000002',0),
(1003,'Sebastián','Torres','12345680',22,'900000003',2),
(1004,'Valentina','Ramírez','12345681',23,'900000004',1),
(1005,'Diego','Salinas','12345682',24,'900000005',0),
(1006,'Lucía','Cárdenas','12345683',25,'900000006',2),
(1007,'Joaquín','Vargas','12345684',26,'900000007',1),
(1008,'Isabella','Flores','12345685',20,'900000008',0),
(1009,'Gabriel','Gutiérrez','12345686',21,'900000009',2),
(1010,'María','Reyes','12345687',22,'900000010',1),
(1011,'Tomás','Peña','12345688',23,'900000011',0),
(1012,'Antonella','Morales','12345689',24,'900000012',2),
(1013,'Bruno','Chávez','12345690',25,'900000013',1),
(1014,'Renata','Sánchez','12345691',26,'900000014',0),
(1015,'Martín','Castillo','12345692',20,'900000015',2),
(1016,'Emilia','Paredes','12345693',21,'900000016',1),
(1017,'Facundo','Mendoza','12345694',22,'900000017',0),
(1018,'Daniela','Vega','12345695',23,'900000018',2),
(1019,'Santiago','Quispe','12345696',24,'900000019',1),
(1020,'Ariana','Huamán','12345697',25,'900000020',0),
(1021,'Thiago','Aguilar','12345698',26,'900000021',2),
(1022,'Florencia','Torres','12345699',20,'900000022',1),
(1023,'Benjamín','Rivas','12345700',21,'900000023',0),
(1024,'Julieta','Salazar','12345701',22,'900000024',2),
(1025,'Maximiliano','Romero','12345702',23,'900000025',1),
(1026,'Natalia','León','12345703',24,'900000026',0),
(1027,'Emilio','Delgado','12345704',25,'900000027',2),
(1028,'Valeria','Castañeda','12345705',26,'900000028',1),
(1029,'Damián','Herrera','12345706',20,'900000029',0),
(1030,'Ximena','Gálvez','12345707',21,'900000030',2);
truncate table alumno;
drop table alumno;



SELECT * FROM Alumno;
-- TRUNCATE TABLE Alumno;
-- drop table alumno;
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

INSERT INTO Curso (codigo_Curso, asignatura, ciclo, creditos, horas, dias, hora_inicio, hora_salida) VALUES
(2001,'Matemáticas I',1,4,6,'Lun-Mie','08:00:00','10:00:00'),
(2002,'Física I',1,4,6,'Mar-Jue','10:00:00','12:00:00'),
(2003,'Química I',1,4,6,'Vie-Sab','14:00:00','16:00:00'),
(2004,'Programación I',2,4,6,'Lun-Mie','08:00:00','10:00:00'),
(2005,'Algoritmos',2,4,6,'Mar-Jue','10:00:00','12:00:00'),
(2006,'Bases de Datos',2,4,6,'Vie-Sab','14:00:00','16:00:00'),
(2007,'Redes I',3,4,6,'Lun-Mie','08:00:00','10:00:00'),
(2008,'Sistemas Operativos',3,4,6,'Mar-Jue','10:00:00','12:00:00'),
(2009,'Ingeniería de Software',3,4,6,'Vie-Sab','14:00:00','16:00:00'),
(2010,'Matemáticas II',4,4,6,'Lun-Mie','08:00:00','10:00:00'),
(2011,'Física II',4,4,6,'Mar-Jue','10:00:00','12:00:00'),
(2012,'Química II',4,4,6,'Vie-Sab','14:00:00','16:00:00'),
(2013,'Programación II',5,4,6,'Lun-Mie','08:00:00','10:00:00'),
(2014,'Algoritmos Avanzados',5,4,6,'Mar-Jue','10:00:00','12:00:00'),
(2015,'Bases de Datos II',5,4,6,'Vie-Sab','14:00:00','16:00:00'),
(2016,'Redes II',6,4,6,'Lun-Mie','08:00:00','10:00:00'),
(2017,'Sistemas Distribuidos',6,4,6,'Mar-Jue','10:00:00','12:00:00'),
(2018,'Seguridad Informática',6,4,6,'Vie-Sab','14:00:00','16:00:00'),
(2019,'Matemáticas III',7,4,6,'Lun-Mie','08:00:00','10:00:00'),
(2020,'Física III',7,4,6,'Mar-Jue','10:00:00','12:00:00'),
(2021,'Química III',7,4,6,'Vie-Sab','14:00:00','16:00:00'),
(2022,'Programación III',8,4,6,'Lun-Mie','08:00:00','10:00:00'),
(2023,'Algoritmos Complejos',8,4,6,'Mar-Jue','10:00:00','12:00:00'),
(2024,'Bases de Datos III',8,4,6,'Vie-Sab','14:00:00','16:00:00'),
(2025,'Redes III',9,4,6,'Lun-Mie','08:00:00','10:00:00'),
(2026,'Sistemas Avanzados',9,4,6,'Mar-Jue','10:00:00','12:00:00'),
(2027,'Seguridad Avanzada',9,4,6,'Vie-Sab','14:00:00','16:00:00'),
(2028,'Inteligencia Artificial',9,4,6,'Lun-Mie','08:00:00','10:00:00'),
(2029,'Big Data',9,4,6,'Mar-Jue','10:00:00','12:00:00'),
(2030,'Blockchain',9,4,6,'Vie-Sab','14:00:00','16:00:00');


drop table Curso;

SELECT * FROM Curso;

-- codigo_Curso
CREATE TABLE Matricula (
    numero_Matricula INT PRIMARY KEY,
    codigo_Estudiante INT,
    codigo_Curso INT,
    fecha DATE NOT NULL,
    hora TIME NOT NULL,
        CONSTRAINT fk_matricula_curso FOREIGN KEY (codigo_Curso)
        REFERENCES Curso(codigo_Curso)
        ON DELETE CASCADE,
    CONSTRAINT fk_matricula_alumno FOREIGN KEY (codigo_Estudiante)
        REFERENCES Alumno(cod_Alumno)
        ON DELETE CASCADE

);

INSERT INTO Matricula (numero_Matricula, codigo_Estudiante, codigo_Curso, fecha, hora) VALUES
(3001,1001,2001,'2025-03-01','08:00:00'),
(3002,1002,2002,'2025-03-01','10:00:00'),
(3003,1003,2003,'2025-03-02','14:00:00'),
(3004,1004,2004,'2025-03-02','09:00:00'),
(3005,1005,2005,'2025-03-03','16:00:00'),
(3006,1006,2006,'2025-03-03','08:00:00'),
(3007,1007,2007,'2025-03-04','10:00:00'),
(3008,1008,2008,'2025-03-04','14:00:00'),
(3009,1009,2009,'2025-03-05','18:00:00'),
(3010,1010,2010,'2025-03-05','08:00:00'),
(3011,1011,2011,'2025-03-06','10:00:00'),
(3012,1012,2012,'2025-03-06','08:00:00'),
(3013,1013,2013,'2025-03-07','08:00:00'),
(3014,1014,2014,'2025-03-07','12:00:00'),
(3015,1015,2015,'2025-03-08','14:00:00'),
(3016,1016,2016,'2025-03-08','10:00:00'),
(3017,1017,2017,'2025-03-09','16:00:00'),
(3018,1018,2018,'2025-03-09','08:00:00'),
(3019,1019,2019,'2025-03-10','14:00:00'),
(3020,1020,2020,'2025-03-10','10:00:00'),
(3021,1021,2021,'2025-03-11','16:00:00'),
(3022,1022,2022,'2025-03-11','08:00:00'),
(3023,1023,2023,'2025-03-12','14:00:00'),
(3024,1024,2024,'2025-03-12','16:00:00'),
(3025,1025,2025,'2025-03-13','08:00:00'),
(3026,1026,2026,'2025-03-13','10:00:00'),
(3027,1027,2027,'2025-03-14','14:00:00'),
(3028,1028,2028,'2025-03-14','08:00:00'),
(3029,1029,2029,'2025-03-15','12:00:00'),
(3030,1030,2030,'2025-03-15','16:00:00');

truncate table matricula;
SELECT * FROM Matricula;
drop table matricula;
drop table matricula;



Drop table Matricula;

DROP TABLE MATRICULA;
-- codigo_Curso
CREATE TABLE Retiro (
    numero_Retiro INT PRIMARY KEY,
    matricula INT,
    fecha DATE NOT NULL,
    hora TIME NOT NULL,
    CONSTRAINT fk_retiro_matricula FOREIGN KEY (matricula)
        REFERENCES Matricula(numero_Matricula)
        ON DELETE CASCADE
);

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


SELECT * FROM Retiro;
-- DROP TABLE Retiro;
use wavecode;
truncate table Retiro;




Drop table Retiro;


