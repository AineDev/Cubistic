# Cubistic


### RESTful API for bank statistics
* The main use case for the API is to calculate real-time statistics for the last 60 seconds of transactions.


### Getting Started
#### Running the application
 `./mvnw clean spring-boot:run`

#### Run tests 
`mvn test`

### Available Endpoints

#### POST /transactions
Create a new transaction. 

Example POST:
`curl -X POST localhost:8080/transactions -H 'Content-type:application/json' -d '{"amount": "22", "timestamp": "2019-10-08T13:07:00.312Z"}'`

#### GET /statistics
Returns the statistics computed on the transactions within the last 60 seconds. 

Example GET:
`curl -v localhost:8080/statistics`

#### DELETE /transactions
causes all existing transactions to be deleted 

Example DELETE:
`curl -v -X DELETE localhost:8080/transactions`  


### Design Decisions

