package mindera.bootcamp.exercises.TheSimsExercise.player;

public final class LazyPlayer extends Sims {


    public LazyPlayer(String name, int age) {
        super(SimsType.LAZYPLAYER);
        setName(name);
        setAge(age);
        setHappiness(70);
        setEnergy(50);
        setHunger(0);
        setMoney(50);

    }
}
