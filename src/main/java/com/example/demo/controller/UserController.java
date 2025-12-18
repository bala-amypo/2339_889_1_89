package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api/users")
@Tag(name = "Users Endpoints")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user){
        return (st);
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
