package mindera.bootcamp.exercises.TheSimsExercise;

import mindera.bootcamp.exercises.TheSimsExercise.House.BigHouse;
import mindera.bootcamp.exercises.TheSimsExercise.House.House;
import mindera.bootcamp.exercises.TheSimsExercise.House.MediumHouse;
import mindera.bootcamp.exercises.TheSimsExercise.House.SmallHouse;
import mindera.bootcamp.exercises.TheSimsExercise.player.FunnyPlayer;
import mindera.bootcamp.exercises.TheSimsExercise.player.LazyPlayer;
import mindera.bootcamp.exercises.TheSimsExercise.player.Sims;
import mindera.bootcamp.exercises.TheSimsExercise.player.SportyPlayer;

public class SimsGame {

    private House[] availableHouses;

    private Maid[] availableMaids;

    private Sims[] players;


    public SimsGame(House[] availableHouses, Maid[] availableMaids, Sims[] players) {
        this.availableHouses = availableHouses;
        this.availableMaids = availableMaids;
        this.players = players;
    }


    public void buyHouses() {
        for (int i = 0; i < players.length; i++) {
            players[i].buyHouse(availableHouses[i]);
        }
    }

    public void freeUpMaid(Maid maid) {
        maid.setCleaning(false);
    }


    public static void main(String[] args) {

        SimsGame game1 = new SimsGame(new House[]{new BigHouse(), new SmallHouse(), new MediumHouse()},
                new Maid[]{new Maid("Helen", 5), new Maid("Christina", 7),},
                new Sims[]{new LazyPlayer("John", 25), new SportyPlayer("Annabelle", 33),
                        new FunnyPlayer("Timothy", 45)});

        game1.buyHouses();

        game1.players[0].useOfficeRoom();
        game1.players[1].useBedRoom();
        game1.players[2].useKitchen();
        game1.players[2].useOfficeRoom();
        game1.players[0].useBedRoom();
        game1.players[1].useKitchen();
        game1.players[1].useOfficeRoom();
        game1.players[2].useBedRoom();
        game1.players[0].useKitchen();
        game1.players[0].getMaid(7, game1.availableMaids[1]);
        game1.players[1].getMaid(5, game1.availableMaids[0]);
        game1.players[2].getMaid(7, game1.availableMaids[1]);
        game1.freeUpMaid(game1.availableMaids[0]);
        game1.freeUpMaid(game1.availableMaids[1]);
        game1.players[2].getMaid(7, game1.availableMaids[1]);


    }


}
