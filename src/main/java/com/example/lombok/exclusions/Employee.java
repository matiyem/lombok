package com.example.lombok.exclusions;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/*
    Create by Atiye Mousavi 
    Date: 2/27/2022
    Time: 2:32 PM
**/
@Data
public class Employee {

    @Setter(AccessLevel.NONE)
    private String name;

    private String workPlace;

    @Getter(AccessLevel.NONE)
    private int workLength;
}
