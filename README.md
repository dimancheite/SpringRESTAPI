Welcome to Customer Management
==============================

The Customer Management System is written in Java with Spring RESTful API. The main focus area in the system is to perform CRUD action using Spring RESTful API.

How to run in local
-------------------

1 :  Clone project from github repository

	git clone https://github.com/Nguonchhay/SpringRESTAPI.git

2 : Go to project root directory

3 : Set up MySQL database

	- Create database name: `rupp_test`
	- Import existing database from root directory of project/src/main/resources: `rupp_test.sql`

4 : Enable open project in Eclipse

	mvn eclipse:eclipse

5 : Start web server to run project

	mvn jetty:run

CRUD customer RESTful API
-------------------------

1 : GET http://localhost:8080/api/customers/v1/all

2 : GET http://localhost:8080/api/customers/v1/{id}

3 : POST http://localhost:8080/api/customers/v1

4 : DELETE http://localhost:8080/api/customers/v1/{id}

5 : PUT http://localhost:8080/api/customers/v1/{id}

Cheers
------

Hope you can run this project successfully.