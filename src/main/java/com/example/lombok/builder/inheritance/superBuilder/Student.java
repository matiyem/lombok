package com.example.lombok.builder.inheritance.superBuilder;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

/*
    Create by Atiye Mousavi 
    Date: 2/27/2022
    Time: 12:58 PM
**/
@Getter
@SuperBuilder(toBuilder = true)
public class Student extends Child {
    private final String schoolName;
}
