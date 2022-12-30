public class Account {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    //Setters
    public void setAccountNumber(int accountNumber) {
        if (accountNumber > 1) {
            this.accountNumber = accountNumber;
        } else {
            this.accountNumber = -1;
        }
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }



    //Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public boolean deposit(double amount) {
        if (amount > 0.0) {
            accountBalance += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (accountBalance >= amount) {
            accountBalance -= amount;
            return true;
        } else {
            return false;
        }
    }

}
