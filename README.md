# microservicios-futfem-referees

`microservicios-futfem-referees` is the referee catalog service of the Tikitakas backend. It provides the API and persistence layer used to manage referee records in the Women Football domain, allowing the platform to keep officiating information separate from players, teams, and competitions.

The service is implemented with Java 21, Spring Boot, Spring Data JPA, MySQL, Springdoc OpenAPI, and Maven Wrapper. It reuses the generic CRUD conventions from `microservicios-common`, participates in Eureka-based discovery, and is exposed to clients through the central gateway. That keeps the operational model aligned with the rest of the backend.

Typical local execution:

```bash
./mvnw spring-boot:run
```

Gateway route:

- `/api/futfem/referees/**`

The `v0.1.0` release includes CI automation, Docker image support, and a Swagger/OpenAPI configuration adapted for gateway usage. That means the generated documentation works from the aggregated Swagger UI without advertising internal Docker hostnames or random ports.

This repository is a good example of how Tikitakas splits domain concerns into focused services: referees are modeled and deployed independently, making the system easier to maintain, scale, and evolve over time.
