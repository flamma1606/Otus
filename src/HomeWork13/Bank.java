package HomeWork13;

import java.util.*;

public class Bank {

    public static void main(String[] args) {

        Map<Customer,List<Account>> storage = new HashMap<>();
        Map<Customer,List<Integer>> storage2 = new HashMap<>();

        Customer customer1 = new Customer(1,"Петр","Петров","Петрович");
        Customer customer2 = new Customer(2,"Иван","Иванов","Иванович");
        Customer customer3 = new Customer(3,"Василий","Васильев","Васильевич");

        Account account1 = new Account(142301810, 0.00d);
        Account account2 = new Account(242301810, 125000.10d);
        Account account3 = new Account(342301810, 8900500.50d);
        Account account4 = new Account(442301810, 500.00d);
        Account account5 = new Account(542301810, 10.30d);

        storage.put(customer1,List.of(account1, account2));
        storage.put(customer2,List.of(account3));
        storage.put(customer3,List.of(account4,account5));

        storage2.put(customer1,List.of(account1.accountNumber, account2.accountNumber));
        storage2.put(customer2,List.of(account3.accountNumber));
        storage2.put(customer3,List.of(account4.accountNumber,account5.accountNumber));

        storage.get(customer3).forEach(it -> System.out.println("Счет клиента: " + it.accountNumber));

        for (Map.Entry<Customer,List<Integer>> map: storage2.entrySet()) {
            if (map.getValue().contains(442301810)){
                System.out.println("ФИО владельца счета: " + map.getKey());
            }
        }
    }
}




