package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.Vendor;

public interface VendorService {
    Student insertStudent(Student st);
    List<Student> getAllStudents();
    Optional<Student> getOneStudent(Long id);
    void deleteStudent(Long id);
}   