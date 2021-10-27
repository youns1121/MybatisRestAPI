package com.mybatisrestapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api")
public class ApiController {


    @GetMapping("/get")
    @ResponseStatus(value = HttpStatus.OK)
    public String getApi(){
        return "{\"result\":\"ok\"}";
    }
}
