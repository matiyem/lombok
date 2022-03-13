package com.example.lombok.exclusions;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/*
    Create by Atiye Mousavi 
    Date: 2/27/2022
    Time: 3:07 PM
**/
public class User {
    @Setter(AccessLevel.NONE)
    private long id;

    private String login;

    @Getter(AccessLevel.NONE)
    private int age;
}
