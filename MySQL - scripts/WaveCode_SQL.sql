

-- =======================================================
-- 0. LIMPIEZA INICIAL (Ejecutar en orden para evitar errores de dependencia)
-- =======================================================
DROP TABLE IF EXISTS Retiro;
DROP TABLE IF EXISTS Matricula;
DROP TABLE IF EXISTS Curso;
DROP TABLE IF EXISTS Alumno;
DROP TABLE IF EXISTS EstadoAlumno;


-- 1. CREACIÓN DE LA BASE DE DATOS Y USO
CREATE DATABASE IF NOT EXISTS WaveCode;
DROP DATABASE WAVECODE;
USE WaveCode;


-- =======================================================
-- 2. TABLA DE CATÁLOGO: ESTADOS DE ALUMNO (Mejora de Mantenibilidad)
-- =======================================================
CREATE TABLE EstadoAlumno (
    id_estado TINYINT PRIMARY KEY,
    descripcion VARCHAR(30) NOT NULL UNIQUE
);

INSERT INTO EstadoAlumno (id_estado, descripcion) VALUES
(0, 'REGISTRADO (Sin Matricular)'),
(1, 'MATRICULADO (Activo)'),
(2, 'RETIRADO (No Activo)');


-- =======================================================
-- 3. TABLA ALUMNO (Base de datos de estudiantes)
-- =======================================================
CREATE TABLE Alumno (
    cod_Alumno INT PRIMARY KEY,
    nombres VARCHAR(50) NOT NULL,
    apellidos VARCHAR(50) NOT NULL,
    dni CHAR(8) NOT NULL UNIQUE,
    edad INT NOT NULL CHECK (edad >= 15 AND edad <= 99), -- Rango de edad ajustado
    celular CHAR(9) UNIQUE NOT NULL,
    estado TINYINT NOT NULL, 
    
    -- El estado ahora es una FK, asegurando que solo use 0, 1 o 2.
    CONSTRAINT fk_alumno_estado FOREIGN KEY (estado)
        REFERENCES EstadoAlumno(id_estado)
        ON UPDATE CASCADE
);
alter table alumno;
-- INSERCIÓN DE ALUMNOS (70 registros)

INSERT INTO Alumno (cod_Alumno, nombres, apellidos, dni, edad, celular, estado) VALUES
(1002,'Camila','López','12345679',21,'900000002',0),
(1005,'Diego','Salinas','12345682',24,'900000005',0),
(1008,'Isabella','Flores','12345685',20,'900000008',0),
(1011,'Tomás','Peña','12345688',23,'900000011',0),
(1014,'Renata','Sánchez','12345691',26,'900000014',0),
(1017,'Facundo','Mendoza','12345694',22,'900000017',0),
(1020,'Ariana','Huamán','12345697',25,'900000020',0),
(1023,'Benjamín','Rivas','12345700',21,'900000023',0),
(1026,'Natalia','León','12345703',24,'900000026',0),
(1029,'Damián','Herrera','12345706',20,'900000029',0),
(1032,'Paula','Fernández','12345709',23,'900000032',0),
(1035,'Cristóbal','Navarro','12345712',26,'900000035',0),
(1038,'Josefina','Mejía','12345715',22,'900000038',0),
(1041,'Andrés','Cornejo','12345718',25,'900000041',0),
(1044,'Carolina','Espinoza','12345721',21,'900000044',0),
(1047,'Pedro','Fuentes','12345724',24,'900000047',0),
(1050,'Esteban','Arce','12345727',20,'900000050',0),
(1053,'Elena','Rentería','12345730',23,'900000053',0),
(1056,'Ricardo','Valdivia','12345733',26,'900000056',0),
(1059,'Carmen','Rosales','12345736',22,'900000059',0),
(1062,'Camila','Bustamante','12345739',25,'900000062',0),
(1065,'Lucas','Villalobos','12345742',21,'900000065',0),
(1068,'Josefina','Ríos','12345745',24,'900000068',0),
(1071,'Felipe','Aranda','12345748',20,'900000071',0),
(1074,'Isabella','Montes','12345751',23,'900000074',0),
(1077,'Ignacio','Salcedo','12345754',26,'900000077',0),
(1080,'Ariana','Del Río','12345757',22,'900000080',0),
(1083,'Damián','Palacios','12345760',25,'900000083',0),
(1086,'Lucía','Ramírez','12345763',21,'900000086',0),
(1089,'Santiago','Reyes','12345766',24,'900000089',0);

