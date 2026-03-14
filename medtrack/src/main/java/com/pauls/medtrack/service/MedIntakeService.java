package com.pauls.medtrack.service;

import com.pauls.medtrack.dto.DailyIntakeDTO;
import com.pauls.medtrack.dto.UserNameDTO;
import com.pauls.medtrack.model.MedSchedule;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

public interface MedIntakeService {

    public List<UserNameDTO> getAllUsers();

    public DailyIntakeDTO getDailyIntake(String userName);
}
