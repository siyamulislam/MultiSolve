Create database MultiSolve

Create Table UserData (
uID int identity(10001,1) Primary key,
 Fname Varchar (30) not null,
 Lname Varchar (30) not null, 
 Address Varchar (150) not null, 
 Email Varchar (50) not null, 
 Gender Varchar (10) not null, 
 Age int CHECK (Age>=18),
 Phone int not null UNIQUE, 
 Password Varchar (30) not null
 )


 Create Table WorkerData (
 wID int identity(20001,1) Primary key,
 Fname Varchar (30) not null,
 Lname Varchar (30) not null, 
 Address Varchar (150) not null, 
 Email Varchar (50) not null, 
 Gender Varchar (10) not null,
 JoinAs Varchar (30) not null,
 Age int CHECK (Age>=18),
 Phone int not null UNIQUE, 
 Password Varchar (30) not null
 )




 Insert into UserData( Fname ,Lname,Address,Email,Gender, Age, Phone, Password  )

 Values ('Siyamul', 'Islam','53/2 Shukrabad, Dhaka','siyamulislam.1@gmail.com', 'Male', 20, 01717338996 , '1234' )



 Insert into  WorkerData( Fname ,Lname,Address,Email,Gender, JoinAs, Age, Phone, Password  )

 Values ('Siyamul', 'Islam','53/2 Shukrabad, Dhaka','siyamulislam.1@gmail.com', 'Male','Tutor', 20, 01717338996 , '1234' )

 
  

  create table Tutor 
  (
  Tversion varchar(50) not null,
  Tclass varchar(10) not null,
  Tsubject varchar(30) not null,
  sertype varchar(20) not null,
  sdate varchar (100) not null,
  phone varchar(30) not null
  )



  create table Photographer 
  (
  Pevent varchar(50) not null,
  Duration varchar(20) not null,
  sertype varchar(20) not null,
  sdate varchar (100) not null,
  phone varchar(30) not null
  )




  Select *  from UserData
  Select *  from WorkerData
  Select * from Tutor 
  Select * from Photographer 
