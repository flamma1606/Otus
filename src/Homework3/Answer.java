package Homework3;

import java.util.Base64;
import java.util.Scanner;
import java.util.ArrayList;

public class Answer {
    private final String textOfAnswer;
    private final boolean isCorrectAnswer;

    private int userAnswer;

    public Answer(String textOfAnswer, boolean isCorrectAnswer) {
        this.isCorrectAnswer = isCorrectAnswer;
        this.textOfAnswer = textOfAnswer;
    }

    public void printAnswer(int numberOfAnswer) {
        System.out.println("Вариант " + numberOfAnswer + ": " + textOfAnswer);
    }

    public boolean checkCorrectAnswer() {
        return isCorrectAnswer;
    }
}


