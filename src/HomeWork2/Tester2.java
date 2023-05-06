package HomeWork2;

import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;

public class Tester2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Давай узнаем, что ты знаешь о пиве?");

        String[] questions = new String[]{"В какой стране больше всего любят пиво?", // index 0
                "А сколько алкоголя в самом крепком пиве? Введи число варианта ответа", // index 1
                "Из какого бокала лучше всего пить ароматное и крепкое пиво? Введи число варианта ответа"}; // index 2

        String[][] answers = { // инициализируем массив вариантов ответа
                new String[]{"Россия", "Германия", "Чехия"}, // index [0][0], [0][1], [0][2]
                new String[]{"37.5% спирта", "44% спирта", "67,5% спирта"}, // index [1][0], [1][1], [1][2]
                new String[]{"Бокал", "Пинта", "Граненый стакан", "Снифтер"}, // index [2][0], [2][1], [2][2], [2][3]
        };

        int[] responses = new int[3]; // декларируем массив для хранения трёх ответов
        int result = 1;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]); // вывод i-го вопроса
            int count = 1; // создание счетчика для вывода варианта ответа
            for (int j = 0; j < answers[i].length; j++) { // вывод всех ответов для i-го вопроса
                System.out.println(count + ": " + answers[i][j] + " "); // вывод вариантов ответов для i-го вопроса
                count++;
            }
            System.out.println("Введите число");
            responses[i] = console.nextInt(); // записываем в массив вариант ответа (число) пользователя по каждому i-му вопросу
            if (responses[i] > answers[i].length) {
                System.out.println("Нет такого варианта ответа, начинай сначала");
                break;
            }

        }
        int sumOfResult = 0; // инициализируем сумму ответов для проверки
        for (int i = 0; i < responses.length; i++) {
            sumOfResult += responses[i]; // сумма ответов
        }
        System.out.println(sumOfResult);
        if (sumOfResult == 10) { // сравниваем сумму ответов с заданной
            System.out.println("Вы-таки знаток пива!");
        } else {
            System.out.println("Попробуй ещё раз, где-то ты промазал!");
        }
    }
}




