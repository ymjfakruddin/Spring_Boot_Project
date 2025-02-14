package com.question.repository;

import com.question.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository  extends JpaRepository<Question,Long> {


    List<Question> findByQuizId(Long quizId);
}
