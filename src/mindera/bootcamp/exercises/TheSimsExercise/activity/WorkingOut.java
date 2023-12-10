package mindera.bootcamp.exercises.TheSimsExercise.activity;

import mindera.bootcamp.exercises.TheSimsExercise.player.Sims;

public class WorkingOut extends Activity {


    public void workingOut(Sims sims) {
        System.out.println(sims.getName() + " is WORKING OUT !!");
        sims.setEnergy(sims.getEnergy() - 5);
        System.out.println(sims.getName() + " decided to workout for a bit and drained -5 energy. His energy is now " + sims.getEnergy());
    }

}
