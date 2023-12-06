package mindera.bootcamp.exercises.TheSimsExercise.player;

public final class FunnyPlayer extends Sims {

    public FunnyPlayer(String name, int age) {
        super(SimsType.FUNNYPLAYER);
        setName(name);
        setAge(age);
        setHappiness(90);
        setEnergy(80);
        setHunger(0);
        setMoney(40);

    }
}
