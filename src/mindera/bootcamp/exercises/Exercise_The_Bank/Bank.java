package mindera.bootcamp.exercises.Exercise_The_Bank;

public class Bank {


    private String name;

    private Account[] accounts;



    public Bank(String name){
        this.name = name;
        this.accounts = new Account[10];
    }

    public String getName() {
        return name;
    }

    public Account getClientAccount(int clientAccountNumber){
        for (int i = 0; i < accounts.length; i++){
            if(accounts[i].getAccountNumber() == clientAccountNumber){
                return accounts[i];
            }
        }
            System.out.println("There is no account with that number.");
            return null;
    }

    public void setDebitAccounts(Bank bank, AccountType accountType) {
        for (int i = 0; i < accounts.length; i++) {
           if (accounts[i] != null){
               continue;
           }
           accounts[i] = new DebitAccount(bank, accountType);
           System.out.println("Your debit account number in "+ bank.getName() +" is " + accounts[i].getAccountNumber());
           return;
        }
        System.out.println("This bank cannot hold anymore accounts.");
    }


    public void setCreditAccounts(Bank bank, AccountType accountType) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null){
                continue;
            }
            accounts[i] = new CreditAccount(bank, accountType);
            System.out.println("Your credit account number in " + bank.getName() + " is " + accounts[i].getAccountNumber());
            return;
        }
        System.out.println("This bank cannot hold anymore accounts.");
    }
}


