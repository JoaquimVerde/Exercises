package mindera.bootcamp.exercises.Exercise_The_Bank;

public final class CreditAccount extends Account{


    public CreditAccount(Bank bank, AccountType accountType){
        super(bank, accountType);
    }

    public int decreaseBalance(int amountToWithdraw){

        if(getBalance() < 0){
            amountToWithdraw -= -5;
            if(getBalance() - amountToWithdraw < -100){
                System.out.println("Cannot Withdraw that amount of money");
                return getBalance();
            }
            setBalance(getBalance() - amountToWithdraw); // amountToWithdraw - 5
            return getBalance();
        }
        if(getBalance() - amountToWithdraw < -100) {
            System.out.println("Cannot Withdraw that amount of money");
            return getBalance();
        }
        setBalance(getBalance() - amountToWithdraw);
        return getBalance();
    }

}
