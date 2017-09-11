package com.eperion.udemy.msb.lab6.dao;

import org.springframework.stereotype.Component;

@Component("noun")
public class NounDao extends WordDaoImpl {

    @Override
    String getPartOfSpeech() {
        return NOUN;
    }

}
