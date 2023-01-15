package com.vtallen;

public class Main {
    public static void main(String[] args) {
        System.out.println("nSum function:");
        for (int i = 0; i < 10; i++) {
            System.out.println(Series.nSum(i));
        }

        System.out.println("factorial function");
        for (int i = 0; i < 10; i++) {
            System.out.println(Series.factorial(i));
        }

        System.out.println("fibonacci function");
        for (long i = 0; i < 10; i++) {
            System.out.println(Series.fibonacci(i));
        }
    }
}
