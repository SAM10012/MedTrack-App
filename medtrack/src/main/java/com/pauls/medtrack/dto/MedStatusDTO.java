package com.pauls.medtrack.dto;

import com.pauls.medtrack.model.Status;

public class MedStatusDTO {

    private String medName;
    private Status intakeStatus;

    public MedStatusDTO(){}

    public MedStatusDTO(String medName, Status intakeStatus) {
        this.medName = medName;
        this.intakeStatus = intakeStatus;
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
}
