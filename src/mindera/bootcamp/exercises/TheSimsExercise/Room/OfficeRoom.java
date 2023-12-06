package mindera.bootcamp.exercises.TheSimsExercise.Room;

import mindera.bootcamp.exercises.TheSimsExercise.activity.Activity;
import mindera.bootcamp.exercises.TheSimsExercise.activity.Working;

public class OfficeRoom extends Room {


    public OfficeRoom() {
        super(RoomType.OFFICEROOM);
        setActivities(new Activity[]{new Working()});
    }
}
