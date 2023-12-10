package mindera.bootcamp.exercises.TheSimsExercise.Room;

import mindera.bootcamp.exercises.TheSimsExercise.activity.Activity;
import mindera.bootcamp.exercises.TheSimsExercise.activity.Eating;
import mindera.bootcamp.exercises.TheSimsExercise.activity.Working;

public class Kitchen extends Room {


    public Kitchen() {
        super(RoomType.KITCHEN, new Activity[]{new Eating(), new Working()});
    }
}
