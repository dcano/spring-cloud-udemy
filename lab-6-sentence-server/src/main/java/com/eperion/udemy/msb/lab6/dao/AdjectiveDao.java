package com.eperion.udemy.msb.lab6.dao;

import org.springframework.stereotype.Component;

@Component("adjective")
public class AdjectiveDao extends WordDaoImpl {

    @Override
    String getPartOfSpeech() {
        return ADJECTIVE;
    }
}
