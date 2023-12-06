package mindera.bootcamp.exercises.Exercise_The_Bank;

public abstract class Account {

    private static int accountCounter;

    private int accountNumber;

    private AccountType accountType;

    private int balance;



    public Account (Bank bank, AccountType accountType){
        accountCounter++;
        this.accountType = accountType;

        this.accountNumber = accountCounter;
    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public abstract int decreaseBalance(int amountToWithdraw);

    public int increaseBalance(int amountToDeposit){
        return balance = balance + amountToDeposit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountCounter(){
        return accountCounter;
    }

}
