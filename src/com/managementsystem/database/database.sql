CREATE TABLE employees
(
    firstName varchar(50),
    lastName varchar(100),
    employeeID int PRIMARY KEY IDENTITY,
    departmentID int,
    address1 varchar(100),
    address2 varchar(100),
    city varchar(50),
    state varchar(50),
    zipcode varchar(15),

)