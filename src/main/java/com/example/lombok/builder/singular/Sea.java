package com.example.lombok.builder.singular;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;

/*
    Create by Atiye Mousavi 
    Date: 2/27/2022
    Time: 1:33 PM
**/
@Getter
@Builder
public class Sea {
    @Singular private final List<String> grasses;
    @Singular("oneFish") private final List<String> fish;
}
