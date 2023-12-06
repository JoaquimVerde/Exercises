package mindera.bootcamp.exercises.MonstersExercise;

public abstract class Monster extends Supernatural implements Strikeable {


    private String name;

    private MonsterType type;


    public Monster(int hitPower, int health, MonsterType type, String name) {
        super(hitPower, health);
        this.type = type;
        this.name = name;
    }


    protected abstract void attack(Monster target);


    public boolean isDead() {
        return getHealth() < 1;
    }


    public String getName() {
        return name;
    }

    public MonsterType getType() {
        return type;
    }

}
