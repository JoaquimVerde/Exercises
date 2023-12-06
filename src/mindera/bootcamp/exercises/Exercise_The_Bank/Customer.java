package mindera.bootcamp.exercises.Exercise_The_Bank;

public class Customer {

    private String name;

    private boolean hasCreditCard;

    private boolean hasDebitCard;



    public Customer(String name) {
        this.name = name;
    }

    public void createDebitAccount(Bank bank, AccountType accountType) {
        if (hasDebitCard) {
            System.out.println("you cannot have anymore debit accounts at this Bank.");
            return;
        }
        bank.setDebitAccounts(bank, accountType);
        askDebitCard();
    }



    public void createCreditAccount(Bank bank, AccountType accountType) {
        if (hasCreditCard) {
            System.out.println("you cannot have anymore credit accounts at this Bank.");
            return;
        }
        bank.setCreditAccounts(bank, accountType);
        askCreditCard();
    }

    public void askDebitCard() {
        hasDebitCard = true;
    }

    public void askCreditCard() {
        hasCreditCard = true;
    }

    public Account getClientAccount(Bank bank, int clientAccountNumber) {

        return bank.getClientAccount(clientAccountNumber);
    }




    public void depositInCreditAccount(int amountToDeposit, int clientAccountNumber, Bank bank) {
        if (!hasCreditCard) {
            System.out.println("You have no Credit Card so you cannot proceed.");
            return;
        }
        getClientAccount(bank, clientAccountNumber).increaseBalance(amountToDeposit);
    }

    public void depositInDebitAccount(int amountToDeposit, int clientAccountNumber, Bank bank) {
        if (!hasDebitCard) {
            System.out.println("You have no Debit Card so you cannot proceed.");
            return;
        }
        getClientAccount(bank, clientAccountNumber).increaseBalance(amountToDeposit);
    }


    public void withdrawFromDebitAccount(int amountToWithdraw, int clientAccountNumber, Bank bank) {
        if (!hasDebitCard) {
            System.out.println("You have no Debit Card so you cannot proceed.");
            return;
        }
        getClientAccount(bank, clientAccountNumber).decreaseBalance(amountToWithdraw);
    }

    public void payWithCreditCard(int price, int clientAccountNumber, Bank bank) {
        if (!hasCreditCard) {
            System.out.println("You need a credit card to pay.");
        }
        getClientAccount(bank, clientAccountNumber).decreaseBalance(price);
    }

    public void payWithDebitCard(int price, int clientAccountNumber, Bank bank) {
        if (!hasDebitCard) {
            System.out.println("You need a credit card to pay.");
        }
        getClientAccount(bank, clientAccountNumber).decreaseBalance(price);
    }



    public int checkBalance(int clientAccountNumber, Bank bank){
        System.out.println("Your balance is: " + getClientAccount(bank, clientAccountNumber).getBalance() + ".");
        return getClientAccount(bank, clientAccountNumber).getBalance();
        }

    public String getName(){
        return name;
    }

}





