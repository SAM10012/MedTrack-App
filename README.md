**MedTrack – Medicine Intake Tracking System**

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

```
## **The project has REST APIs for medicine intake operations and MVC endpoints for schedule management using Thymeleaf.**

## Medicine Schedule Management Endpoints

These endpoints manage the **creation, viewing, updating, and deletion of medicine schedules**.

---

### 1. Home Page

Displays the main MedTrack homepage where users can select available users.

**Endpoint**

```
GET /
```

**Description**

Loads the main application homepage.

**Controller Method**

```
@GetMapping("/")
public String viewHomePage()
```

**Returns View**

```
medtrack-homepage.html
```

---

### 2. Open New Medicine Schedule Form

Displays the form used to create a new medicine schedule.

**Endpoint**

```
GET /schedule/new
```

**Description**

Loads the schedule creation form.

**Controller Method**

```
@GetMapping("/schedule/new")
public String addMedSchedule(Model model)
```

**Returns View**

```
new-schedule-form.html
```

---

### 3. Save Medicine Schedule

Saves a new medicine schedule submitted from the form.

**Endpoint**

```
POST /schedule/save
```

**Description**

Processes the schedule form submission and stores the schedule in the database.

**Form Data**

| Field | Description |
|------|-------------|
| userName | Name of the user |
| medName | Medicine name |
| startDate | Schedule start date |
| endDate | Schedule end date |
| timeSlot | Medicine timing |

**Controller Method**

```
@PostMapping("/schedule/save")
public String saveMedSchedule(@ModelAttribute("medSchedule") MedSchedule medSchedule)
```

**Redirect**

```
redirect:/
```

---

### 4. View All Medicine Schedules

Displays all medicine schedules stored in the system.

**Endpoint**

```
GET /schedules/view
```

**Description**

Shows a table containing all medicine schedules.

**Controller Method**

```
@GetMapping("/schedules/view")
public String viewAllMedSchedules(Model model)
```

**Returns View**

```
show-all-med-schedules.html
```

---

### 5. Update Medicine Schedule

Loads the schedule update form for a specific schedule.

**Endpoint**

```
GET /update-schedule/{id}
```

**Path Parameter**

| Parameter | Description |
|----------|-------------|
| id | Unique schedule ID |

**Controller Method**

```
@GetMapping("/update-schedule/{id}")
public String updateMedSchedule(@PathVariable int id, Model model)
```

**Returns View**

```
update-schedule-form.html
```

---

### 6. Delete Medicine Schedule

Deletes a medicine schedule from the system.

**Endpoint**

```
GET /delete-schedule/{id}
```

**Path Parameter**

| Parameter | Description |
|----------|-------------|
| id | Unique schedule ID |

**Controller Method**

```
@GetMapping("/delete-schedule/{id}")
public String deleteMedSchedule(@PathVariable int id)
```

**Redirect**

```
redirect:/
```

---

## Med Intake APIs

These APIs handle **user selection, daily medicine schedule retrieval, and recording medicine intake**.

---

### 1. Get All Users

Returns the list of users who have medicine schedules defined in the system.

**Endpoint**

```
GET /medtrack/users
```

**Description**

Used by the homepage to display available users.

**Response Example**

```json
[
  {
    "userName": "Alice"
  },
  {
    "userName": "Bob"
  }
]
```

**Controller Method**

```
@GetMapping("/medtrack/users")
public List<UserNameDTO> usersHomePage()
```

---

### 2. Get Daily Medicine Intake Schedule

Returns the medicines scheduled **for the current day** for a specific user.

The backend determines the medicines based on the schedule dates and groups them by **time slots**.

**Endpoint**

```
GET /medtrack/intake/{user}
```

**Path Parameter**

| Parameter | Type | Description |
|-----------|------|-------------|
| user | String | Name of the user |

**Example Request**

```
GET /medtrack/intake/Alice
```

**Response Example**

```json
{
  "userName": "Alice",
  "date": "2026-03-16",
  "timeSlots": [
    {
      "timeSlot": "After_Breakfast",
      "medicines": [
        {
          "medName": "Vitamin C",
          "intakeStatus": null
        }
      ]
    },
    {
      "timeSlot": "Before_Dinner",
      "medicines": [
        {
          "medName": "Metformin",
          "intakeStatus": null
        }
      ]
    }
  ]
}
```

**Controller Method**

```
@GetMapping("/medtrack/intake/{user}")
public DailyIntakeDTO getDailyIntake(@PathVariable String user)
```

---

### 3. Record Medicine Intake

Records whether a user has taken or not taken a medicine for a specific time slot.

**Endpoint**

```
POST /medtrack/intake/save
```

**Request Body Example**

```json
{
  "userName": "Alice",
  "medName": "Vitamin C",
  "timeSlot": "After_Breakfast",
  "status": "Taken"
}
```

**Request Fields**

| Field | Type | Description |
|------|------|-------------|
| userName | String | Name of the user |
| medName | String | Medicine name |
| timeSlot | String | Scheduled time slot for the medicine |
| status | String | Medicine intake status (Taken / Not_Taken) |

**Response**

```
User Input Recorded
```

**Controller Method**

```
@PostMapping("/medtrack/intake/save")
public String saveUserInput(@RequestBody UserInputDTO userInput)
```

---


**# Project Architecture**

```


---

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

---

# Author

Samadrita Paul  
Java Backend Developer

   

