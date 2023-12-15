/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.spring10_3.controller;

import com.web.spring10_3.model.UserModel;
import com.web.spring10_3.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author developer
 */
@CrossOrigin(origins = {"http://localhost:8383"})
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
            private UserService userService;
    
    @RequestMapping("save")
    public UserModel save()
    {
        return userService.save();
    }
     @RequestMapping("add")
    public UserModel add(@RequestParam String name, @RequestParam double salary )
    {
        return userService.add(name, salary);
    }
    @RequestMapping("update")
    public UserModel update(@RequestParam int id, @RequestParam double salary)
    {
        return userService.update(id, salary);
    }
    @RequestMapping("deleteall")
    public void delete(@RequestParam int id)
    {
        userService.delete(id);
    }
    @RequestMapping("deletebyid")
    public void deleteById(@RequestParam int id)
    {
        userService.deletById(id);
    }
    @RequestMapping("find")
    public UserModel find(@RequestParam int id)
    {
        return userService.find(id);
    }
    @RequestMapping("findall")
    public List<UserModel> findall()
    {
        return userService.findall();
    }
}
