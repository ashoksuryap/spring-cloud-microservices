# Spring Cloud Microservices

## Scale Cube

![untitled diagram 3](https://cloud.githubusercontent.com/assets/2116198/21102069/6d36ac32-c0a2-11e6-91cc-44b314060acf.png)

## Architecture

![untitled diagram](https://cloud.githubusercontent.com/assets/2116198/21046696/e7758ef6-be2b-11e6-9a36-e9d246a31ca9.png)


## Microservice components

![untitled diagram 5](https://cloud.githubusercontent.com/assets/2116198/21081871/c8f5b2a0-bff5-11e6-9995-71833939a33d.png)

![untitled diagram 4](https://cloud.githubusercontent.com/assets/2116198/21081769/65b013cc-bff3-11e6-8cf1-896e71d853e8.png)

## Server side discovery

![untitled diagram 1](https://cloud.githubusercontent.com/assets/2116198/21081567/e216ea84-bfef-11e6-92b6-0ca4480f630d.png)

## API Gateway

![untitled diagram 2](https://cloud.githubusercontent.com/assets/2116198/21081614/c07d7dba-bff0-11e6-8079-60c315b41982.png)

## Ribbon (Client Side Load balancing)

![untitled diagram 3](https://cloud.githubusercontent.com/assets/2116198/21081705/1889d73c-bff2-11e6-979f-e198c8e56027.png)

## Hystrix Dashboard

![hystrix-web-console](https://cloud.githubusercontent.com/assets/2116198/21081720/849bee92-bff2-11e6-9c77-5ea3f0124936.png)

## Deployment in Docker Containers

![untitled diagram 7](https://cloud.githubusercontent.com/assets/2116198/21081982/c3bbe6e0-bff7-11e6-8d56-a5f015ab744f.png)

## Source Control, CI, Docker Pipeline

![b6zmkdgnwn24jggg74yfjlntzqrqzn7y9abztaxoq8q](https://cloud.githubusercontent.com/assets/2116198/21082039/d78c659a-bff8-11e6-98e4-d67045a86720.png)

## Run the application

We can run this application starting individual services or from docker.

### Run the application by starting individual services
All the services are written using spring boot so all the services has a starting Application entry point.

1. Book Service and Review service are using MYSQL database so we need to start the docker database first 
   a. Goto ${BASE_DIR}/spring-cloud-microservices/ and execute $ docker-compose -f docker-db-conpose.yml up
   b. Alternatively we can create bookservice and reviewservice schema in our local db as flyway can't create the schema
   c. If we have selected the second approach make sure db connection port has also been updated properly.
   
2. Start 
   a. service-registry
   b. uaa-service
   c. book-service
   d. hystrix-monitor-service
   e. inventory-service
   f. review-service
   g. api-gateway
3. Individual services can be accessed    
   a. Eureka Service: http://localhost:8761
   b. API Gateway: http://localhost:8080
   c. Hystrix Dashboard: http://localhost:9000/hystrix
4. To see application running access the URL http://localhost:8080/books/api/v1/books
   It will take care of redirecting the browser for UAA 

### Run the application from Docker

We have to go to ${BASE_DIR}/spring-cloud-microservices/ and execute $ docker-compose up. It will take care of all the services anlongwith MYSQL DB one by one.

1. Individual services can be accessed    
   a. Eureka Service: http://localhost:8761
   b. API Gateway: http://localhost:8080
   c. Hystrix Dashboard: http://localhost:9000/hystrix
   
2. To see application running access the URL http://localhost:8080/books/api/v1/books
   It will take care of redirecting the browser for UAA 


Docker toolbox:-
C:\Program Files\Docker Toolbox\start.sh
export DOCKER_TLS_VERIFY="1"

Docker Desktop:-
docker Settings/General
export DOCKER_HOST="tcp://192.168.99.101:2376"
