package mindera.bootcamp.exercises.ExceptionsExercise.exceptions;

public class NotEnoughPermissionsException extends ATMException {


    public NotEnoughPermissionsException() {
        super("Wrong pin Number");
    }


}
