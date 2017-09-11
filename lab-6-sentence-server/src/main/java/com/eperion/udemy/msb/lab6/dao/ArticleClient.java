package com.eperion.udemy.msb.lab6.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("ARTICLE")
public interface ArticleClient {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    String getWord();
}
