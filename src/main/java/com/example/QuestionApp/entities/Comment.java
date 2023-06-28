/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.QuestionApp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author Hemosoft
 */
@Entity
@Data
@Table(name = "COMMENT")
public class Comment {

    @Id
    Long id;
    Long postId;
    Long userId;

    @Lob
    @Column(columnDefinition = "text")
    String Text;
}
