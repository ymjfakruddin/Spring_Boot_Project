package com.question.serviceImpl;

import com.question.entity.Question;
import com.question.repository.QuestionRepository;
import com.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl  implements QuestionService {
    @Autowired
 private QuestionRepository questionRepository;
    /**
     * @param question
     * @return
     */
    @Override
    public Question Create(Question question) {
        //question.

        return questionRepository.save(question);
    }

    /**
     * @return
     */
    @Override
    public List<Question> get() {
        return questionRepository.findAll();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Question getone(Long id) {
        return questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));
    }
    public List<Question> getQusetionOfQuiz(Long quizId)
    {
     return   questionRepository.findByQuizId(quizId);
    }
}
