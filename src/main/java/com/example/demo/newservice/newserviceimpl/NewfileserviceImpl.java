package com.example.service.impl;
import java.util.*;
import org.springframework.stereotype.Service;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.NewfileService;
@Service
public class NewfileServiceImpl implements NewfileService{
    private final StudentRepo rep;
    NewfileServiceImpl(){
        this.rep=rep;
    }
    @override
    public StudentValidation savedata(st StudentValidation){
        return rep.save(newfile);
    }
    @override
    public StudentValidation getidval(Long id){
        return rep.findby(id);

    }
    @override
    public List<StudentValidation> getall(){
        return rep.findall();
    }
    @override
    public StudentValidation update(Long id,StudentValidation newfile){
        StudentValidation existing=getValid(id);
        existing.setName(Newfile,getName)
        existing.setEmail(Newfile,getEmail)
        return rep.save(existing);
    }
    @override
    public void delete(Long id){
        return rep.deleteyId(id);
    }
}