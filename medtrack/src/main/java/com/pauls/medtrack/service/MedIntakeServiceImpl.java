package com.pauls.medtrack.service;

import com.pauls.medtrack.dto.UserNameDTO;
import com.pauls.medtrack.repository.MedIntakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MedIntakeServiceImpl implements MedIntakeService{

    @Autowired
    private MedIntakeRepository medIntakeRepository;


    @Override
    public List<UserNameDTO> getAllUsers() {
        List<String> users = medIntakeRepository.findDistinctUsers();

        List<UserNameDTO> userDTOList = new ArrayList<>();

        for(String user : users)
        {
            userDTOList.add(new UserNameDTO(user));
        }

        return userDTOList;
    }
}
