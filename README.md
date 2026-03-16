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

# Time Slots Supported

- After Waking Up
- Before Breakfast
- After Breakfast
- Before Lunch
- After Lunch
- Before Dinner
- After Dinner
- Before Night Sleep

---

# REST APIs

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

   

