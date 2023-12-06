package mindera.bootcamp.exercises.TheSimsExercise.activity;

import mindera.bootcamp.exercises.TheSimsExercise.player.Sims;

public class Sleeping extends Activity {

    public void sleeping(Sims sims){
        sims.setEnergy(sims.getEnergy()+5);
    }
}
