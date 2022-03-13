package com.example.lombok.builder.singular;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
    Create by Atiye Mousavi 
    Date: 2/27/2022
    Time: 1:00 PM
**/
@Getter
@Builder
public class Person {
    private final String givenName;
    private final String additionalName;
    private final String familyName;

    private final List<String> tags;

    @Singular private final List<String> interests;
    @Singular private final Set<String> skills;
    @Singular private final Map<String, LocalDate> awards;
}
