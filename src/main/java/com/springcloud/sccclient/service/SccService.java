package com.springcloud.sccclient.service;

import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SccService {
    @NotNull
    @Value("${test.id}")
    private String id;

    @NotNull
    @Value("${test.password}")
    private String password;

    public String getData(){
        return "ID/PASSWORD : "+String.join("/",id,password);
    }
}
