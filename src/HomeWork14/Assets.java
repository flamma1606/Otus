package HomeWork14;

import javax.swing.text.html.parser.Parser;
import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Assets {

    public static void main(String[] args) throws AssetsException {

        String line = null;
        try (BufferedReader br = new BufferedReader(new FileReader("text.txt"))) {
            while ((line = br.readLine()) != null) {
                System.out.println("Номер счёта из файла: => " + line);
            }
        } catch (IOException e) {
            System.out.println("IOException исключение: файл не найден => " + e.getMessage());
        }

        Account account = null;
        try {
            account = new Account();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        account.balance = 1_000;
        account.number = line;

        int totalBalance;

        int userNumber;


        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите номер счета");
            userNumber = sc.nextInt();
        } catch (Exception e) {
            throw new RuntimeException("Невалидный номер счета.", e);
        }

        System.out.println("Вы хотите пополнить (1) или списать деньги (2)?");
        Scanner sc2 = new Scanner(System.in);
        int answer = Integer.parseInt(sc2.nextLine());
        if (answer != 1 && answer != 2) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Значение не равно ни 1, ни 2");
                System.exit(53);
            }
        }
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Ваш баланс: " + account.balance + ". Введите сумму");
        Integer amountOfTransaction = Integer.valueOf(sc3.nextLine());


        if (answer == 2) {
            try {
                int result = account.debit(userNumber, amountOfTransaction);
                System.out.println("Списано успешно. Ваш баланс: " + result);
            } catch (AssetsException ae) {
                System.out.println(ae.getMessage());
                System.out.println(ae.getNumber());
                throw ae;
            }
        } else {
            totalBalance = account.credit(12345, amountOfTransaction);
            System.out.print("Зачислено успешно. Ваш баланс: " + totalBalance);
        }

    }
}