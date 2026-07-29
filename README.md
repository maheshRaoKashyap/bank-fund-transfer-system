# 🏦 Bank Fund Transfer System

A full-stack banking application built using **Java 17**, **Spring Boot**, and **Thymeleaf** that simulates essential banking operations such as account creation, deposits, fund transfers, and account management.

The application follows a clean layered architecture (**Controller → Service → Repository → Database**) and demonstrates industry-standard backend development practices including MVC architecture, validation, persistence, and cloud deployment.

---

## 🚀 Live Demo

🌐 https://bank-fund-transfer-system.onrender.com

---

## 📂 GitHub Repository

🔗 https://github.com/maheshRaoKashyap/bank-fund-transfer-system

---

# 📖 Project Overview

The Bank Fund Transfer System is a web-based application that allows users to perform basic banking operations through a simple and responsive interface.

It demonstrates how enterprise backend applications are structured using Spring Boot while integrating frontend rendering using Thymeleaf.

The project is containerized using Docker and deployed on Render Cloud.

---

# ✨ Features

### Account Management

- Create New Bank Account
- Search Account by Account ID
- View All Customer Accounts
- Delete Customer Account

### Banking Operations

- Deposit Money
- Transfer Money Between Accounts
- Balance Management

### Validation

- Form Validation using Jakarta Validation
- Error Handling
- Success & Failure Messages

### User Interface

- Responsive Dashboard
- Clean UI using Thymeleaf
- Server-side Rendering

---

# 🛠 Tech Stack

## Backend

- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate

## Frontend

- Thymeleaf
- HTML5
- CSS3

## Database

- H2 Database

## Build Tool

- Maven

## Version Control

- Git
- GitHub

## Containerization

- Docker

## Deployment

- Render

---

# 🏗 Project Architecture

```
                Client (Browser)
                       │
                       ▼
             Spring MVC Controller
                       │
                       ▼
               Service Layer
         (Business Logic & Validation)
                       │
                       ▼
             Repository Layer (JPA)
                       │
                       ▼
                 H2 Database
```

The application follows a layered architecture to ensure:

- Separation of Concerns
- Maintainability
- Scalability
- Testability
- Clean Code Practices

---

# 🔄 Application Workflow

```
User Action
      │
      ▼
Spring MVC Controller
      │
      ▼
Business Logic (Service Layer)
      │
      ▼
JPA Repository
      │
      ▼
H2 Database
      │
      ▼
Updated Response
      │
      ▼
Thymeleaf UI
```

---

# 📁 Project Structure

```
src
 ├── main
 │   ├── java
 │   │    └── com.example.demo
 │   │          ├── controller
 │   │          ├── service
 │   │          ├── repository
 │   │          ├── entity
 │   │          ├── dto
 │   │          └── BankFundTransferSystemApplication.java
 │   │
 │   └── resources
 │        ├── templates
 │        │      └── index.html
 │        ├── static
 │        └── application.properties
 │
 └── test
```

---

# 🏦 Banking Operations

## ✅ Create Account

Creates a new customer account with an initial balance.

---

## 🔍 Search Account

Searches an account using Account ID.

---

## 💰 Deposit Money

Deposits money into an existing account.

---

## 💸 Transfer Money

Transfers funds securely from one account to another.

Validation includes:

- Sender exists
- Receiver exists
- Sufficient Balance

---

## 🗑 Delete Account

Deletes an existing customer account.

---

## 📋 View All Accounts

Displays all customer accounts.

---

# 📸 Screenshots

> Add screenshots here after uploading them.

Example:

```
screenshots/

dashboard.png

create-account.png

transfer-money.png

view-accounts.png
```

---

# 🐳 Docker

Build Docker Image

```bash
docker build -t bank-fund-transfer-system .
```

Run Container

```bash
docker run -p 8080:8080 bank-fund-transfer-system
```

---

# ☁ Cloud Deployment

This application is deployed using **Render Cloud**.

Live URL

https://bank-fund-transfer-system.onrender.com

---

# ⚙ Running Locally

### Clone Repository

```bash
git clone https://github.com/maheshRaoKashyap/bank-fund-transfer-system.git
```

---

### Navigate to Project

```bash
cd bank-fund-transfer-system
```

---

### Build Project

```bash
mvn clean install
```

---

### Run Application

```bash
mvn spring-boot:run
```

Application will start on

```
http://localhost:8080
```

---

# 💾 Database

Current Database

- H2 Database

Database Console

```
http://localhost:8080/h2-console
```

JDBC URL

```
jdbc:h2:file:./data/bankdb
```

Username

```
sa
```

Password

```
(blank)
```

---

# 🚀 Future Enhancements

- PostgreSQL Integration
- Spring Security
- JWT Authentication
- Transaction History
- Email Notifications
- Redis Caching
- Apache Kafka
- Microservices
- Swagger API Documentation
- Unit & Integration Testing
- CI/CD using GitHub Actions
- Kubernetes Deployment
- AWS Deployment

---

# 🎯 Learning Outcomes

This project helped strengthen my understanding of:

- Spring Boot Application Development
- MVC Architecture
- Layered Architecture
- REST Principles
- Spring Data JPA
- Hibernate ORM
- Database Design
- Thymeleaf Templates
- Form Validation
- Exception Handling
- Docker
- Git & GitHub
- Cloud Deployment using Render

---

# 👨‍💻 Developer

**Mahesh S R**

Java Backend Engineer

📧 maheshrao1621@gmail.com

🔗 LinkedIn

https://linkedin.com/in/maheshraokashyap

🔗 GitHub

https://github.com/maheshRaoKashyap

---

## ⭐ If you found this project useful, consider giving it a Star!
