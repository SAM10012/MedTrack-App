package com.pauls.medtrack.dto;

import java.time.LocalDate;
import java.util.List;

public class DailyIntakeDTO {

    private String userName;
    private LocalDate date;
    private List<TimeSlotDTO> timeSlots;
    String message;

    public DailyIntakeDTO(){}

    public DailyIntakeDTO(String userName, LocalDate date, List<TimeSlotDTO> timeSlots) {
        this.userName = userName;
        this.date = date;
        this.timeSlots = timeSlots;
    }

    public DailyIntakeDTO(String userName, LocalDate date, List<TimeSlotDTO> timeSlots, String message) {
        this.userName = userName;
        this.date = date;
        this.timeSlots = timeSlots;
        this.message = message;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<TimeSlotDTO> getTimeSlots() {
        return timeSlots;
    }

    public void setTimeSlots(List<TimeSlotDTO> timeSlots) {
        this.timeSlots = timeSlots;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
