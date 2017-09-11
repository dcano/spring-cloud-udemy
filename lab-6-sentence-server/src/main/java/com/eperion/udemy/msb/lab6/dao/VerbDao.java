package com.eperion.udemy.msb.lab6.dao;

import org.springframework.stereotype.Component;

@Component("verb")
public class VerbDao extends WordDaoImpl {

    @Override
    String getPartOfSpeech() {
        return VERB;
    }
}
