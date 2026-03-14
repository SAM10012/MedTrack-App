package com.pauls.medtrack.service;

import com.pauls.medtrack.dto.*;
import com.pauls.medtrack.model.MedIntakeDetails;
import com.pauls.medtrack.model.MedSchedule;
import com.pauls.medtrack.model.TimeSlot;
import com.pauls.medtrack.repository.MedIntakeRepository;
import com.pauls.medtrack.repository.MedScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class MedIntakeServiceImpl implements MedIntakeService{

    @Autowired
    private MedScheduleRepository medScheduleRepository;

    @Autowired
    private MedIntakeRepository medIntakeRepository;


    @Override
    public List<UserNameDTO> getAllUsers() {
        List<String> users = medScheduleRepository.findDistinctUsers();

        List<UserNameDTO> userDTOList = new ArrayList<>();

        for(String user : users)
        {
            userDTOList.add(new UserNameDTO(user));
        }

        return userDTOList;
    }

    public DailyIntakeDTO getDailyIntake(String userName)
    {
        LocalDate today = LocalDate.now();

        List<MedSchedule> schedules =
                medScheduleRepository.findMedsForToday(userName, today);

        if(schedules.isEmpty())
        {
            return new DailyIntakeDTO(userName, today, new ArrayList<>(), "Woohoo! No Meds scheduled Today :)");
        }

        Map<TimeSlot, List<MedStatusDTO>> grouped =
                schedules.stream()
                        .collect(Collectors.groupingBy(
                                MedSchedule::getTimeSlot,
                                Collectors.mapping(
                                        m -> new MedStatusDTO(
                                                m.getMedName(),
                                                null
                                        ),
                                        Collectors.toList()
                                )
                        ));

        List<TimeSlotDTO> slots = new ArrayList<>();

        for(TimeSlot slot : grouped.keySet())
        {
            slots.add(new TimeSlotDTO(slot, grouped.get(slot)));
        }

        return new DailyIntakeDTO(userName, today, slots);
    }

    @Override
    public void saveUserInput(UserInputDTO userInput) {

        MedIntakeDetails input = new MedIntakeDetails();

        input.setUserName(userInput.getUserName());
        input.setMedName(userInput.getMedName());
        input.setTimeSlot(userInput.getTimeSlot());
        input.setIntakeStatus(userInput.getStatus());

        input.setIntakeDate(LocalDate.now());
        input.setIntakeTimestamp((LocalDateTime.now()));

        medIntakeRepository.save(input);
    }


    @Override
    public List<MedIntakeDetails> getAllMedIntakeLogs()
    {
        return medIntakeRepository.findAll();
    }
}
