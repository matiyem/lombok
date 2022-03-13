package com.example.lombok.builder.defaultValue;

import lombok.*;

/*
    Create by Atiye Mousavi 
    Date: 2/27/2022
    Time: 12:33 PM
**/
@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Pojo {
    private String name="foo";
    private boolean original=true;
}
