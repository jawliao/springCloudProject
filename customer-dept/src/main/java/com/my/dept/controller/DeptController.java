package com.my.dept.controller;

import com.my.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DeptController {
    private static final String REST_URL_PREFIX="http://127.0.0.1:8001";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getDept/{id}")
    public Dept getDept(@PathVariable("id") Long id){

        return restTemplate.postForEntity(REST_URL_PREFIX+"/dept/get/"+id,null,Dept.class).getBody();
    }
}
