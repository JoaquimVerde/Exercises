package mindera.bootcamp.exercises.TheSimsExercise.activity;

import mindera.bootcamp.exercises.TheSimsExercise.player.Sims;

public class Sleeping extends Activity {

    public void sleeping(Sims sims) {
        System.out.println(sims.getName() + " is SLEEPING!!");
        sims.setEnergy(sims.getEnergy() + 5);
        System.out.println(sims.getName() + " slept for a bit and regained +5 energy. His energy is now " + sims.getEnergy());

    }
}
