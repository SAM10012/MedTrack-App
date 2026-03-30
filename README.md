# 💊 **MedTrack – Medicine Intake Tracking System**

A **Spring Boot based medicine intake tracking application** that helps users track daily medication intake based on predefined medicine schedules.

The system allows caregivers or family members to create medication schedules and enables users to record whether medicines were taken at specific times of the day.

**MedTrack solves a real-world healthcare problem — Forgetting about scheduled medicine intake.**

---

# 🚀 Tech Stack

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

# 📦 Key Features

- Full CRUD Operations for Medicine Schedule Management
- Does not allow Start Date Update once that date has passed. Checks End Date is after Start Date.
- For each user, automatically determines medicines scheduled **for the current day**
- Group medicines by **time slots**
- Record medicine intake (**Taken / Not Taken**)
- Undo option before saving med intake status
- Maintain **medicine intake history logs**
- Mobile friendly user interface
- Global exception handling
- DTO based API responses
- Environment variable based database credentials

---

# 🔗 REST APIs
---
### 1. Get All Users

GET /medtrack/users

Returns all users with medicine schedules.

**Response Example**
```json
[
  { "userName": "Alice" },
  { "userName": "Bob" }
]

Controller Method

@GetMapping("/medtrack/users")
public List<UserNameDTO> usersHomePage()

### 2. Get Daily Medicine Intake Schedule

GET /medtrack/intake/{user}

Returns medicines scheduled for the current day, grouped by time slot.

Example Request

GET /medtrack/intake/Alice

Response Example

{
  "userName": "Alice",
  "date": "2026-03-30",
  "timeSlots": [
    {
      "timeSlot": "After_Breakfast",
      "medicines": [
        { "medName": "Vitamin C", "intakeStatus": null }
      ]
    },
    {
      "timeSlot": "Before_Dinner",
      "medicines": [
        { "medName": "Metformin", "intakeStatus": null }
      ]
    }
  ]
}

Controller Method

@GetMapping("/medtrack/intake/{user}")
public DailyIntakeDTO getDailyIntake(@PathVariable String user)

### 3. Record Medicine Intake
POST /medtrack/intake/save

Request Body Example

{
  "userName": "Alice",
  "medName": "Vitamin C",
  "timeSlot": "After_Breakfast",
  "status": "Taken"
}

Response

User Input Recorded

Controller Method

@PostMapping("/medtrack/intake/save")
public String saveUserInput(@RequestBody UserInputDTO userInput)

### 4. View Medicine Intake Logs (Web)
GET /med-intake-logs/view

Displays all intake records in a Thymeleaf page.

Controller Method

@GetMapping("/med-intake-logs/view")
public String viewMedIntakeLogs(Model model)

### 5. CRUD APIs for Medicine Schedule (Web + Backend)
Operation	Endpoint	Notes
View Home Page	/	Homepage for caregivers
Add New Schedule	/schedule/new	Returns HTML form
Save Schedule	/schedule/save	Handles POST from form
View All Schedules	/schedules/view	Returns all schedules in web view
Update Schedule	/update-schedule/{id}	Returns prefilled HTML form
Delete Schedule	/delete-schedule/{id}	Deletes schedule by ID

Note: Schedule APIs are currently web-based (Thymeleaf), not pure REST.
---

## 🏗️ Project Architecture

The application follows a **layered architecture** to separate responsibilities and maintain clean code structure.

```
Client (Browser / JavaScript / Thymeleaf)
            │
            ▼
        Controller Layer
            │
            ▼
        Service Layer
            │
            ▼
       Repository Layer
            │
            ▼
           Database
```

### Controller Layer

Handles incoming HTTP requests and returns responses or views.

* `MedIntakeController`
* `MedScheduleController`

Responsibilities:

* Receive API requests
* Call appropriate service methods
* Return JSON responses or HTML views

---

### Service Layer

Contains the **business logic** of the application.

* `MedIntakeService`
* `MedScheduleService`
* `MedIntakeServiceImpl`
* `MedScheduleServiceImpl`

Responsibilities:

* Process medicine schedules
* Determine daily medicines for a user
* Record medicine intake
* Coordinate repository operations

---

### Repository Layer

Handles **database interactions** using Spring Data JPA.

Responsibilities:

* Fetch medicine schedules
* Store intake records
* Query user medicine data

---

### Database Layer

The application uses **MySQL** for persistent storage.

Main tables:

* `med_schedule`
* `med_intake_details`

These tables store medicine schedules and daily intake records.

---

# 🗄️ Database Tables

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

# 🖼️ Screenshots

---

# 🛠️ How to Run

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

# 👩‍💻 Author

**Samadrita Paul**  
Java Backend Developer | Spring Boot | REST APIs | MySQL

   

