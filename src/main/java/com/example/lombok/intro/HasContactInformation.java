package com.example.lombok.intro;

/*
    Create by Atiye Mousavi 
    Date: 2/27/2022
    Time: 3:25 PM
**/
public interface HasContactInformation {

    String getFirstName();
    void setFirstName(String firstName);

    String getFullName();

    String getLastName();
    void setLastName(String lastName);

    String getPhoneNr();
    void setPhoneNr(String phoneNr);

}
