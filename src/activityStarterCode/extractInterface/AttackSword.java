package activityStarterCode.extractInterface;

import java.util.Random;

public class AttackSword implements Attack {

    private int swordMinDamage;
    private int swordMaxDamage;
    private GameCharacter myCharacter;
    private Random rand = new Random();

    public AttackSword(GameCharacter myCharacter, int swordMinDamage, int swordMaxDamage) {
        this.myCharacter = myCharacter;
        this.swordMinDamage = swordMinDamage;
        this.swordMaxDamage = swordMaxDamage;
    }

    public int getDamage() {
        return rand.nextInt(swordMinDamage - swordMaxDamage + 1) + swordMinDamage;
    }

    public String attackString(GameCharacter target, int damage) {
        return myCharacter.getName() + " struck " + target.getName() + " with a sword for "
                + damage + " points of damage";
    }

    public String attack(GameCharacter target) {
        int damage = this.getDamage();
        target.takeDamage(damage);
        return attackString(target, damage);
    }
}
