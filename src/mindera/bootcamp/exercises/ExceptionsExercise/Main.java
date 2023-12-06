package mindera.bootcamp.exercises.ExceptionsExercise;

import mindera.bootcamp.exercises.ExceptionsExercise.exceptions.NotEnoughFundsException;
import mindera.bootcamp.exercises.ExceptionsExercise.exceptions.NotEnoughPermissionsException;

public class Main {
    public static void main(String[] args) {

        Card card = new Card();
        ATM atm = new ATM();

        card.setPinNumber(1443);
        card.setBalance(100);

        try {
            atm.withdraw(card, 102);
        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("this will print anyway");
        }

        try {
            atm.insertCard(card, 1444);
        } catch (NotEnoughPermissionsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("this will print no matter what.");
        }


    }


}
