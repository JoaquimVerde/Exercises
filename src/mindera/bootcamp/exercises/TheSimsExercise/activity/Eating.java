package mindera.bootcamp.exercises.TheSimsExercise.activity;

import mindera.bootcamp.exercises.TheSimsExercise.player.Sims;

public class Eating extends Activity {


    public void eating(Sims sims) {
        System.out.println(sims.getName() + " is EATING!");
        sims.setEnergy(sims.getEnergy() + 5);
        System.out.println(sims.getName() + " gaines +5 energy. Energy is now " + sims.getEnergy());
        sims.setHunger(sims.getHunger() - 10);
        System.out.println(sims.getName() + " ate a lot and hunger decreased. Hunger is now: " + sims.getHunger());
        sims.setHappiness(sims.getHappiness() + 10);
        System.out.println(sims.getName() + " just increased +10 Happiness. Happiness is now: " + sims.getHappiness());
    }
}
