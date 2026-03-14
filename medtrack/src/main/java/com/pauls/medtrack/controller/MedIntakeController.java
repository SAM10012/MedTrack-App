package com.pauls.medtrack.controller;


import com.pauls.medtrack.dto.DailyIntakeDTO;
import com.pauls.medtrack.dto.UserInputDTO;
import com.pauls.medtrack.dto.UserNameDTO;
import com.pauls.medtrack.service.MedIntakeService;
import com.pauls.medtrack.service.MedIntakeServiceImpl;
import com.pauls.medtrack.service.MedScheduleService;
import com.pauls.medtrack.service.MedScheduleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MedIntakeController {

    @Autowired
    private MedScheduleService medScheduleService;

    @Autowired
    private MedIntakeService medIntakeService;


    @GetMapping("/medtrack/users")
    @ResponseBody
    public List<UserNameDTO> usersHomePage()
    {
        return medIntakeService.getAllUsers();
    }

    @GetMapping("/medtrack/intake/{user}")
    @ResponseBody
    public DailyIntakeDTO getDailyIntake(@PathVariable String user)
    {
        return medIntakeService.getDailyIntake(user);
    }

    @PostMapping("/medtrack/intake/save")
    @ResponseBody
    public String saveUserInput(@RequestBody UserInputDTO userInput)
    {
        medIntakeService.saveUserInput(userInput);
        return "User Input Recorded";
    }

    @GetMapping("/med-intake-logs/view")
    public String viewMedIntakeLogs(Model model){
        model.addAttribute("allMedIntakeLogs",medIntakeService.getAllMedIntakeLogs());
        return "show-med-intake-logs";
    }
}


