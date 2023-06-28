/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.QuestionApp.repository;

import com.example.QuestionApp.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Hemosoft
 */
public interface PostRepository extends JpaRepository<Post, Long> {

}
