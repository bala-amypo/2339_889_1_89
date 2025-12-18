package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotation.tags.Tag;


import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    StudentService src;
    @PostMapping("/post")
    public StudentEntity postdata(@RequestBody StudentEntity st){
        return src.savedata(st);
    }
    @GetMapping("/get")
    public List<StudentEntity> getdata(){
        return src.retdata();
    }

    @GetMapping("/getid/{id}")
    public StudentEntity getIdVal(int id){
        return src.id(id);
    }
    @PutMapping("/update/{id}")
    public StudentEntity updateId(@PathVariable int id,@RequestBody StudentEntity st){
        return src.updid(id,st);
    }
}
