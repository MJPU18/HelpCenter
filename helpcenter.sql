CREATE DATABASE helpcenter;

USE helpcenter;

CREATE TABLE persons(
id INT PRIMARY KEY AUTO_INCREMENT,
personname VARCHAR(100) NOT NULL,
document MEDIUMINT UNIQUE NOT NULL,
dateofbirth DATE NOT NULL,
cityofbirth VARCHAR(100) NOT NULL
);

CREATE TABLE participants(
id INT PRIMARY KEY AUTO_INCREMENT,
personname VARCHAR(100) NOT NULL,
document MEDIUMINT UNIQUE NOT NULL,
dateofbirth DATE NOT NULL,
cityofbirth VARCHAR(100) NOT NULL,
participatedsessions INT NOT NULL,
nickname VARCHAR(100) NOT NULL

);

CREATE TABLE psychologist(
id INT PRIMARY KEY AUTO_INCREMENT,
personname VARCHAR(100) NOT NULL,
document MEDIUMINT UNIQUE NOT NULL,
dateofbirth DATE NOT NULL,
cityofbirth VARCHAR(100) NOT NULL,
yearofgraduation YEAR NOT NULL,
daysinservice INT NOT NULL,
suportedsessions INT NOT NULL,
salary DOUBLE NOT NULL

);

CREATE TABLE generalservice(
id INT PRIMARY KEY AUTO_INCREMENT,
personname VARCHAR(100) NOT NULL,
document MEDIUMINT UNIQUE NOT NULL,
dateofbirth DATE NOT NULL,
cityofbirth VARCHAR(100) NOT NULL,
salary DOUBLE NOT NULL,
sessionscleaned INT NOT NULL

);