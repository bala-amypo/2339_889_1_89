package com.example.service.impl;
import java.util.*;
import org.springframework.stereotype.Service;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
@Service
public class NewfileServiceImpl implements StudentService{
    private final StudentRepo rep;
    StudentServiceImpl(){
        this.rep=rep;
    }
    @override
    public StudentValidation savedata(StudentEntity st){
        return rep.save(newfile);
    }
    @override
    public StudentValidation getidval(Long id){
        return rep.findby(id);

    }
    @override
    public List<StudentEntity> getall(){
        return rep.findall();
    }
    @override
    public StudentEntity update(Long id,StudentEntity newfile){
        StudentEntity 
        return rep.updateval(id,st);
    }
    @override
    public void delete(Long id){
        return rep.deleteid(id);

    }
}