package com.pauls.medtrack.dto;

import com.pauls.medtrack.model.Status;
import com.pauls.medtrack.model.TimeSlot;

public class UserInputDTO {

    private String userName;
    private String medName;
    private TimeSlot timeSlot;
    private Status status;

    public UserInputDTO(){}

    public UserInputDTO(String userName, String medName, TimeSlot timeSlot, Status status) {
        this.userName = userName;
        this.medName = medName;
        this.timeSlot = timeSlot;
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(TimeSlot timeSlot) {
        this.timeSlot = timeSlot;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
