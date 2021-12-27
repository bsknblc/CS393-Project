package com.Ozyegin.CS393.Controller;

import com.Ozyegin.CS393.DTO.MyUserDTO;
import com.Ozyegin.CS393.Model.MyUser;
import com.Ozyegin.CS393.Service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class MyUserController {
    @Autowired
    MyUserService myUserService;

    @GetMapping
    public List<MyUserDTO> findAll(){ return myUserService.findAll(); }

    @GetMapping("/{myUser-id}")
    public MyUserDTO getUserById(@PathVariable("myUser-id") int id) {return myUserService.findById(id); }

    @DeleteMapping("/{myUser-id}")
    public void deleteById(@PathVariable("myUser-id") int id){ myUserService.deleteById(id); }

    @PostMapping
    public MyUser save(@RequestBody MyUser myUser){
        return myUserService.save(myUser);
    }
}
