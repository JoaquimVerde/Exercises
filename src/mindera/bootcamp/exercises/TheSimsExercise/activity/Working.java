package mindera.bootcamp.exercises.TheSimsExercise.activity;

import mindera.bootcamp.exercises.TheSimsExercise.player.Sims;

public class Working extends Activity {

    public void working(Sims sims) {
        System.out.println(sims.getName() + " is WORKING!!");
        sims.setEnergy(sims.getEnergy() - 10);
        System.out.println(sims.getName() + " decreased -10 energy. Energy is now " + sims.getEnergy());
        sims.setHunger(sims.getHunger() + 10);
        System.out.println(sims.getName() + " increased hunger in +10. Hunger is now: " + sims.getHunger());
        sims.setHappiness(sims.getHappiness() - 10);
        System.out.println(sims.getName() + " Happiness decreased -10. Happiness is now: " + sims.getHappiness());
        sims.setMoney(sims.getMoney() + 30);
        System.out.println(sims.getName() + " earned 30 dollars! Money is now at " + sims.getMoney());
    }
}
