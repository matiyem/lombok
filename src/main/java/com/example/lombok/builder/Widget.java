package com.example.lombok.builder;

import lombok.Builder;
import lombok.Getter;

/*
    Create by Atiye Mousavi 
    Date: 2/27/2022
    Time: 1:55 PM
**/
@Getter
//اگر بخواهیم یک کپی یا تقریباً کپی از اشیا ایجاد کنیم، می توانیم ویژگی toBuilder = true را به حاشیه نویسی @Builder اضافه کنیم:
@Builder(toBuilder = true)
public class Widget {
    private final String name;
    private final int id;
}
