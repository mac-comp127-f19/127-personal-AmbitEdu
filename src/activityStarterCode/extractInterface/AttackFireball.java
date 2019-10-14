package activityStarterCode.extractInterface;

public class AttackFireball implements Attack {

    private GameCharacter myCharacter;
    private int fireballDamage;
    private int fireballManaRequired;

    public AttackFireball(GameCharacter myCharacter, int fireballDamage, int fireballManaRequired) {
        this.myCharacter = myCharacter;
        this.fireballDamage = fireballDamage;
        this.fireballManaRequired = fireballManaRequired;
    }

    public int getDamage() {
        return fireballDamage;
    }

    public String attackString(GameCharacter target, int damage) {
        return myCharacter.getName() + " hit " + target.getName() + " with a fireball for "
                + damage + " points of damage";
    }

    public String attack (GameCharacter target) {
        myCharacter.useMana(fireballManaRequired);
        target.takeDamage(this.getDamage());
        return this.attackString(target, fireballDamage);
    }
}
