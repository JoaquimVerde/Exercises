package mindera.bootcamp.exercises.TheSimsExercise.player;

import mindera.bootcamp.exercises.TheSimsExercise.House.House;
import mindera.bootcamp.exercises.TheSimsExercise.Maid;
import mindera.bootcamp.exercises.TheSimsExercise.Room.RoomType;

public abstract class Sims implements SimsI {

    private String name;
    private int age;

    private House house;
    private int energy;
    private int hunger;
    private int happiness;
    private int money;
    private SimsType type;
    private boolean hasHouse;
    private boolean needsMaid;


    public Sims(SimsType type) {
        this.type = type;
    }


    @Override
    public void buyHouse(House house) {
        if (money < house.getPrice()) {
            System.out.println("You cannot afford this house");
            return;
        }
        hasHouse = true;
        this.house = house;
        money -= house.getPrice();
    }

    public void useBathRoom() {
        if (!hasHouse || house.getCleanlinessLevel() < 20) {
            System.out.println("you do not own a house or it needs cleaning.");
            return;
        }
        if (!checkIfHouseHasRoom(RoomType.BATHROOM)) {
            System.out.println("You don't have that room!");
            return;
        }

        house.setCleanlinessLevel(house.getCleanlinessLevel() - 20);

    }

    public void useBedRoom() {
        if (!hasHouse || house.getCleanlinessLevel() < 20) {
            System.out.println("you do not own a house or it needs cleaning.");
            return;
        }
        if (!checkIfHouseHasRoom(RoomType.BEDROOM)) {
            System.out.println("You don't have that room!");
            return;
        }

        house.setCleanlinessLevel(house.getCleanlinessLevel() - 25);

    }

    public void useLivingRoom() {
        if (!hasHouse || house.getCleanlinessLevel() < 20) {
            System.out.println("you do not own a house or it needs cleaning.");
            return;
        }

        if (!checkIfHouseHasRoom(RoomType.LIVINGROOM)) {
            System.out.println("You don't have that room!");
            return;
        }


        house.setCleanlinessLevel(house.getCleanlinessLevel() - 15);

    }

    public void useKitchen() {
        if (!hasHouse || house.getCleanlinessLevel() < 20) {
            System.out.println("you do not own a house or it needs cleaning.");
            return;
        }
        if (!checkIfHouseHasRoom(RoomType.KITCHEN)) {
            System.out.println("You don't have that room!");
            return;
        }
        house.setCleanlinessLevel(house.getCleanlinessLevel() - 30);

    }

    public void useOfficeRoom() {
        if (!hasHouse || house.getCleanlinessLevel() < 20) {
            System.out.println("you do not own a house or it needs cleaning.");
            return;
        }
        if (!checkIfHouseHasRoom(RoomType.OFFICEROOM)) {
            System.out.println("You don't have that room!");
            return;
        }
        house.setCleanlinessLevel(house.getCleanlinessLevel() - 10);
    }


    public void getMaid(int money, Maid maid) {
        if (money > 19) {
            maid.setCleaning(true);
            house.setCleanlinessLevel(100);
        }
        System.out.println("Need to pay more.");
    }

    public boolean checkIfHouseHasRoom(RoomType type) {
        for (int i = 0; i < house.getRooms().length; i++) {
            if (house.getRooms()[i].getType() == type) {
                return true;
            }
        }
        return false;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

}
