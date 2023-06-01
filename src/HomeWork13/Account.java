package HomeWork13;

import java.util.Objects;

public class Account {
    final int accountNumber;
    double balance;

    public Account (int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, balance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return
                Objects.equals(accountNumber, account.accountNumber) &&
                Objects.equals(balance, account.balance);
    }
}