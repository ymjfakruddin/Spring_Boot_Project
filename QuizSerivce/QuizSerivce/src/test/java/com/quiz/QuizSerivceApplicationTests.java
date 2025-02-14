package com.quiz;

import com.quiz.entities.Quiz;
import com.quiz.repositories.QuizRepositories;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class QuizSerivceApplicationTests {

	@Autowired
	private QuizRepositories quizRepositories;
	@Test

	public void testSaveQuiz() {
		// Create a new Quiz object
		Quiz quiz = new Quiz();
		quiz.setTitle("Test Quiz");

		// Save the Quiz object to the database
		Quiz savedQuiz = quizRepositories.save(quiz);

		// Assert that the savedQuiz has a non-null ID
		Assertions.assertNotNull(savedQuiz.getId(), "Quiz ID should not be null");
	}

}
