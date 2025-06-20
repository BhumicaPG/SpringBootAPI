## 🌱 Spring Boot API with PostgreSQL (Dockerized)

This project is a simple **Spring Boot RESTful API** connected to a **PostgreSQL database** running inside a Docker container. It demonstrates how to build a backend service using Java Spring Boot and connect it to a relational database using Docker Compose.

---

## 📌 Features

- ☑️ Spring Boot-based REST API
- ☑️ PostgreSQL database (via Docker)
- ☑️ Docker Compose for environment setup
- ☑️ JPA (Java Persistence API) for database interaction
- ☑️ Clean code structure following MVC pattern
- ☑️ Supports future extension with services, repositories, etc.

---

## 🛠️ Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Docker & Docker Compose
- Maven

---

## 🐳 How to Run This Project

### 📦 1. Clone the Repository
```bash
git clone https://github.com/BhumicaPG/SpringBootAPI.git
cd SpringBootAPI
```
## 🧰 Start PostgreSQL via Docker Compose
```bash
docker compose up -d
```
## 🚀 Run the Spring Boot Application
```bash
./mvnw spring-boot:run
```
OR

VS Code / IntelliJ:
Open DemoApplication.java
Click ▶️ "Run"
