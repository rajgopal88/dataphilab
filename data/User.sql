CREATE TABLE User
(
	FirstName varchar(255) NOT NULL,
	LastName varchar(255) NOT NULL,
	Age int NOT NULL,
	dob date NOT NULL,
	gender varchar(255) NOT NULL,
	contact int(10) NOT NULL,
	info varchar(255),
	PRIMARY KEY (FirstName)
);