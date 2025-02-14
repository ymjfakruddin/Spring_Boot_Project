package com.quiz.service;


import com.quiz.entities.Question;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
//load balancing need to understand
@FeignClient(name = "QUESTION-SERVICE")
public interface QuestionClient {

    @GetMapping("/question/quiz/{quizId}")
    //pathvariable is used to get the quizId Data from the postman user input
    List<Question> getQuestionOfQuiz(@PathVariable Long quizId);

}
