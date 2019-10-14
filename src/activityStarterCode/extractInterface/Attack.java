package activityStarterCode.extractInterface;

public interface Attack {

    String attack(GameCharacter target);
    int getDamage();
    String attackString(GameCharacter target, int damage);
}
