package com.my.dept.controller;

import com.my.entity.Dept;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/dept")
public class DeptController {
    @RequestMapping("/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        Dept dept=new  Dept(id,"dept","db_table1");
        return dept;
    }
}
