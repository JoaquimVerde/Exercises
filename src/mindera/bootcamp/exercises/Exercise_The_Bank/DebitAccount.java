package mindera.bootcamp.exercises.Exercise_The_Bank;

public final class DebitAccount extends Account{

    public DebitAccount(Bank bank, AccountType accountType){
        super(bank, accountType);
    }


    public int decreaseBalance(int amountToWithdraw){

        if(amountToWithdraw > getBalance()){
            System.out.println("Cannot Withdraw that amount of money");
            return getBalance();
        }
        setBalance(getBalance() - amountToWithdraw);
        return getBalance();
    }

}
