package HomeWork13;

import java.util.Objects;

public class Customer {
     String firstName;
     String lastName;
     String middleName;
    int pin;

    public Customer (int pin, String firstName, String lastName, String middleName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.pin = pin;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pin, firstName, lastName, middleName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return
                Objects.equals(pin, customer.pin) &&
                        Objects.equals(firstName, customer.firstName) &&
                        Objects.equals(lastName, customer.lastName) &&
                        Objects.equals(middleName, customer.middleName);
    }
    @Override
    public String toString() {
        return lastName + " " + firstName + " " + middleName;
    }
}