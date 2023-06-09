package HomeWork13;

import java.util.*;

public class Bank {

    public static void main(String[] args) {

        // 1st part
        Map<Customer, List<Account>> storage = new HashMap<>();

        Customer customer1 = new Customer(1, "Петр", "Петров", "Петрович");
        Customer customer2 = new Customer(2, "Иван", "Иванов", "Иванович");
        Customer customer3 = new Customer(3, "Василий", "Васильев", "Васильевич");

        Account account1 = new Account(142301810, 0.00d);
        Account account2 = new Account(242301810, 125000.10d);
        Account account3 = new Account(342301810, 8900500.50d);
        Account account4 = new Account(442301810, 500.00d);
        Account account5 = new Account(542301810, 10.30d);

        storage.put(customer1, List.of(account1, account2));
        storage.put(customer2, List.of(account3));
        storage.put(customer3, List.of(account4, account5));

        storage.get(customer3).forEach(it -> System.out.println("Счет клиента: " + it.accountNumber));

        // 2nd part

        Map<Integer, Customer> storage2 = new HashMap<>();

        storage2.put(account1.accountNumber, customer1);
        storage2.put(account2.accountNumber, customer1);
        storage2.put(account3.accountNumber, customer2);
        storage2.put(account4.accountNumber, customer3);
        storage2.put(account5.accountNumber, customer3);

        System.out.println("ФИО владельца счета: " + findCustomer(storage2, 342301810));
    }

    private static <K, V> List<V> findCustomer(Map<K, V> map, Object key) {

        List<V> valueList = new ArrayList<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey().equals(key)) {
                valueList.add(entry.getValue());
            }
        }
        return valueList;
    }
}





