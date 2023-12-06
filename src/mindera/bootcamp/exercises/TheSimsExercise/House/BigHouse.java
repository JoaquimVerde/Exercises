package mindera.bootcamp.exercises.TheSimsExercise.House;

import mindera.bootcamp.exercises.TheSimsExercise.Room.*;

public class BigHouse extends House {


    private Room[] rooms;


    public BigHouse() {
        super(HouseType.BIG, new Room[]{new BedRoom(), new Kitchen(), new BathRoom(), new LivingRoom(), new OfficeRoom()});
        setPrice(50);
    }
}
