package Homework3;

import java.util.Scanner;


public class TesterWithClasses {

    public static void main(String[] args) {

        System.out.println("Давай узнаем, что ты знаешь о пиве?");
        Scanner console = new Scanner(System.in);

        Question[] questions = new Question[]{
                new Question("В какой стране больше всего любят пиво?"),// index 0
                new Question("А сколько алкоголя в самом крепком пиве? Введи число варианта ответа"), // index 1
                new Question("Из какого бокала лучше всего пить ароматное и крепкое пиво? Введи число варианта ответа")
        };

        Answer[][] answers = { // Массив вариантов ответа
                {new Answer("Россия", false),
                        new Answer("Германия", false),
                        new Answer("Чехия", true)},
                {new Answer("37.5% спирта", false),
                        new Answer("44% спирта", false),
                        new Answer("67,5% спирта", true)},
                {new Answer("Бокал", false),
                        new Answer("Пинта", false),
                        new Answer("Граненый стакан", false),
                        new Answer("Снифтер", true)},
        };
        int result = 0;
        for (int i = 0; i < questions.length; i++) {
            String textOfQuestion = questions[i].getQuestion();
            System.out.println("Вопрос №" + (i+1) + ". " + textOfQuestion);
            for (int j = 0; j < answers[i].length; j++) { // вывод всех ответов для i-го вопроса
                int count = j + 1;
                String textOfAnswer = answers[i][j].getAnswer();
                System.out.println("Вариант " + count + ": " + textOfAnswer);
            }
            System.out.println("Введите вариант ответа");
            int userAnswer = console.nextInt() - 1;
            boolean isCorrect = answers[i][userAnswer].checkCorrectAnswer();
            //           System.out.println(isCorreсt);

            if (isCorrect) {
                result++;
            }
        }
        //      System.out.println(result);
        if (result == 3) { // сравниваем сумму ответов с заданной
            System.out.println("Вы-таки знаток пива!");
        } else {
            System.out.println("Попробуй ещё раз, где-то ты промазал!");
        }

        }
    }


