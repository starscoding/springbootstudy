package com.azxx.demon.controller;

import com.azxx.demon.service.DemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "demon")
public class DemoController {

    @Autowired
    private DemonService demonService;

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String helloworld(){
        return demonService.helloworld();
    }



}
