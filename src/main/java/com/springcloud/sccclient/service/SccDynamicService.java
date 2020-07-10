package com.springcloud.sccclient.service;

import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope       //Spring Cloud Config Server 에서 설정파일 변경 시 반영.
public class SccDynamicService {
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
