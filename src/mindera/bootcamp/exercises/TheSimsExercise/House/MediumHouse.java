package mindera.bootcamp.exercises.TheSimsExercise.House;

import mindera.bootcamp.exercises.TheSimsExercise.Room.*;

public class MediumHouse extends House {

    private Room[] rooms;


    public MediumHouse() {
        super(HouseType.MEDIUM, new Room[]{new BedRoom(), new Kitchen(), new BathRoom(), new LivingRoom()});
        setPrice(40);
    }
}

