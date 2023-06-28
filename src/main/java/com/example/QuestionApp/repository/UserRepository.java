/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.QuestionApp.repository;

import com.example.QuestionApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Hemosoft
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
