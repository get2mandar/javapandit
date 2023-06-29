-- Create MS SQL Database Credentials with user:pass as java1:javaJDBCtest

-- Create Database for Java1 JDBC Test
create database JDBCtestJava1;

-- Create Person Table
create table Person (
	Id int IDENTITY(1,1) PRIMARY KEY,
	FirstName varchar(200),
	LastName varchar(200),
	Age int,
	Active bit DEFAULT 1
);

-- Insert a few Rows of Data in Person Table
insert into Person (FirstName, LastName, Age) values('FirstName1','LastName1',30);
insert into Person (FirstName, LastName, Age) values('TestFName1','TestLName',23);

-- Retrieve Data from Person Table
SELECT Id, FirstName, LastName, Age, Active FROM Person;