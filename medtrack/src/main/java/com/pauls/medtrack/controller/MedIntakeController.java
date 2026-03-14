package com.pauls.medtrack.controller;


import com.pauls.medtrack.dto.DailyIntakeDTO;
import com.pauls.medtrack.dto.UserNameDTO;
import com.pauls.medtrack.service.MedIntakeService;
import com.pauls.medtrack.service.MedIntakeServiceImpl;
import com.pauls.medtrack.service.MedScheduleService;
import com.pauls.medtrack.service.MedScheduleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MedIntakeController {

    @Autowired
    private MedScheduleService medScheduleService;

    @Autowired
    private MedIntakeService medIntakeService;


    @GetMapping("/medtrack/users")
    public List<UserNameDTO> usersHomePage()
    {
        return medIntakeService.getAllUsers();
    }

    @GetMapping("/medtrack/intake/{user}")
    public DailyIntakeDTO getDailyIntake(@PathVariable String user)
    {
        return medIntakeService.getDailyIntake(user);
    }
}


