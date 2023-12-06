package mindera.bootcamp.exercises.TheSimsExercise.House;

public abstract class HouseFactory {

    public static House create(HouseType type) {

        return switch (type) {
            case SMALL -> new SmallHouse();
            case MEDIUM -> new MediumHouse();
            case BIG -> new BigHouse();
        };
    }

}
