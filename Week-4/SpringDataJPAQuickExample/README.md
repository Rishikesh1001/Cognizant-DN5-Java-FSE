# Spring Data JPA Quick Example

## Objective
This project demonstrates the basic implementation of Spring Data JPA using Spring Boot and the H2 in-memory database.

## Technologies Used
- Java 21
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

## Files
- Employee.java - Entity class
- EmployeeRepository.java - JPA Repository interface
- SpringDataJpaApplication.java - Main application class
- application.properties - Database configuration

## Output
- Stores employee records in the H2 database.
- Retrieves and displays employee records using Spring Data JPA.

## Difference between JPA, Hibernate and Spring Data JPA

| JPA | Hibernate | Spring Data JPA |
|-----|-----------|-----------------|
| JPA is a specification. | Hibernate is an implementation of JPA. | Spring Data JPA simplifies database access using JPA. |
| Defines ORM standards. | Provides ORM functionality. | Provides JpaRepository for CRUD operations. |
