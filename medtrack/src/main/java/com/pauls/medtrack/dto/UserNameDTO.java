package com.pauls.medtrack.dto;

import lombok.AllArgsConstructor;

public class UserNameDTO {

    private String userName;

    public UserNameDTO()
    {}

    public UserNameDTO(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
