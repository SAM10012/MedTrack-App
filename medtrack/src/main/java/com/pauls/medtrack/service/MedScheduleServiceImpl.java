package com.pauls.medtrack.service;

import com.pauls.medtrack.model.MedSchedule;
import com.pauls.medtrack.repository.MedScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedScheduleServiceImpl implements MedScheduleService{

    @Autowired
    private MedScheduleRepository medScheduleRepository;

    @Override
    public void addNewMedSchedule(MedSchedule medSchedule) {
        medScheduleRepository.save(medSchedule);

    }

    @Override
    public List<MedSchedule> getAllSchedules() {
        return medScheduleRepository.findAll();
    }


}
