# Microservices Demo

## Objective
This project demonstrates a basic microservice developed using Spring Boot.

## Technologies Used
- Java 21
- Spring Boot 3
- Spring Web
- Maven

## Project Structure

- `GreetingController` - Handles REST API requests.
- `GreetingService` - Contains the business logic.
- `MicroservicesDemoApplication` - Main Spring Boot application.

## REST Endpoint

### Get Greeting

**Request**

```
GET /greet
```

**URL**

```
http://localhost:8080/greet
```

**Response**

```
Welcome to Microservices!
```

## Features

- RESTful Web Service
- Layered Architecture (Controller + Service)
- Spring Boot Application
- Maven Project
