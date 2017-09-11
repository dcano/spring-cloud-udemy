package com.eperion.udemy.msb.lab6.dao;

import org.springframework.stereotype.Component;

@Component("article")
public class ArticleDao extends WordDaoImpl {

    @Override
    String getPartOfSpeech() {
        return ARTICLE;
    }
}
