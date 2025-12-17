package com.example.demo.newrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.newentity.StudentValidation;

public interface NewRepo extends JpaRepository<NewRepo,Long>{

}