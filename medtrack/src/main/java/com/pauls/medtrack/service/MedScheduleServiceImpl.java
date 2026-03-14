package com.pauls.medtrack.service;

import com.pauls.medtrack.model.MedSchedule;
import com.pauls.medtrack.repository.MedScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class MedScheduleServiceImpl implements MedScheduleService{

    @Autowired
    private MedScheduleRepository medScheduleRepository;

    @Override
    public void addNewMedSchedule(MedSchedule medSchedule) {
        medScheduleRepository.save(medSchedule);

    }

    @Override
    public void deleteMedScheduleById(long id) {
        medScheduleRepository.deleteById(id);
    }

    @Override
    public MedSchedule getMedScheduleById(long id) {
        Optional<MedSchedule> optional = medScheduleRepository.findById(id);

        MedSchedule medSchedule = null;

        if(optional.isPresent())
        {
            medSchedule = optional.get();
        }
        else {
            throw new RuntimeException("There is no such Schedule ID.");
        }

        return medSchedule;
    }

    @Override
    public List<MedSchedule> getAllSchedules() {
        return medScheduleRepository.findAll();
    }


}
