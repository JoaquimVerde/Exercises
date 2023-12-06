package mindera.bootcamp.exercises.MonstersExercise;

public abstract class Supernatural {

    private int hitPower;
    private int health;


    public Supernatural(int hitPower, int health) {
        this.hitPower = hitPower;
        this.health = health;
    }

    protected void attack(Monster monster1, Monster monster2) {
        monster1.setHealth(monster1.getHealth() - hitPower);
        monster2.setHealth(monster2.getHealth() - hitPower);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    public int getHitPower() {
        return hitPower;
    }
}
