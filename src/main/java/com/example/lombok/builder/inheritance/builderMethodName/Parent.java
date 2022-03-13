package com.example.lombok.builder.inheritance.builderMethodName;

import lombok.Builder;
import lombok.Getter;

/*
    Create by Atiye Mousavi 
    Date: 2/27/2022
    Time: 12:36 PM
**/
@Getter
@Builder
public class Parent {
    private final String parentName;
    private final int parentAge;
}
