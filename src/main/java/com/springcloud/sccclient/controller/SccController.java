package com.springcloud.sccclient.controller;

import com.springcloud.sccclient.service.SccDynamicService;
import com.springcloud.sccclient.service.SccService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SccController {

    private final SccService service;
    private final SccDynamicService dynamicService;

    @RequestMapping(value = "/static",method = RequestMethod.GET)
    public String getDataByStatic(){
        return service.getData();
    }

    @RequestMapping(value = "/dynamic",method = RequestMethod.GET)
    public String getDataByDynamic(){
        return dynamicService.getData();
    }

}
