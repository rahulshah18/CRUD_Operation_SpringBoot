/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.spring10_3.service;

import com.web.spring10_3.model.UserModel;
import com.web.spring10_3.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author developer
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public UserModel save() {
        UserModel userModel = new UserModel();
        userModel.setName("Rahul");
        userModel.setSalary(150000);
        userRepository.save(userModel);
        return userModel;
    }
    public UserModel add(String name, double salary )
    {
        UserModel userModel = new UserModel();
        userModel.setName(name);
        userModel.setSalary(salary);
        return userRepository.save(userModel);
    }
    public UserModel update(int id, double salary) {
        Optional<UserModel> op = userRepository.findById(id);
        if(op.isPresent())
        {
            UserModel get = op.get();
            get.setSalary(salary);
            userRepository.save(get);
            return get;
        }
        return null;
    }
    public void delete(int id) {
        userRepository.deleteAll();
    }
    public void deletById(int id) {
        userRepository.deleteById(id);
    }
    public UserModel find(int id) {
        Optional<UserModel> op = userRepository.findById(id);
        if(op.isPresent())
        {
            return op.get();
        }
        return null;
    }
    public List<UserModel> findall() {
        List<UserModel> all = userRepository.findAll();
        return all;
    }
}
