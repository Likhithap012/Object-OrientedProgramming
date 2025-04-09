package com.gevernova.objectrelationshipsandcommunication.bankandaccountholders;

// Customer class
class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance: ₹" + balance);
    }
}
