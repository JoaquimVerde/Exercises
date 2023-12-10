package mindera.bootcamp.exercises.TheSimsExercise.Room;

import mindera.bootcamp.exercises.TheSimsExercise.activity.Activity;

public abstract class Room {

    private RoomType type;

    private Activity[] activities;


    public Room(RoomType type, Activity[] activities) {
        this.type = type;
        this.activities = activities;


    }

    public RoomType getType() {
        return type;
    }

    public Activity[] getActivities() {
        return activities;
    }

    public void setActivities(Activity[] activities) {
        this.activities = activities;
    }


}
