package com.eperion.udemy.msb.lab6.dao;

import com.eperion.udemy.msb.lab6.domain.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.client.RestTemplate;

public abstract class WordDaoImpl implements WordDao {

    @Autowired
    LoadBalancerClient loadBalancer;

    abstract String getPartOfSpeech();

    @Override
    public Word getWord() {
        ServiceInstance instance = loadBalancer.choose(getPartOfSpeech());
        String word = (new RestTemplate()).getForObject(instance.getUri(),String.class);
        return new Word(word);
    }
}
