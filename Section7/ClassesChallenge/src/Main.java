public class Main {
    public static void main(String[] args) {
//        Account bobsAccount = new Account("1234", 1000.00, "Bob Brown", "myemail@bob.com", "919-123-2345");
        Account bobsAccount = new Account();

//        bobsAccount.setAccountBalance(10000);
//        bobsAccount.setCustomerEmail("example@protonmail.com");
//        bobsAccount.setCustomerPhoneNumber("2344039999");

        int amount = 1000;
        System.out.println("Deposit of " + amount + " successful? : " + bobsAccount.deposit(amount));

        amount = 1000000;
        System.out.println("Withdraw of " + amount + " successful? : " + bobsAccount.withdraw(amount));


        amount = 100;
        System.out.println("Withdraw of " + amount + " successful? : " + bobsAccount.withdraw(amount));

        System.out.println("Account Balance: " + bobsAccount.getAccountBalance());


        Account timsAccount = new Account("Tim", "tim@email.com", "1234");
    }
}