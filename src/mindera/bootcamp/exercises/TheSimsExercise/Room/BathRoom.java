package mindera.bootcamp.exercises.TheSimsExercise.Room;

import mindera.bootcamp.exercises.TheSimsExercise.activity.Activity;
import mindera.bootcamp.exercises.TheSimsExercise.activity.GoToBathroom;

public class BathRoom extends Room {


    public BathRoom() {
        super(RoomType.BATHROOM);
        setActivities(new Activity[]{new GoToBathroom()});
    }
}
