package mindera.bootcamp.exercises.MonstersExercise;

public class Player {


    private String name;

    private Monster[] hand;


    public Player(String name) {
        this.name = name;
    }

    public int aliveMonsters;


    public Monster playCard() {

        return hand[(int) (Math.random() * aliveMonsters)];
    }


    public void monsterIndex(Monster monster) {
        if (monster.isDead()) {
            aliveMonsters--;
            Monster liveMonster = hand[aliveMonsters];
            for (int i = 0; i < hand.length; i++) {
                if (hand[i] == monster) {
                    hand[aliveMonsters] = monster;
                    hand[i] = liveMonster;
                }
            }
        }
    }


    public boolean stillHasMonsters() {
        for (Monster card : hand) {
            if (!card.isDead()) {
                return true;
            }
        }
        return false;
    }


    public String getName() {
        return name;
    }

    public Monster[] getHand() {
        return hand;
    }

    public void setHand(Monster[] hand) {
        this.hand = hand;
    }

    public int getAliveMonsters() {
        return aliveMonsters;
    }

    public void setAliveMonsters(int aliveMonsters) {
        this.aliveMonsters = aliveMonsters;
    }
}
