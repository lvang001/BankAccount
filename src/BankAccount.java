public class BankAccount {
    private double balance;
    private String name;

        BankAccount(double balance, String name) {
            this.balance = balance;
            this.name = name;
        }
        

    /**
     * @return double return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public void Deposit(double amount) {
        balance = amount + balance;
    }

    public void Withdraw(double amount) {
        balance = balance - amount;
    }

    public void Account () {
        System.out.println("Name is " + getName());
        System.out.println("current balance is " + getBalance());

    }

}
