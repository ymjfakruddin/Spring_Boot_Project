package com.quiz.ServiceImpl;

import com.quiz.entities.Quiz;
import com.quiz.repositories.QuizRepositories;
import com.quiz.service.QuestionClient;
import com.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizServiceImpl implements QuizService {
    /**
     * @param quiz
     * @return
     */
    @Autowired
    private QuizRepositories quizRepositories;
    @Autowired
    private QuestionClient questionClient;
   /* public QuizServiceImpl(QuizRepositories quizRepositories)
    {
        this.quizRepositories = quizRepositories;
    }*/


    @Override
    /*public Quiz add(Quiz quiz) {
        return quizRepositories.save(quiz);
    }*/
    public Quiz add(Quiz quiz)
    {
        try{
            return quizRepositories.save(quiz);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw new RuntimeException("Error saving Quiz",e);
        }
    }

    @Override
    public List<Quiz> get() {
        List<Quiz>quizzes =  quizRepositories.findAll();
   List<Quiz> newQuizList  =   quizzes.stream().map(quiz -> {
          quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
          return quiz;
        }).collect(Collectors.toList());

   return newQuizList;
    }

    @Override
    public Quiz get(Long id) {
        Quiz quiz =quizRepositories.findById(id).orElseThrow(() ->new RuntimeException("Quiz not found"));
   quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
   return quiz;
    }

    /**public Quiz getQuestion(Long quizId)
    {
        if(quizId == 1)
        {
            return
        }
    }**/
}
