package Homework3;

import java.util.Base64;
import java.util.Scanner;
import java.util.ArrayList;

public class Question {
    Scanner console = new Scanner(System.in);
    private final String textOfQuestion;

    public Question(String textOfQuestion) {
        this.textOfQuestion = textOfQuestion;
    }

    public void printQuestion(int numberOfQuestion) {
        System.out.println("Вопрос №" + numberOfQuestion + ". " + textOfQuestion);

    }

    public int getAnswer() { // Получить ответ на вопрос
        System.out.println("Введите вариант ответа");
        return console.nextInt() - 1;
    }

}

