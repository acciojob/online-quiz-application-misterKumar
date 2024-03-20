package com.driver;

import java.util.ArrayList;
import java.util.Objects;

public class QuizQuestion {
	 private String question;
	    private ArrayList<String> options;
	    private char correctOption;

	    public QuizQuestion(String question, ArrayList<String> options, char correctOption) {
	        this.question = question;
	        this.options = options;
	        this.correctOption = correctOption;
	    }

	    public String getQuestion() {
	    	// your code goes here
	        return question;
	    }

	    public ArrayList<String> getOptions() {
	    	// your code goes here
	        return options;
	    }

	    public char getCorrectOption() {
	    	// your code goes here
	        return correctOption;
	    }
	    
	    @Override
	    public boolean equals(Object o) {
	       // your code goes here
	    	 QuizQuestion that = (QuizQuestion) o;
	        return correctOption == that.correctOption &&
	                Objects.equals(question, that.question) &&
	                Objects.equals(options, that.options);
	    }

	    @Override
	    public int hashCode() {
	    	// your code goes here
	        return Objects.hash(question, options, correctOption);
	    }
}
