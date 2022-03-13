package com.example.lombok.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

/*
    Create by Atiye Mousavi 
    Date: 2/27/2022
    Time: 1:52 PM
**/
//در این مورد، سازنده پیش‌فرض را به‌عنوان interiorBuilder پنهان می‌کنیم و خودمان را ایجاد می‌کنیم. بنابراین، هنگامی که سازنده را ایجاد می کنیم، باید پارامتر مورد نیاز را ارائه دهیم:
@Builder(builderMethodName = "internalBuilder")
@Getter
public class RequiredFieldAnnotation {

    @NonNull
    String name;
    String description;

    public static RequiredFieldAnnotationBuilder builder(String name){
        return internalBuilder().name(name);
    }
}
