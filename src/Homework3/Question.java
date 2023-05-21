package Homework3;

import java.util.Scanner;

public class Question {
    Scanner console = new Scanner(System.in);
    private final String text;

    public Question(String textOfQuestion) {
        this.text = textOfQuestion;
    }

    public String getQuestion() {
        return this.text;
    }

}