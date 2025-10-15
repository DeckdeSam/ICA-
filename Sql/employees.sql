create database db_11825;
use db_11825;

CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    department VARCHAR(30),
    salary INT,
    age INT,
    city VARCHAR(30),
    joining_date DATE
);


INSERT INTO employees (emp_id, emp_name, department, salary, age, city, joining_date) VALUES
(103, 'Amit Sharma', 'Finance', 55000, 32, 'Kolkata', '2018-03-21'),
(104, 'Neha Patel', 'IT', 72000, 29, 'Delhi', '2021-11-01'),
(105, 'Rohan Das', 'Marketing', 40000, 27, 'Pune', '2019-07-22'),
(106, 'Kiran Rao', 'HR', 48000, 31, 'Mumbai', '2017-02-13'),
(107, 'Deepak Mehta', 'IT', 68000, 30, 'Chennai', '2018-10-09'),
(108, 'Sneha Gupta', 'Finance', 51000, 25, 'Delhi', '2022-05-17'),
(109, 'Arjun Nair', 'Marketing', 39000, 24, 'Bengaluru', '2020-01-30'),
(110, 'Meena Joshi', 'IT', 75000, 33, 'Hyderabad', '2016-09-30');

select * from employees where salary >=50000;
select * from employees where age>28 and department = 'IT';
select * from employees where department != 'HR';
select * from employees where joining_date >'2020-01-01';
select * from employees where city= "Delhi" || city= "Mumbai";
select * from employees where salary between 40000 and 70000;
select * from employees where age between 25 and 30;
select * from employees where year(joining_date) between '2018' and  '2020';
select * from employees where joining_date  between '2018-01-01' and  '2020-01-01';
select * from employees where salary not between 50000 and 70000 ;
select * from employees where year(joining_date) between '2019-01-01' and  '2021-12-31';
select * from employees where emp_name like 's%';
select * from employees where emp_name like '%a';
select * from employees where emp_name like '%ha%';
select * from employees where city like 'm%';
select * from employees where department like '%e';
select * from employees where department in('IT','HR','Finance');
select * from employees where city in('Delhi','Mumbai','Pune');
select * from employees where city not in('Delhi','Mumbai','Pune');
select * from employees where emp_id in(101,103,105,110);
select * from employees order by salary desc;
select * from employees order by department asc,salary desc;
select * from employees where department='IT' order by age asc;
select * from employees order by joining_date;
select * from employees order by city asc;
select department,count(*) from employees as total group by department;
select department,avg(salary) from employees as total group by department;
select department,count(emp_name) from employees group by department having count(emp_name)>2;
select department,avg(salary) from employees group by department having avg(salary)>60000;
select city,sum(salary) from employees group by city having sum(salary)>100000;

 






