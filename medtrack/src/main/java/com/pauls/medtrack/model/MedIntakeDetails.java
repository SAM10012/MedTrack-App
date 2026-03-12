package com.pauls.medtrack.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "med_intake_details")
public class MedIntakeDetails {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long intakeId;

    @Column(name = "user_name")
    private String userName;
    private LocalDate intakeDate;

    @Enumerated(EnumType.STRING)
    private TimeSlot timeSlot;


    private String medName;

    @Enumerated(EnumType.STRING)
    private Status intakeStatus;

    private LocalDateTime intakeTimestamp;

    public long getIntakeId() {
        return intakeId;
    }

    public void setIntakeId(long intakeId) {
        this.intakeId = intakeId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDate getIntakeDate() {
        return intakeDate;
    }

    public void setIntakeDate(LocalDate intakeDate) {
        this.intakeDate = intakeDate;
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(TimeSlot timeSlot) {
        this.timeSlot = timeSlot;
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public Status getIntakeStatus() {
        return intakeStatus;
    }

    public void setIntakeStatus(Status intakeStatus) {
        this.intakeStatus = intakeStatus;
    }

    public LocalDateTime getIntakeTimestamp() {
        return intakeTimestamp;
    }

    public void setIntakeTimestamp(LocalDateTime intakeTimestamp) {
        this.intakeTimestamp = intakeTimestamp;
    }
}


