# studentportal


# 🎓 Student Portal Management System

## 📌 Project Overview

The Student Portal Management System is a backend application developed using Java and Spring Boot. It provides RESTful APIs to manage student information, allowing users to add, retrieve, update, and delete student records.

This project helped me gain practical knowledge of backend development, REST API implementation, and database integration using MySQL.

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- REST APIs
- Eclipse IDE
- Postman

## ✨ Features

- Add new student records.
- Retrieve all student details.
- Search students by first name.
- Retrieve student details using ID.
- Update existing student information.
- Delete student records.
- Store and manage student data using MySQL.

## 🔗 REST API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/student/ss` | Test API |
| GET | `/student/getAllStudents` | Get all students |
| GET | `/student/getStudent/fname/{fname}` | Search by first name |
| GET | `/student/getStudent/{id}` | Get student by ID |
| PUT | `/student/update/{id}` | Update student |
| DELETE | `/student/delete/{id}` | Delete student |

## ⚙️ Database Configuration

Configure MySQL in `application.properties`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

## 🚀 How to Run the Project

1. Clone the repository from GitHub.
2. Import the project into Eclipse IDE.
3. Create a MySQL database named `studentdb`.
4. Configure database credentials in `application.properties`.
5. Update Maven dependencies.
6. Run the Spring Boot application.
7. Test the APIs using Postman or a browser.

## 🎯 Learning Outcomes

- Understanding Java and Spring Boot.
- Developing RESTful web services.
- Implementing CRUD operations.
- Connecting Spring Boot with MySQL.
- Using Spring Data JPA and Hibernate.
- Understanding Controller and Repository layers.
- Testing REST APIs using Postman.



Java | Spring Boot | MySQL | REST API Development

---

⭐ Thanks for visiting my project! Feel free to explore the repository.

