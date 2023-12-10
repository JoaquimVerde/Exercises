package mindera.bootcamp.exercises.TheSimsExercise;

import mindera.bootcamp.exercises.TheSimsExercise.House.BigHouse;
import mindera.bootcamp.exercises.TheSimsExercise.House.House;
import mindera.bootcamp.exercises.TheSimsExercise.player.LazyPlayer;
import mindera.bootcamp.exercises.TheSimsExercise.player.Sims;

public class Main {
    public static void main(String[] args) {


        Sims john = new LazyPlayer("john", 23);

        House bigHouse = new BigHouse();

        Maid christina = new Maid("Christina", 5);
        Maid helen = new Maid("Helen", 6);


        john.buyHouse(bigHouse);

        System.out.println("#".repeat(20));

        john.useOfficeRoom();

        System.out.println("#".repeat(20));

        john.useOfficeRoom();
        System.out.println("#".repeat(20));
        john.useBedRoom();
        john.useKitchen();
        john.useBathRoom();
        john.useLivingRoom();
        john.useLivingRoom();

        john.getMaid(5, christina);


    }
}
