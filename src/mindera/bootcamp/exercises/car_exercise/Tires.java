package mindera.bootcamp.exercises.car_exercise;

public class Tires {

    private static int wear;

    public static void decreaseWear(){
        wear--;
        System.out.println("tires are "+wear);

    }

    public static void refuelWear() { wear = 3; }

    public static int getWear(){
        return wear;
    }

}
