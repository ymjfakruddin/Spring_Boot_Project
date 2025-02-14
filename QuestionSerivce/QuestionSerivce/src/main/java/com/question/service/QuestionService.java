package com.question.service;

import com.question.entity.Question;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface QuestionService {
    //create  update add
    Question Create(Question question);

    List<Question> get();
    Question getone(Long id);
    List<Question> getQusetionOfQuiz(Long quizId);
}
