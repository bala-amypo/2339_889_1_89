package com.example.demo.newservice;

import com.example.demo.newentity.StudentValidation;

public interface NewfileService{
    StudentValidation savedata(StudentValidation newfile);
    StudentValidation getidval(Long id);
    List<StudentValidation>getall();
    StudentValidation update(Long id,StudentValidation newfile);
    void<StudentEntity> delete(Long id);

}