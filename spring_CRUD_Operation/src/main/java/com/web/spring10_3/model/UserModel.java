/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.spring10_3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 *
 * @author developer
 */

@Entity
@Data
public class UserModel {
    
    @Id
    @GeneratedValue
    @javax.persistence.Id
    private int id;
    private String name;
    private double salary;

    
}
