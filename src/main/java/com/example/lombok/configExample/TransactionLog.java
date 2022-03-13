package com.example.lombok.configExample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

/*
    Create by Atiye Mousavi 
    Date: 2/27/2022
    Time: 2:30 PM
**/
@AllArgsConstructor
@Getter
@Accessors(prefix = {"op"})
public class TransactionLog {
    double amount;
    String description;
}
