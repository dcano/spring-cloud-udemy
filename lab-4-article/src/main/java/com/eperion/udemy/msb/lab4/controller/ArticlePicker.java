package com.eperion.udemy.msb.lab4.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticlePicker {

    @Value("${words}") String articles;

    @RequestMapping("/")
    public @ResponseBody
    String getWord() {
        String[] wordArray = articles.split(",");
        int i = (int)Math.round(Math.random() * (wordArray.length - 1));
        return wordArray[i];
    }

}
