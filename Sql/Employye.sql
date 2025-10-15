create database Employee;
use Employee;
CREATE TABLE Emp1 (
    emp_id INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(50),
    Department VARCHAR(50),
    salary DOUBLE,
    age INT,
    city VARCHAR(50)
);

INSERT INTO Emp1 (Name, Department, salary, age, city)
VALUES
    ("Rahul", "HR", 45000, 28, "Delhi"),
    ("Sneha", "IT", 60000, 26, "Mumbai"),
    ("Aarav", "IT", 70000, 30, "Delhi"),
    ("Priya", "Sales", 40000, 27, "Kolkata"),
    ("Rohan", "HR", 55000, 32, "Delhi"),
    ("Kavita", "Finance", 80000, 29, "Chennai"),
    ("Mohit", "Sales", 35000, 25, "Mumbai"),
    ("Neha", "Finance", 75000, 31, "Delhi"),
    ("Arjun", "IT", 50000, 28, "Bangalore"),
    ("Pooja", "HR", 48000, 26, "Pune");
SELECT * FROM Emp1;

select max(salary) from Emp1;
SELECT * FROM Emp1 WHERE salary = (SELECT MAX(salary) FROM Emp1);

SELECT * FROM Emp1 WHERE salary = (SELECT MIN(salary) FROM Emp1);

SELECT DISTINCT Department
FROM Emp1; 

SELECT COUNT(*) FROM Emp1;
SELECT COUNT(DISTINCT Department) AS TotalDepartments
FROM Emp1;

SELECT Department, COUNT(*) AS EmployeeCount
FROM Emp1
GROUP BY Department;

select department from Emp1 where salary >=45000;
SELECT Department, MAX(SALARY) AS EmployeeCount
FROM Emp1
GROUP BY Department;

SELECT Department, avg(SALARY) AS EmployeeCount
FROM Emp1
GROUP BY Department;

SELECT city , max(salary) AS Cityes
FROM Emp1
GROUP BY city;

select * from emp1 where emp_id =3;
select * from emp1 where salary >=45000 limit 3 ;
select * from emp1 where salary >= 50000 and salary<60000;
select * from emp1 where  Department ='HR' ||  Department='sales';
select * from emp1 where Name like 'a%';
select sum(salary) from emp1;



SELECT Department, sum(SALARY) AS SumTotal
FROM Emp1
GROUP BY Department;


SELECT department , count(*) AS dep
FROM Emp1
GROUP BY department having department ="IT";

select * from emp1 where  Department ='HR' !=  Department='sales';
