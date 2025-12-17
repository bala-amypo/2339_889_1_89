package com.example.service.impl;
import java.util.*;
import org.springframework.stereotype.Service;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.NewfileService;
@Service
public class NewfileserviceImpl implements NewfileService{
    private final StudentRepo rep;
    NewfileserviceImpl(){
        this.rep=rep;
    }
    @Override
    public StudentValidation savedata(StudentValidation newfile){
        return rep.save(newfile);
    }
    @Override
    public StudentValidation getidval(Long id){
        return rep.findby(id);

    }
    @Override
    public List<StudentValidation> getall(){
        return rep.findall();
    }
    @Override
    public StudentValidation update(Long id,StudentValidation newfile){
        StudentValidation existing=getidval(id);
        existing.setName(newfile.getName());
        existing.setEmail(newfile.getEmail());
        return rep.save(existing);
    }
    @Override
    public void delete(Long id){
        return rep.deleteId(id);
    }
}