/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.QuestionApp.entities;

/**
 *
 * @author Hemosoft
 */
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "`LIKE`")

@Entity
public class Like {

    @Id
    Long id;

    Long userId;
    Long postId;

}
