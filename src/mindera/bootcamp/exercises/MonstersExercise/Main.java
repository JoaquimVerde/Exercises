package mindera.bootcamp.exercises.MonstersExercise;

public class Main {

    public static void main(String[] args) {

        Player joaquim = new Player("Joaquim");
        Player joana = new Player("Joana");

        Game game1 = new Game(joaquim, joana);

        game1.distributeCards();

        game1.match();
    }
}
