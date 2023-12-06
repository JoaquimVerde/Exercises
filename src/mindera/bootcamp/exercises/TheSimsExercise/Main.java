package mindera.bootcamp.exercises.TheSimsExercise;

import mindera.bootcamp.exercises.TheSimsExercise.House.House;
import mindera.bootcamp.exercises.TheSimsExercise.House.SmallHouse;
import mindera.bootcamp.exercises.TheSimsExercise.player.LazyPlayer;
import mindera.bootcamp.exercises.TheSimsExercise.player.Sims;

public class Main {
    public static void main(String[] args) {


        Sims john = new LazyPlayer("john", 23);

        House smallHouse = new SmallHouse();

        john.buyHouse(smallHouse);
        System.out.println(john.getMoney());
        john.useBathRoom();

        // SimsFactory.create(SimsType.LAZYPLAYER).buyHouse(HouseFactory.create(HouseType.SMALL));

        //SimsFactory.create(SimsType.FUNNYPLAYER).useLivingRoom();


    }
}
