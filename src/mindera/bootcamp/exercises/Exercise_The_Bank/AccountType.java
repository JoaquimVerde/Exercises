package mindera.bootcamp.exercises.Exercise_The_Bank;

public enum AccountType {

    DEBIT(100,true),
    CREDIT(50,false);

    public final int minimumValue; //ou pode ser privado e ter um getter. consigo aceder a CREDIT.value ou CREDIT.getValue()
    public final boolean canWithdraw;

    /*IGUAL A TER UMA CLASS EM VEZ DE ENUM E FAZER:

    public static final AccountType DEBIT = new AccountType();
    public static final AccountType CREDIT = new AccountType();

    private AccountType(){
    }
     */

    AccountType(int minimumValue, boolean canWithdraw){
        this.minimumValue = minimumValue;
        this.canWithdraw = canWithdraw;
    }


}
