package mindera.bootcamp.exercises.TheSimsExercise.player;

public abstract class SimsFactory {

    public static Sims create(SimsType type) {

        return switch (type) {
            case LAZYPLAYER -> new LazyPlayer("Lazy", 18);
            case FUNNYPLAYER -> new FunnyPlayer("Funny", 37);
            case SPORTYPLAYER -> new SportyPlayer("Sporty", 42);
        };
    }
}
