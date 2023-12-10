package mindera.bootcamp.exercises.TheSimsExercise.Room;

import mindera.bootcamp.exercises.TheSimsExercise.activity.Activity;
import mindera.bootcamp.exercises.TheSimsExercise.activity.Sleeping;
import mindera.bootcamp.exercises.TheSimsExercise.activity.WorkingOut;

public class BedRoom extends Room {


    public BedRoom() {
        super(RoomType.BEDROOM, new Activity[]{new Sleeping(), new WorkingOut()});
    }


}
