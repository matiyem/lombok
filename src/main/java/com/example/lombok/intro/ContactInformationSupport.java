package com.example.lombok.intro;

import lombok.Data;

/*
    Create by Atiye Mousavi 
    Date: 2/27/2022
    Time: 3:32 PM
**/
@Data
public class ContactInformationSupport implements HasContactInformation {

    private String firstName;
    private String lastName;
    private String phoneNr;

    @Override
    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }
}
