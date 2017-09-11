package com.eperion.udemy.msb.lab6.service;

import com.eperion.udemy.msb.lab6.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SentenceService {

    /*private WordDao nounDao;
    private WordDao adjectiveDao;
    private WordDao verbDao;
    private WordDao articleDao;
    private WordDao subjectDao;
    */
    private NounClient nounClient;
    private VerbClient verbClient;
    private AdjectiveClient adjectiveClient;
    private ArticleClient articleClient;
    private SubjectClient subjectClient;

    @Autowired
    public SentenceService(/*@Qualifier("noun") WordDao nounDao*/
                           NounClient nounClient,
                           VerbClient verbClient,
                           AdjectiveClient adjectiveClient,
                           SubjectClient subjectClient,
                           ArticleClient articleClient) {

        //this.nounDao = nounDao;
        this.nounClient = nounClient;
        this.verbClient = verbClient;
        this.adjectiveClient = adjectiveClient;
        this.subjectClient = subjectClient;
        this.articleClient = articleClient;

    }

    public String getSentence() {
        return String.format("%s %s %s %s %s", subjectClient.getWord(),
                verbClient.getWord(),
                articleClient.getWord(),
                adjectiveClient.getWord(),
                nounClient.getWord());
    }

}
