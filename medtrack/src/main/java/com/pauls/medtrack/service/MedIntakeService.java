package com.pauls.medtrack.service;

import com.pauls.medtrack.dto.UserNameDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MedIntakeService {

    public List<UserNameDTO> getAllUsers();
}
