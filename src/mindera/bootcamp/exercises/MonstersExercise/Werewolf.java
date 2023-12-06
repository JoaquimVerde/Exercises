package mindera.bootcamp.exercises.MonstersExercise;

public class Werewolf extends Monster {


    public Werewolf() {
        super(3, 30, MonsterType.WEREWOLF, "Werewolf");
    }


    @Override
    protected void attack(Monster target) {

        target.setHealth(target.getHealth() - getHitPower());
    }


}
