package mindera.bootcamp.exercises.Exercise_The_Bank;

import javax.sound.midi.Soundbank;

public class Main {


    public static void main(String[] args) {

        Bank santander = new Bank("Santander");
        Bank bankinter = new Bank("Bankinter");

        Customer john = new Customer("John");
        Customer mary = new Customer("Mary");


        john.createDebitAccount(santander, AccountType.DEBIT);
        john.createDebitAccount(santander, AccountType.DEBIT);
        john.createCreditAccount(bankinter, AccountType.CREDIT);
        john.createDebitAccount(bankinter, AccountType.DEBIT);
        mary.createDebitAccount(santander, AccountType.DEBIT);

        /*john.depositInDebitAccount(50,1,santander);
        john.checkBalance(1,santander);
        john.withdrawFromDebitAccount(20, 1, santander);
        john.checkBalance(1,santander);
        john.withdrawFromDebitAccount(40, 1, santander);
        john.depositInCreditAccount(100,2,bankinter);
        john.checkBalance(2,bankinter);
        john.payWithCreditCard(50,2,bankinter);
        john.checkBalance(2,bankinter);
        john.payWithCreditCard(100,2,bankinter);
        john.checkBalance(2,bankinter);
        john.payWithCreditCard(10,2,bankinter);
        john.checkBalance(2,bankinter);
        john.payWithCreditCard(35,2,bankinter);
        john.checkBalance(2,bankinter);*/





    }

}

