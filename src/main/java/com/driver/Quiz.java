package com.driver;

import java.util.ArrayList;

public class Quiz {
	public ArrayList<QuizQuestion> questions;

    public Quiz() {
        // your code goes here;
    }

    public void addQuestion(QuizQuestion question) {
        // your code goes here
    }

    public QuizQuestion getQuestion(int questionNumber) throws QuestionNotFoundException {
       // your code goes here
        return questions.get(questionNumber - 1);
    }
}
