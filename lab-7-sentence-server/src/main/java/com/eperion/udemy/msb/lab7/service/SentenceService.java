package com.eperion.udemy.msb.lab7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SentenceService {

    private WordService wordService;


    @Autowired
    public SentenceService(WordService wordService) {

        this.wordService = wordService;

    }

    public String getSentence() {
        return String.format("%s %s %s %s %s", wordService.subject(),
                wordService.verb(),
                wordService.article(),
                wordService.adjective(),
                wordService.noun());
    }

}
