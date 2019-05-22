CREATE DATABASE ToDoApp

use ToDoApp

CREATE TABLE users (
id INT NOT NULL AUTO_INCREMENT,
firstName VARCHAR(30) NOT NULL,
lastName VARCHAR(30) NOT NULL,
PRIMARY KEY (id));

CREATE TABLE mytasks (
mytaskID INT NOT NULL AUTO_INCREMENT,
userID INT NOT NULL,
name VARCHAR(80) NOT NULL,
description BLOB,
isComplete BOOLEAN,
deadLine DATE,
PRIMARY KEY (mytaskID),
FOREIGN KEY (userID) REFERENCES users(id)
);

INSERT INTO users (firstName, lastName)
VALUES  ("Naty", "Shiny"), ("John", "Zick");

INSERT INTO mytasks (userID, name, description, isComplete, deadLine)
VALUES
(1, "Feed the cat", null, 0, '2019-05-17'),
(1, "Do the belly dance", null, 0, '2019-05-19'),
(1, "Go to the gym", "I need get rid of that fat body", 0, '2019-05-20'),
(1, "Buy milk and vegetable", null, 0, '2019-05-20'),
(1, "Go to the gym", "I need eat healthy", 1, '2019-05-27');