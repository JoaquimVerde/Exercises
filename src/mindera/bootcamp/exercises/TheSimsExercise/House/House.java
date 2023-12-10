package mindera.bootcamp.exercises.TheSimsExercise.House;

import mindera.bootcamp.exercises.TheSimsExercise.Room.Room;

public abstract class House {

    private boolean occupied;

    private int cleanlinessLevel;

    private Room[] rooms;

    private HouseType type;

    private int price;


    public House(HouseType type, Room[] rooms) {
        this.type = type;
        this.rooms = rooms;
        cleanlinessLevel = 100;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) {
        this.cleanlinessLevel = cleanlinessLevel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public boolean IsOccupied() {
        return occupied;
    }

    public boolean occupy() {
        return occupied = true;
    }

    public HouseType getType() {
        return type;
    }
}
