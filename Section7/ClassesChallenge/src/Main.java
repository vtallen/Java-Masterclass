public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account();

        myAccount.setAccountNumber(1095820);
        myAccount.setAccountBalance(10000);
        myAccount.setCustomerEmail("example@protonmail.com");
        myAccount.setCustomerPhoneNumber("2344039999");

        int amount = 1000;
        System.out.println("Deposit of " + amount + " successful? : " + myAccount.deposit(amount));

        amount = 1000000;
        System.out.println("Withdraw of " + amount + " successful? : " + myAccount.withdraw(amount));


        amount = 100;
        System.out.println("Withdraw of " + amount + " successful? : " + myAccount.withdraw(amount));

        System.out.println("Account Balance: " + myAccount.getAccountBalance());
    }
}