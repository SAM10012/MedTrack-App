package com.pauls.medtrack.controller;


import com.pauls.medtrack.dto.UserNameDTO;
import com.pauls.medtrack.service.MedIntakeServiceImpl;
import com.pauls.medtrack.service.MedScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MedIntakeController {

    @Autowired
    private MedIntakeServiceImpl medIntakeService;


    @GetMapping("/medtrack/users")
    public List<UserNameDTO> usersHomePage()
    {
        return medIntakeService.getAllUsers();
    }
}


