USE Sample

-- Create new table Employee
CREATE TABLE Employee
	(
	EmployeeId int NOT NULL Primary key,
	Name char(25) NOT NULL,
	PhoneNumber int,
	DepartmentId int NOT NULL
	) ON [PRIMARY]

-- Create new table Department
CREATE TABLE Department
	(
	DepartmentId int NOT NULL Primary key,
	DepartmentName varchar(50) NOT NULL
	) ON [PRIMARY]

-- Setup foreign key in Employee table 
ALTER TABLE Employee add constraint DepartmentId_FK
Foreign key (DepartmentId) references Employee(EmployeeId)


-- Insert some data in table
INSERT INTO Employee 
	(EmployeeId, Name, PhoneNumber, DepartmentId)
VALUES(1, 'Darko Petrovic', 456987, 1),
	  (2, 'Pera Peric', 982613, 2),
	  (3, 'Jelena Jovanovic', 236758, 2),
	  (4, 'Jasna Pavlovic', 691435, 3)

-- List all data from arbitrary table
SELECT * 
FROM Employee

INSERT INTO Department 
	(DepartmentId, DepartmentName)
VALUES(1, 'Information System'),
	  (2, 'Marketing'),
	  (3, 'Finance')

SELECT * 
FROM Department 

-- Create nonclustered index in Empolyee table
CREATE NONCLUSTERED INDEX IX_Employee_Name
ON Employee(Name)

-- Show columns EmployeeId and Name where EmployeeIds are 3 and 4
SELECT EmployeeId, Name
FROM Employee
WHERE EmployeeId IN (3,4)

-- Use inner join to show data that have matches in both Employee and Deprtment tables
SELECT e.Name, d.DepartmentName
FROM Employee AS e
INNER JOIN Department AS d 
ON e.EmployeeId = d.DepartmentId

-- Show EmployeeId and Name where name start with 'J' letter sorted by column Name in descending order
SELECT EmployeeId, Name
FROM Employee
WHERE Name LIKE 'J%'
ORDER BY Name DESC