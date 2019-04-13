package com.dc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：sunrise
 * @description ：
 * @copyright ：	Copyright 2019 yowits Corporation. All rights reserved.
 * @create ：2019/4/13 20:29
 */
@RestController
public class HelloDockerController {

    @GetMapping(value = "/get-docker")
    public String hello(){
        return "Hello Docker!";
    }

}
