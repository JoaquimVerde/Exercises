package mindera.bootcamp.exercises.TheSimsExercise.Room;

import mindera.bootcamp.exercises.TheSimsExercise.activity.Activity;
import mindera.bootcamp.exercises.TheSimsExercise.activity.Eating;
import mindera.bootcamp.exercises.TheSimsExercise.activity.Sleeping;

public class LivingRoom extends Room {


    public LivingRoom() {
        super(RoomType.LIVINGROOM);
        setActivities(new Activity[]{new Eating(), new Sleeping()});
    }


}
