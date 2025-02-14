package com.quiz.controller;

import com.quiz.ServiceImpl.QuizServiceImpl;
import com.quiz.entities.Quiz;
import com.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired       // dependency injection ,constructor injection
    private QuizService quizService;


    //Quiz add,findAll,findById

    @PostMapping







    public ResponseEntity<Quiz> create(@RequestBody Quiz quiz)
    {
        try {
            //  log.info("Received entity: {}", quiz);
            System.out.println("Received entity: " + quiz); // Log the input

            Quiz saved = quizService.add(quiz);
            return ResponseEntity.status(HttpStatus.CREATED).body(saved);
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
        }
   /* public Quiz create(@RequestBody Quiz quiz)
    {
        return quizService.add(quiz);
    }*/
    @GetMapping
    public List<Quiz> get()
    {
        return quizService.get();
    }
    @GetMapping("{id}")
    public Quiz getOne(@PathVariable Long id)
    {
        return quizService.get(id);
    }


}
