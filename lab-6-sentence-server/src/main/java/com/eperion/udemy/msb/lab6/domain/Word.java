package com.eperion.udemy.msb.lab6.domain;

public class Word {

    public String word;

    public Word() {
        super();
    }

    public Word(String word) {
        this();
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public String getString() {
        return getWord();
    }

    public void setWord(String word) {
        this.word = word;
    }

}
