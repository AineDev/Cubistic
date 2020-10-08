# Cubistic


### RESTful API for N26 statistics
**A N26 Junior Software Engineer Coding Challenge**
* The main use case for the API is to calculate real-time statistics for the last 60 seconds of transactions.


### To run this project
Build a JAR file: `./mvnw clean package`

Run JAR file: `java -jar target/cubistic-0.0.1-SNAPSHOT.jar`

OR

Run `./mvnw clean spring-boot:run`T

Example POST:
`curl -X POST localhost:8080/transactions -H 'Content-type:application/json' -d '{"amount": "22", "timestamp": "2021-10-08T13:07:00.312Z"}'`

Example GET:
`curl -v localhost:8080/statistics`

Example DELETE:
`curl -v -X DELETE localhost:8080/transactions`  


### Design Decisions
* currently have statistic as it's own class
  * this will allow statistics to be kept longer if necessary

