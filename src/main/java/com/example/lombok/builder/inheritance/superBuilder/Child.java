package com.example.lombok.builder.inheritance.superBuilder;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

/*
    Create by Atiye Mousavi 
    Date: 2/27/2022
    Time: 12:57 PM
**/
@Getter
//@Builder همچنین از تولید نمونه ای از سازنده از نمونه ای از کلاس اصلی پشتیبانی می کند. این ویژگی به طور پیش فرض فعال نیست. می‌توانیم آن را با تنظیم پارامتر toBuilder در حاشیه‌نویسی سازنده فعال کنیم:
@SuperBuilder(toBuilder = true)
public class Child extends Parent{
    private final String childName;
    private final int childAge;
}
