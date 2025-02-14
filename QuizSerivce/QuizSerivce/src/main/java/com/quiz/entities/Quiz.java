package com.quiz.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity


public class Quiz {


    @Id //the annotation says primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AUTOINCREMENT  identity is used to correct increment not contains random numbers
    private Long id;
    private String title;
  transient   private List<Question>  questions;//should not save in the databases

    public Quiz(Long id, List<Question> questions, String title) {
        this.id = id;
        this.questions = questions;
        this.title = title;
    }

    public Quiz() {

    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
