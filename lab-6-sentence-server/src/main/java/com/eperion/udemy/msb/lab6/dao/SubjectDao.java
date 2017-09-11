package com.eperion.udemy.msb.lab6.dao;

import org.springframework.stereotype.Component;

@Component("subject")
public class SubjectDao extends WordDaoImpl {

    @Override
    String getPartOfSpeech() {
        return SUBJECT;
    }
}
