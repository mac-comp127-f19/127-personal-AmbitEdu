package activityStarterCode.extractInterface;

import java.util.Random;

public class GameCharacter {
    private static final Random rand = new Random();

    private final String name;
    private int hitPoints, mana;
    private AttackFireball attackFireball;
    private AttackSword attackSword;


    public GameCharacter(String name, int hitPoints, int mana, int swordMinDamage, int swordMaxDamage, int fireballDamage, int fireballManaRequired) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.mana = mana;

        this.attackFireball = new AttackFireball(this, fireballDamage, fireballManaRequired);
        this.attackSword = new AttackSword(this, swordMinDamage, swordMaxDamage);
    }

    public String fireballAttack(GameCharacter target) {
        return this.attackFireball.attack(target);
    }

    public String swordAttack(GameCharacter target) {
        return this.attackSword.attack(target);
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getMana() {
        return mana;
    }

    public void takeDamage(int damage) {
        hitPoints = Math.max(0, hitPoints - damage);
    }

    public boolean useMana(int amount) {
        if (mana >= amount) {
            mana -= amount;
            return true;
        } else {
            return false;
        }
    }
}