INSERT INTO Alumno (cod_Alumno, nombres, apellidos, dni, edad, celular, estado) VALUES
(1090,'Lucas','Fernández','12345768',16,'900000090',0),
(1091,'Valentina','Ramírez','12345769',17,'900000091',0),
(1092,'Mateo','González','12345770',18,'900000092',0),
(1093,'Camila','Torres','12345771',19,'900000093',0),
(1094,'Santiago','López','12345772',16,'900000094',0),
(1095,'Isabella','Morales','12345773',17,'900000095',0),
(1096,'Thiago','Castillo','12345774',18,'900000096',0),
(1097,'Emilia','Vega','12345775',19,'900000097',0),
(1098,'Benjamín','Reyes','12345776',16,'900000098',0),
(1099,'Martina','Cárdenas','12345777',17,'900000099',0),
(1100,'Gabriel','Salazar','12345778',18,'900000100',0),
(1101,'Ariana','Quispe','12345779',19,'900000101',0),
(1102,'Tomás','Delgado','12345780',16,'900000102',0),
(1103,'Florencia','Sánchez','12345781',17,'900000103',0),
(1104,'Diego','Romero','12345782',18,'900000104',0),
(1105,'Julieta','Palacios','12345783',19,'900000105',0),
(1106,'Ignacio','Bravo','12345784',16,'900000106',0),
(1107,'Renata','Ibáñez','12345785',17,'900000107',0),
(1108,'Agustín','Montoya','12345786',18,'900000108',0),
(1109,'Daniela','Campos','12345787',19,'900000109',0),
(1110,'Cristóbal','Peña','12345788',16,'900000110',0),
(1111,'Josefina','Rivas','12345789',17,'900000111',0),
(1112,'Rodrigo','Carrillo','12345790',18,'900000112',0),
(1113,'Milagros','García','12345791',19,'900000113',0),
(1114,'Facundo','Herrera','12345792',16,'900000114',0);

-- =======================================================
-- 4. TABLA CURSO (Catálogo de cursos)
-- =======================================================
CREATE TABLE Curso (
    codigo_Curso INT PRIMARY KEY,
    asignatura VARCHAR(50) NOT NULL,
    ciclo TINYINT NOT NULL CHECK (ciclo BETWEEN 1 AND 10),
    creditos INT NOT NULL,
    horas INT NOT NULL,
    dias VARCHAR(20) NOT NULL,
    hora_inicio TIME NOT NULL,
    hora_salida TIME NOT NULL
);



alter table curso;

INSERT INTO Curso (codigo_Curso, asignatura, ciclo, creditos, horas, dias, hora_inicio, hora_salida) VALUES
(2101,'Matemáticas I',1,4,6,'Lun-Mie','08:00:00','10:00:00'),
(2102,'Física I',2,4,6,'Mar-Jue','10:00:00','12:00:00'),
(2103,'Química I',3,4,6,'Vie-Sab','14:00:00','16:00:00'),
(2104,'Programación I',4,4,6,'Lun-Mie','08:00:00','10:00:00'),
(2105,'Algoritmos',5,4,6,'Mar-Jue','10:00:00','12:00:00'),
(2106,'Bases de Datos',6,4,6,'Vie-Sab','14:00:00','16:00:00'),
(2107,'Redes I',7,4,6,'Lun-Mie','08:00:00','10:00:00'),
(2108,'Sistemas Operativos',8,4,6,'Mar-Jue','10:00:00','12:00:00'),
(2109,'Ingeniería de Software',9,4,6,'Vie-Sab','14:00:00','16:00:00'),
(2110,'Inteligencia Artificial',10,4,6,'Lun-Mie','08:00:00','10:00:00');


-- =======================================================
-- 5. TABLA MATRICULA (Registro de matriculaciones)
-- =======================================================
CREATE TABLE Matricula (
    numero_Matricula INT PRIMARY KEY,
    codigo_Estudiante INT NOT NULL,
    codigo_Curso INT NOT NULL,
    fecha DATE NOT NULL,
    hora TIME NOT NULL,
    
    -- MEJORA CLAVE: Un estudiante solo puede matricularse una vez en un mismo curso
    CONSTRAINT uc_estudiante_curso UNIQUE (codigo_Estudiante, codigo_Curso), 

    CONSTRAINT fk_matricula_curso FOREIGN KEY (codigo_Curso)
        REFERENCES Curso(codigo_Curso)
        ON DELETE RESTRICT, -- Más seguro: No permite borrar un curso si tiene matrículas activas.
        
    CONSTRAINT fk_matricula_alumno FOREIGN KEY (codigo_Estudiante)
        REFERENCES Alumno(cod_Alumno)
        ON DELETE CASCADE -- Si el alumno se borra, se borra su matrícula.

);

-- INSERCIÓN DE MATRÍCULAS (30 registros)
INSERT INTO Matricula (numero_Matricula, codigo_Estudiante, codigo_Curso, fecha, hora) VALUES
(3030,1088,2030,'2025-03-30','14:00:00');


-- =======================================================
-- 6. TABLA RETIRO (Registro de retiros de una matrícula específica)
-- =======================================================
CREATE TABLE Retiro (
    numero_Retiro INT PRIMARY KEY,
    matricula INT NOT NULL UNIQUE, -- Clave UNIQUE para asegurar que una matrícula solo se retira una vez
    fecha DATE NOT NULL,
    hora TIME NOT NULL,
    
    CONSTRAINT fk_retiro_matricula FOREIGN KEY (matricula)
        REFERENCES Matricula(numero_Matricula)
        ON DELETE RESTRICT -- Más seguro: No permite borrar la Matrícula si tiene un Retiro registrado.
);

use wavecode;
ALTER TABLE retiro;
-- INSERCIÓN DE RETIROS (10 registros, referenciando Matrículas válidas)
INSERT INTO Retiro (numero_Retiro, matricula, fecha, hora) VALUES
();
drop table retiro;
SELECT * FROM retiro;
