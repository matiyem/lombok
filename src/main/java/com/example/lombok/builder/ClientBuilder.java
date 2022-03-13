package com.example.lombok.builder;

import lombok.Builder;

/*
    Create by Atiye Mousavi 
    Date: 2/27/2022
    Time: 1:36 PM
**/
public class ClientBuilder {
    @Builder(builderMethodName = "builder")
    public static ImmutableClient newClient(int id ,String name){
        return new ImmutableClient(id, name);
    }
}
