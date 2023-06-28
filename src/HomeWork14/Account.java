package HomeWork14;

import java.io.*;


public class Account {
    String number;
    int balance;

    public Account() throws FileNotFoundException {
    }

    public int debit(int number, int userAmount) throws AssetsException {
        if (userAmount > balance) throw new AssetsException("Недостаточно средств на счете. ", balance);
        return this.balance - userAmount;
    }

    public int credit(int number, int amount) {
        return balance + amount;
    }
}

