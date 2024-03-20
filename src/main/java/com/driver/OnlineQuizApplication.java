package com.driver;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineQuizApplication {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Quiz quiz = new Quiz();

        ArrayList<String> q1Options = new ArrayList<String>();
        q1Options.add("A) Java");
        q1Options.add("B) C++");
        q1Options.add("C) Python");
        q1Options.add("D) Ruby");
        QuizQuestion q1 = new QuizQuestion("Which programming language is popular for Android development?", q1Options, 'A');
        quiz.addQuestion(q1);

        ArrayList<String> q2Options = new ArrayList<String>();
        q2Options.add("A) CSS");
        q2Options.add("B) HTML");
        q2Options.add("C) JavaScript");
        q2Options.add("D) Python");
        QuizQuestion q2 = new QuizQuestion("Which language is used for web development?", q2Options, 'C');
        quiz.addQuestion(q2);

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Start Quiz");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    int questionNumber = 1;
                    while (true) {
                        try {
                            QuizQuestion question = quiz.getQuestion(questionNumber);
                            System.out.println("\nQuestion " + questionNumber + ": " + question.getQuestion());
                            for (String option : question.getOptions()) {
                                System.out.println(option);
                            }
                            System.out.print("Enter your answer (A/B/C/D): ");
                            char userAnswer = scanner.nextLine().toUpperCase().charAt(0);
                            if (userAnswer == question.getCorrectOption()) {
                                System.out.println("Correct!");
                            } else {
                                System.out.println("Incorrect! The correct answer is: " + question.getCorrectOption());
                            }
                            questionNumber++;
                        } catch (QuestionNotFoundException e) {
                            System.out.println("Quiz Completed!");
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Exiting Online Quiz Application.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
