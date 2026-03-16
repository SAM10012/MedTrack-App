# **MedTrack – Medicine Intake Tracking System**

A **Spring Boot based medicine intake tracking application** that helps users track daily medication intake based on predefined medicine schedules.

The system allows caregivers or family members to create medication schedules and enables users to record whether medicines were taken at specific times of the day.

**MedTrack solves a real-world healthcare problem — Forgetting about scheduled medicine intake.**

---

# Tech Stack

**Backend**
- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate

**Frontend**
- HTML
- CSS
- JavaScript
- Thymeleaf
- Bootstrap

**Database**
- MySQL

**Tools**
- Maven
- Postman

---

# Key Features

- Admin dashboard for schedule management - CRUD Operations for Med Schedules
- For each user, automatically determines medicines scheduled **for the current day**
- Group medicines by **time slots**
- Record medicine intake (**Taken / Not Taken**)
- Undo option before saving intake status
- Maintain **medicine intake history logs**
- Mobile friendly user interface
- Global exception handling
- DTO based API responses
- Environment variable based database credentials

---

# REST APIs



**# Project Architecture**


# Database Tables

**med_schedule**

- scheduleId
- userName
- medName
- startDate
- endDate
- timeSlot

**med_intake_details**

- intakeId
- userName
- medName
- intakeDate
- intakeTimestamp
- timeSlot
- intakeStatus

---

# Screenshots

---

# How to Run

Follow the steps below to run the MedTrack application locally.

---

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/medtrack.git
cd medtrack
```

---

### 2. Create MySQL Database

Open MySQL and create a database.

```sql
CREATE DATABASE medtrack;
```

---

### 3. Configure Database Connection

Open `src/main/resources/application.properties` and configure your database credentials.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/medtrack
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 4. Build the Project

Use Maven to build the project.

```bash
mvn clean install
```

---

### 5. Run the Application

Run the Spring Boot application.

```bash
mvn spring-boot:run
```

Or run the main class:

```
MedtrackApplication.java
```

from your IDE.

---

### 6. Access the Application

Open a browser and go to:

```
http://localhost:8080
```

---

### 7. Application Flow

1. Open the homepage - http://localhost:8080/medtrack-users.html
2. Select a user to view daily medicines
3. Mark medicines as **Taken / Not Taken**
4. Caregivers can manage medicine schedules from another homepage - http://localhost:8080/

---

# Author

Samadrita Paul  
Java Backend Developer

   

