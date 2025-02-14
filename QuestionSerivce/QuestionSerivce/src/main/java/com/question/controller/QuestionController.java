package com.question.controller;


import com.question.entity.Question;
import com.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired

    private QuestionService questionService;
    //create question
    @PostMapping
    public Question create(@RequestBody Question question)
    {
        return questionService.Create(question);
    }
    @GetMapping
    public List<Question> getAll()
    {
        return questionService.get();
    }
    @GetMapping("/questionId/{questionid}")
    public Question getAll(@PathVariable Long questionid)
    {
        return questionService.getone(questionid);
    }
    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionOfQuiz(@PathVariable Long quizId)
    {
        return  questionService.getQusetionOfQuiz(quizId);
    }

}
