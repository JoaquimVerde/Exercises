package mindera.bootcamp.exercises.TheSimsExercise.player;

public final class SportyPlayer extends Sims {

    public SportyPlayer(String name, int age) {
        super(SimsType.SPORTYPLAYER);
        setName(name);
        setAge(age);
        setHappiness(85);
        setEnergy(100);
        setHunger(0);
        setMoney(70);

    }
}
