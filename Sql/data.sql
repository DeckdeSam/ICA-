create database Employee;
use Employee;
create table Emp(
	id int primary key ,
    Name varchar(50),
    job_title varchar(50),
    salary double
);
insert into Emp values(1,"Sameer","JAVA Backend",785508.8);
insert into Emp values(2,"Niktia","JAVA Devloper",785800.8);
insert into Emp values(3,"Saloni","Python Devloper",600078.8);
insert into Emp values(4,"Vijay","Software Devloper",500008.8);

select * from Emp;