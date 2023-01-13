package dev.vta;

public class Main {
    public static void main(String[] args) {
        ITelephone myPhone = new DeskPhone(1920394444);

        myPhone.callPhone(1910220000);
    }
}
