package mindera.bootcamp.exercises.MonstersExercise;

public class Vampire extends Monster {

    public Vampire() {
        super(6, 20, MonsterType.VAMPIRE, "Vampire");
    }


    @Override
    protected void attack(Monster target) {
        target.setHealth(target.getHealth() - getHitPower());
        int rand = (int) (Math.random() * 10);
        if (rand == 1) {
            setHealth(getHealth() + 2);
            System.out.println("Vampire took a bite and gained 2 health.");
        }

    }
}
