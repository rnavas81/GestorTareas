/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  rodrigo
 * Created: 9 oct. 2020
 */

CREATE DATABASE IF NOT EXISTS Tareas
    CHARACTER SET utf8
    COLLATE utf8_spanish_ci;

DROP TABLE IF EXISTS Tareas.Tareas_Historico;
DROP TABLE IF EXISTS Tareas.Tareas;
DROP TABLE IF EXISTS Tareas.Usuarios;
DROP TABLE IF EXISTS Tareas.Auxiliar;


-- Crea la tabla auxiliar
CREATE TABLE Tareas.Auxiliar (
    habilitado  TINYINT NOT NULL DEFAULT 1,
    id          INT NOT NULL AUTO_INCREMENT,
    tipo        TINYINT NOT NULL,
    nombre      VARCHAR (500) CHARACTER SET utf8 COLLATE utf8_spanish_ci,
    descripcion VARCHAR (500) CHARACTER SET utf8 COLLATE utf8_spanish_ci,

    PRIMARY KEY (id)
);

-- Crea la tabla usuarios
CREATE TABLE Tareas.Usuarios (
    habilitado  TINYINT NOT NULL DEFAULT 1,
    dni         VARCHAR(10) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
    username    VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci,
    password    VARCHAR(500) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
    tipo        INT NOT NULL DEFAULT 0,
    nombre      VARCHAR(64) CHARACTER SET utf8 COLLATE utf8_spanish_ci,
    apellidos   VARCHAR(128) CHARACTER SET utf8 COLLATE utf8_spanish_ci,
    email       VARCHAR(128) CHARACTER SET utf8 COLLATE utf8_spanish_ci,
    avatar      VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_spanish_ci,


    PRIMARY KEY (dni),
    FOREIGN KEY (tipo) REFERENCES Tareas.Auxiliar(id)
);
-- Crea la tabla tareas
CREATE TABLE Tareas.Tareas(
    habilitado TINYINT NOT NULL DEFAULT 1,
    id          INT NOT NULL AUTO_INCREMENT,
    creacion    TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    descripcion VARCHAR(500) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL ,
    usuario     VARCHAR(10) CHARACTER SET utf8 COLLATE utf8_spanish_ci,
    horasPrev   TINYINT DEFAULT 0,
    horasEmpl   TINYINT DEFAULT 0,
    nivelDiff   INT,
    finalizado  TINYINT DEFAULT 0,

    PRIMARY KEY (id),
    FOREIGN KEY (usuario) REFERENCES Tareas.Usuarios(dni),
    FOREIGN KEY (nivelDiff) REFERENCES Tareas.Auxiliar(id)
);
-- Crea la tabla historico tareas
CREATE TABLE Tareas.Tareas_Historico(
    id          INT NOT NULL AUTO_INCREMENT,
    idTarea     INT NOT NULL,
    usuario     VARCHAR(10) CHARACTER SET utf8 COLLATE utf8_spanish_ci,
    fechaInicio TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    fechaFin    DATE,
    horasEmpl   TINYINT DEFAULT 0,

    PRIMARY KEY (id),
    FOREIGN KEY (idTarea) REFERENCES Tareas.Tareas(id),
    FOREIGN KEY (usuario) REFERENCES Tareas.Usuarios(dni)
);

