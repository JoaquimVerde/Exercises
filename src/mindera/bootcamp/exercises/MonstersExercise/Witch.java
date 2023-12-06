package mindera.bootcamp.exercises.MonstersExercise;

public class Witch extends Supernatural implements Strikeable {

    public Witch() {
        super(5, 20);

    }

    @Override
    protected void attack(Monster monster1, Monster monster2) {
        super.attack(monster1, monster2);
        setHealth(getHealth() - ((monster1.getHitPower() / 2) + (monster2.getHitPower() / 2)));
    }

    @Override
    public boolean isDead() {
        return getHealth() < 1;
    }
}
