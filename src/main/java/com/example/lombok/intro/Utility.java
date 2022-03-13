package com.example.lombok.intro;

/*
    created by Atiye Mousavi
    Date: 2/28/2022
    Time: 5:46 PM
*/


import lombok.SneakyThrows;
import lombok.Synchronized;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class Utility {
    @SneakyThrows
    public String resourceAsString() throws IOException {
        try (InputStream is = this.getClass().getResourceAsStream("sure_in_my_jar.txt")) {
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            return br.lines().collect(Collectors.joining("\n"));
        }
    }

    @Synchronized
    public void putValueInCache(String key, String value) {
        System.out.println("Thread safe here with key : [" + key + "] and value[" + value + "]");
    }
}
