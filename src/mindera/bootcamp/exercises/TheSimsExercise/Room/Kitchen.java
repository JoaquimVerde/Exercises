package mindera.bootcamp.exercises.TheSimsExercise.Room;

import mindera.bootcamp.exercises.TheSimsExercise.activity.Activity;
import mindera.bootcamp.exercises.TheSimsExercise.activity.Eating;

public class Kitchen extends Room {


    public Kitchen() {
        super(RoomType.KITCHEN);
        setActivities(new Activity[]{new Eating()});
    }
}
