package com.xycode.janebook.controller;

import com.xycode.janebook.model.TUser;
import com.xycode.janebook.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/view/{username}")
    public TUser getUserByUserName(@PathVariable String username){
        return userService.getUserByUserName(username);
    }

    @DeleteMapping("/del/{username}")
    public String delUser(@PathVariable String username){
        return userService.delUser(username);
    }

    @PostMapping("/add")
    public String addUser(@RequestBody TUser tUser){
        return userService.addUser(tUser);
    }

    @PutMapping("/update")
    public String updateUser(@RequestBody TUser tUser) {
            return userService.updateUser(tUser);
    }

}
