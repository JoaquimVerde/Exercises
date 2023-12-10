package mindera.bootcamp.exercises.TheSimsExercise.activity;

import mindera.bootcamp.exercises.TheSimsExercise.player.Sims;

public class GoToBathroom extends Activity {

    public void goToBathRoom(Sims sims) {
        System.out.println(sims.getName() + " is TAKING A BATH!");
        sims.setHappiness(sims.getHappiness() + 10);
        System.out.println(sims.getName() + " just took a bath and increased +10 Happiness. Happiness is now: " + sims.getHappiness());
        sims.setHunger(sims.getHunger() + 5);
        System.out.println(sims.getName() + " increased hunger by +5. Hunger is now " + sims.getHunger());
    }

}
