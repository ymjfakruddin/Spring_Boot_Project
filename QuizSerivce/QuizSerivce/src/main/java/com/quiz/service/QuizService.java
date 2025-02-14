package com.quiz.service;

import com.quiz.entities.Quiz;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface QuizService {
    //currently i assumed this one belongs to the abstract public methods;
    //adding
    Quiz add(Quiz quiz);

    List<Quiz> get();

    Quiz get(Long id);


}
