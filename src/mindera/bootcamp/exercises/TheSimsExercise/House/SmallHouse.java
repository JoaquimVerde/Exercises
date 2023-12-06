package mindera.bootcamp.exercises.TheSimsExercise.House;

import mindera.bootcamp.exercises.TheSimsExercise.Room.BathRoom;
import mindera.bootcamp.exercises.TheSimsExercise.Room.BedRoom;
import mindera.bootcamp.exercises.TheSimsExercise.Room.Kitchen;
import mindera.bootcamp.exercises.TheSimsExercise.Room.Room;

public class SmallHouse extends House {


    public SmallHouse() {
        super(HouseType.SMALL, new Room[]{new BedRoom(), new Kitchen(), new BathRoom()});
        setPrice(30);
    }
}
