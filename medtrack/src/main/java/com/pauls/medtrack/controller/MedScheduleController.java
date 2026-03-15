package com.pauls.medtrack.controller;

import com.pauls.medtrack.model.MedSchedule;
import com.pauls.medtrack.service.MedIntakeService;
import com.pauls.medtrack.service.MedScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
public class MedScheduleController {


    @Autowired
    private MedScheduleService medScheduleService;

    @Autowired
    private MedIntakeService medIntakeService;

    @GetMapping("/")
    public String viewHomePage()
    {
        return "medtrack-homepage";
    }

    @GetMapping("/schedule/new")
    public String addMedSchedule(Model model)
    {
        MedSchedule medSchedule = new MedSchedule();
        model.addAttribute("medSchedule",medSchedule);
        return "new-schedule-form";
    }

    @PostMapping("/schedule/save")
    public String saveMedSchedule(@ModelAttribute("medSchedule") MedSchedule medSchedule)
    {
        medScheduleService.addNewMedSchedule(medSchedule);
        return "redirect:/";
    }

    @GetMapping("/schedules/view")
    public String viewAllMedSchedules(Model model){
        model.addAttribute("allMedSchedules",medScheduleService.getAllSchedules());
        return "show-all-med-schedules";
    }

    @GetMapping("/update-schedule/{id}")
    public String updateMedSchedule(@PathVariable(value = "id") int id, Model model)
    {
        MedSchedule medSchedule = medScheduleService.getMedScheduleById(id);
        model.addAttribute("medSchedule",medSchedule);
        model.addAttribute("today", LocalDate.now());
        return "update-schedule-form";
    }

    @GetMapping("/delete-schedule/{id}")
    public String deleteMedSchedule(@PathVariable(value = "id") int id)
    {
        medScheduleService.deleteMedScheduleById(id);
        return "redirect:/";
    }


}