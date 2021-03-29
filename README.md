# techProject

The system should do the following:

1. Place an order, linked to a customer
2. Retrieve a customer with their linked order(s)
3. Load all customers and their linked orders


* The system was refactored using Spring technology which uses Springboot
* using rest api and spring data technology
* restful services were documented using Open API pecification
* the spec can be accesed via http://localhost:8082/swagger-ui/index.html
* database link : http://localhost:8082/h2-console/
* uses an in memory database, only for test purposes
* the project can be run as a standalone project by extrading the project as jar file
* run the following commands:
1. mvn clean(this will produce a jar file)
2. jar -jar jarName
