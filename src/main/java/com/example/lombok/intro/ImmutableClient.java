package com.example.lombok.intro;

/*
    created by Atiye Mousavi
    Date: 2/28/2022
    Time: 5:11 PM
*/

import lombok.Value;

@Value
public final class ImmutableClient {
    private int id;
    private String name;
}
