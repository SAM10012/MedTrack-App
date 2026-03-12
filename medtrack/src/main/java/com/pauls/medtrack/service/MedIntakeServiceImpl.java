package com.pauls.medtrack.service;

import com.pauls.medtrack.repository.MedIntakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedIntakeServiceImpl implements MedIntakeService{

    @Autowired
    private MedIntakeRepository medIntakeRepository;


}
