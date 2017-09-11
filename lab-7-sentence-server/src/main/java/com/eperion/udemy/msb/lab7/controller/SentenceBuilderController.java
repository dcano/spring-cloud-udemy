package com.eperion.udemy.msb.lab7.controller;

import com.eperion.udemy.msb.lab7.service.SentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SentenceBuilderController {

    private SentenceService sentenceService;

    @Autowired
    public SentenceBuilderController(SentenceService sentenceService) {
        this.sentenceService = sentenceService;
    }

    @RequestMapping("/sentence")
    public @ResponseBody
    String getSentence() {
        return sentenceService.getSentence();
    }

}
