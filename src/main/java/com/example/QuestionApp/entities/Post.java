/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.QuestionApp.entities;

/**
 *
 * @author Hemosoft
 */
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "POST")

@Entity
public class Post {

    @Id
    Long id;
    Long userId;

    String title;

    @Lob
    @Column(columnDefinition = "text")
    String text;
}
