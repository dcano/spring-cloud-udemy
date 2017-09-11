package com.eperion.udemy.msb.lab7.service;

import com.eperion.udemy.msb.lab7.dao.*;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WordService {

    private NounClient nounClient;
    private VerbClient verbClient;
    private AdjectiveClient adjectiveClient;
    private ArticleClient articleClient;
    private SubjectClient subjectClient;

    @Autowired
    public WordService(NounClient nounClient,
                           VerbClient verbClient,
                           AdjectiveClient adjectiveClient,
                           SubjectClient subjectClient,
                           ArticleClient articleClient) {

        this.nounClient = nounClient;
        this.verbClient = verbClient;
        this.adjectiveClient = adjectiveClient;
        this.subjectClient = subjectClient;
        this.articleClient = articleClient;

    }

    String noun() {
        return nounClient.getWord();
    }

    String subject() {
        return subjectClient.getWord();
    }

    String verb() {
        return this.verbClient.getWord();
    }

    String article() {
        return this.articleClient.getWord();
    }

    @HystrixCommand(fallbackMethod = "defaultAdjective")
    String adjective() {
        return this.adjectiveClient.getWord();
    }

    private String defaultAdjective() {
        return "<>";
    }



}
