package com.eperion.udemy.msb.lab7.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("NOUN")
public interface NounClient {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    String getWord();
}
