package mindera.bootcamp.exercises.TheSimsExercise.player;

import mindera.bootcamp.exercises.TheSimsExercise.House.House;
import mindera.bootcamp.exercises.TheSimsExercise.Maid;
import mindera.bootcamp.exercises.TheSimsExercise.Room.Room;
import mindera.bootcamp.exercises.TheSimsExercise.Room.RoomType;
import mindera.bootcamp.exercises.TheSimsExercise.activity.*;

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
        house.occupy();
        this.house = house;
        money -= house.getPrice();
        System.out.println(name + " just bought a " + house.getType() + " house!!");
        System.out.println(name + " has now " + money + " money.");
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
        Activity activity = chooseActivity(house.getRooms()[2]);
        if (activity.equals(house.getRooms()[2].getActivities()[0])) {
            new GoToBathroom().goToBathRoom(this);
        }
        System.out.println("House is now at Clean level: " + house.getCleanlinessLevel());
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
        Activity activity = chooseActivity(house.getRooms()[0]);
        if (activity.equals(house.getRooms()[0].getActivities()[0])) {
            new Sleeping().sleeping(this);
        }
        if (activity.equals(house.getRooms()[0].getActivities()[1])) {
            new WorkingOut().workingOut(this);
        }
        System.out.println("House is now at Clean level: " + house.getCleanlinessLevel());
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
        Activity activity = chooseActivity(house.getRooms()[3]);
        if (activity.equals(house.getRooms()[3].getActivities()[0])) {
            new Eating().eating(this);
        }
        System.out.println("House is now at Clean level: " + house.getCleanlinessLevel());
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
        Activity activity = chooseActivity(house.getRooms()[1]);
        if (activity.equals(house.getRooms()[1].getActivities()[0])) {
            new Eating().eating(this);
        }
        if (activity.equals(house.getRooms()[1].getActivities()[1])) {
            new Working().working(this);
        }
        System.out.println("House is now at Clean level: " + house.getCleanlinessLevel());
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
        Activity activity = chooseActivity(house.getRooms()[4]);
        if (activity.equals(house.getRooms()[4].getActivities()[0])) {
            new Working().working(this);
        }
        System.out.println("House is now at Clean level: " + house.getCleanlinessLevel());
    }


    public Activity chooseActivity(Room room) {
        int rand = (int) (Math.random() * room.getActivities().length);
        return room.getActivities()[rand];
    }


    public void getMaid(int amountToPay, Maid maid) {
        if (maid.isCleaning()) {
            System.out.println("Maid is unavailable.");
            return;
        }
        if (amountToPay < maid.getPrice() || amountToPay > money) {
            System.out.println("You cannot afford this Maid");
            return;
        }
        maid.setCleaning(true);
        house.setCleanlinessLevel(100);
        money -= amountToPay;
        System.out.println(name + " cleaned the house! House clean level is now: " + house.getCleanlinessLevel());
        System.out.println(name + " has now this money " + money);
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
