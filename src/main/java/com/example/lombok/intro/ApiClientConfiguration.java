package com.example.lombok.intro;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/*
    Create by Atiye Mousavi 
    Date: 2/27/2022
    Time: 3:16 PM
**/
@Builder
@Slf4j
@Getter
public class ApiClientConfiguration {
    private String host;
    private int port;
    private boolean useHttps;

    private long connectTimeout;
    private long readTimeout;

    private String username;
    private String password;
}
