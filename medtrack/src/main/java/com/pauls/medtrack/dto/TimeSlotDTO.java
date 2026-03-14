package com.pauls.medtrack.dto;

import com.pauls.medtrack.model.TimeSlot;

import java.util.List;

public class TimeSlotDTO {

    private TimeSlot timeSlot;
    private List<MedStatusDTO> medicines;

    public TimeSlotDTO(){}

    public TimeSlotDTO(TimeSlot timeSlot, List<MedStatusDTO> medicines) {
        this.timeSlot = timeSlot;
        this.medicines = medicines;
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(TimeSlot timeSlot) {
        this.timeSlot = timeSlot;
    }

    public List<MedStatusDTO> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<MedStatusDTO> medicines) {
        this.medicines = medicines;
    }
}
