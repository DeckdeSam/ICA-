CREATE DATABASE Hotel_db;
USE Hotel_db;

CREATE TABLE Reservation (
    reservation_id INT AUTO_INCREMENT PRIMARY KEY,
    Guest_Name VARCHAR(250) NOT NULL,
    Room_Allocate INT NOT NULL UNIQUE,
    Addhar_card BIGINT NOT NULL UNIQUE,
    Mob_Number BIGINT NOT NULL UNIQUE
);
