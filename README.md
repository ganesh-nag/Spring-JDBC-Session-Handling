# Spring JDBC Session Handling
How Spring JDBC Session works ? Here it explains....... 

@author Ganesh Nagalingam

This topic explains the need to handle Spring Session using JDBC. IT uses Oracle XE as the database.
1. Spring Session JDBC stores user session in 2 tables.
a. Spring Session
b. Spring Session Attributes

The tables can be created from the schema sql scripts available in the given code base. It provides for
multiple database and it will suit the need based on the database of choice.

2. User authentication is handled using 2 tables that can be custom created.
a. Users
b. User_Roles

The purpose of implementing Spring JDBC Session is to make sure that only ONE SESSION per USER should exist and stored in the database, even if multiple
tabs in the browser are opened and accessed for the same user. Spring Boot HTTP Basic authentication is used to provide user login.

The code base is attached for learning purpose and can be tested in your local machine. It uses MAVEN build.
Before testing, make sure that the above database tables are created.

Happy learning!!!
-----------------------------------------------------------------------------------------------------------------------------------------------------------

