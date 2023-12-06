package mindera.bootcamp.exercises.MonstersExercise;

public class Mummy extends Monster {


    private int numOfAppearances;

    public Mummy() {
        super(4, 25, MonsterType.MUMMY, "Mummy");
    }


    @Override
    protected void attack(Monster target) {
        target.setHealth(target.getHealth() - getHitPower());
    }


    public int getNumOfAppearances() {
        return numOfAppearances;
    }

    public void setNumOfAppearances(int numOfAppearances) {
        this.numOfAppearances = numOfAppearances;
    }

}
