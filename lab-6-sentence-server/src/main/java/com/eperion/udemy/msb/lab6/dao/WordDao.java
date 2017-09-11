package com.eperion.udemy.msb.lab6.dao;

import com.eperion.udemy.msb.lab6.domain.Word;

public interface WordDao {

    String SUBJECT = "SUBJECT";
    String VERB = "VERB";
    String ARTICLE = "ARTICLE";
    String ADJECTIVE = "ADJECTIVE";
    String NOUN = "NOUN";

    Word getWord();

}
