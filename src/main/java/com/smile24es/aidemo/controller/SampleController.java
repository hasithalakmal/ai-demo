package com.smile24es.aidemo.controller;

import com.smile24es.aidemo.repository.OpenAiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private OpenAiClient openAiClient;

    @GetMapping(value = "test")
    @ResponseStatus(HttpStatus.OK)
    public String sample() {
        return "OK";
    }

    @GetMapping(value = "test2")
    @ResponseStatus(HttpStatus.OK)
    public String sample2() {
        String sampel = openAiClient.exampleFegin();
        System.out.println(sampel);
        return "OK";
    }
}
