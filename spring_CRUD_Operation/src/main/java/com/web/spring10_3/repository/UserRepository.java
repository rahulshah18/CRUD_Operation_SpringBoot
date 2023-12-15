/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.spring10_3.repository;

import com.web.spring10_3.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author developer
 */
@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer>{
    
}
