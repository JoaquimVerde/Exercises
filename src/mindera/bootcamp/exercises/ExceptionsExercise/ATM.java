package mindera.bootcamp.exercises.ExceptionsExercise;

import mindera.bootcamp.exercises.ExceptionsExercise.exceptions.NotEnoughFundsException;
import mindera.bootcamp.exercises.ExceptionsExercise.exceptions.NotEnoughPermissionsException;

public class ATM {

    private Card card;


    public void insertCard(Card card, int pinNumber) throws NotEnoughPermissionsException {
        if (card.getPinNumber() != pinNumber) {
            throw new NotEnoughPermissionsException();
        }
        System.out.println("Access Granted.");
    }

    public void withdraw(Card card, int amountToWithdraw) throws NotEnoughFundsException {
        if (amountToWithdraw > card.getBalance()) {
            throw new NotEnoughFundsException();
        }
        card.setBalance(card.getBalance() - amountToWithdraw);
        System.out.println("your balance is now: " + card.getBalance());

    }
}
