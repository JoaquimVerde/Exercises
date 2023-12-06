package mindera.bootcamp.exercises.TheSimsExercise.activity;

import mindera.bootcamp.exercises.TheSimsExercise.player.Sims;

public class Eating extends Activity {


    public void eating(Sims sims) {
        sims.setEnergy(sims.getEnergy() + 5);
    }
}
