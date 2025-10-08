create database db_16925;
use db_16925;

create table Students(
	Student_id int primary key auto_increment,
    First_Name varchar(50),
    Last_Name varchar(50),
    Data_of_birth date,
    Email varchar(50) unique 
);

insert into Students(First_Name,Last_Name,Data_of_birth,Email)
values('MOHD','SAMEER','2005-09-15','MKSAM945@GMAIL.COM',
'NIKTIA','JAISWAL','2005-07-08','NIKTIA@GMAIL.COM',
'VIJAY','SINGH','2005-01-22','VIJAY@GMAIL.COM',
'SALONI','SINGH','2006-05-01','SALONI@GMAIL.COM',
'SAM''KHAN','2005-10-10','SAMKHAN@GMAIL.COM');
CREATE TABLE courses (
    course_id INT PRIMARY KEY AUTO_INCREMENT,
    course_name VARCHAR(100) NOT NULL,
    credits INT CHECK (credits BETWEEN 1 AND 6)
);

