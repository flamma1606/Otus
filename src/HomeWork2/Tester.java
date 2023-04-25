package HomeWork2;

import java.util.Base64;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Давай узнаем, что ты знаешь о пиве?");
        String[] questions= new String[3];
        questions[0] = "Первый вопрос: В какой стране больше всего любят пиво?";
        questions[1] = "Второй вопрос: А сколько алкоголя в самом крепком пиве? Введи число варианта ответа";
        questions[2] = "Третий вопрос: Из какого бокала лучше всего пить ароматное и крепкое пиво? Введи число варианта ответа";

        String[][] answers = new String[3][4];
        answers[0][0] = "1 - Россия";
        answers[0][1] = "2 - Германия";
        answers[0][2] = "3 - Чехия";
        answers[0][3] = "4 - Польша";
        answers[1][0] = "1 - 37.5% спирта";
        answers[1][1] = "2 - 44% спирта";
        answers[1][2] = "3 - 67,5% спирта";
        answers[1][3] = "4 - 58% спирта";
        answers[2][0] = "1 - Бокал";
        answers[2][1] = "2 - Пинта";
        answers[2][2] = "3 - Граненый стакан";
        answers[2][3] = "4 - Снифтер";

        int response0;
        int response1;
        int response2;
        int result = 1;

        for(int i = 0;i<questions.length;i++) {
            System.out.println(questions[i]);
            if (questions[i] == questions[0]){
            System.out.println(answers[0][0]);
            System.out.println(answers[0][1]);
            System.out.println(answers[0][2]);
            System.out.println(answers[0][3]);
            do{
                System.out.println("Введите число");
                response0 = console.nextInt();
            } while (response0 > 4);
            if(response0==3) {
                int result1 = result;
            }
            else {
                int result1 = 0;
            }
            }
            else if (questions[i] == questions[1] ){
                System.out.println(answers[1][0]);
                System.out.println(answers[1][1]);
                System.out.println(answers[1][2]);
                System.out.println(answers[1][3]);
                do{
                    System.out.println("Введите число");
                    response1 = console.nextInt();
                } while (response1 > 4);
                if(response1==3) {
                    int result2 = result;
                }
                else {
                    result = 0;
                }
            }
            else if (questions[i] == questions[2] ){
                System.out.println(answers[2][0]);
                System.out.println(answers[2][1]);
                System.out.println(answers[2][2]);
                System.out.println(answers[2][3]);
                do{
                    System.out.println("Введите число");
                    response2 = console.nextInt();
                } while (response2 > 4);
                if(response2==4) {
                    int result3 = result;
                }
                else {
                    result = 0;
                }
            }
            }
        if(result==1) {
            System.out.println("Вы-таки знаток пива!");
        }
         else {
             System.out.println("Попробуй ещё раз, где-то ты промазал!");
        }
    }
}
