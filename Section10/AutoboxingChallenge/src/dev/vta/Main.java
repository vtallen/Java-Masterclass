package dev.vta;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Bank bank = new Bank("AMEX");

        bank.addCustomer("Bobby");

        bank.addTransaction("Bobby", -100);
        bank.addTransaction("Bobby", 1000);

        bank.printCustomer("Bobby");
    }
}