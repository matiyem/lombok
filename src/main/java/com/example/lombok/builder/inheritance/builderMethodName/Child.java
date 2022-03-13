package com.example.lombok.builder.inheritance.builderMethodName;

import lombok.Builder;
import lombok.Getter;

/*
    Create by Atiye Mousavi 
    Date: 2/27/2022
    Time: 12:38 PM
**/
@Getter
public class Child extends Parent {

    private final String childName;
    private final int childAge;

    @Builder(builderMethodName = "childBuilder")
    public Child(String parentName, int parentAge, String childName, int childAge) {
        super(parentName, parentAge);
        this.childName = childName;
        this.childAge = childAge;
    }
}
