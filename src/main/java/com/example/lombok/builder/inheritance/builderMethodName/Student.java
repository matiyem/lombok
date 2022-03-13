package com.example.lombok.builder.inheritance.builderMethodName;

import lombok.Builder;
import lombok.Getter;

/*
    Create by Atiye Mousavi 
    Date: 2/27/2022
    Time: 12:53 PM
**/
@Getter
public class Student extends Child{

    private final String schoolName;

    @Builder(builderMethodName = "studentBuilder")
    public Student(String parentName, int parentAge, String childName, int childAge, String schoolName) {
        super(parentName, parentAge, childName, childAge);
        this.schoolName = schoolName;
    }
}
