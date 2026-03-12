package com.pauls.medtrack.service;

import com.pauls.medtrack.model.MedSchedule;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MedScheduleService {

    void addNewMedSchedule(MedSchedule medSchedule);

//    void deleteMedSchedule(long id);
//
//    MedSchedule getMedScheduleById(long id);
//
//    List<MedSchedule> findMedScheduleByUser(String userName);
//
    List<MedSchedule> getAllSchedules();
}
