package dev.vta;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public void addCustomer(String customerName) {
        Customer customer = new Customer(customerName);

        for (Customer c : customers) {
            if (c.getName() == customerName) {
                return;
            }
        }

        customers.add(customer);
    }

    public void addTransaction(String customerName, double amount) {

        for (Customer c : customers) {
            if (c.getName() == customerName) {
                c.addTransaction(amount);
                break;
            }
        }
    }

    public void printCustomer(String customerName) {

        for (Customer c : customers) {
            if (c.getName() == customerName) {
                System.out.println("Customer name = " + c.getName());
                double sum = 0;
                for (Double transaction : c.getTransactions()) {
                    sum += transaction;
                }

                System.out.println("---> Balance = " + sum);
            }
        }
    }


}
