package activityStarterCode.objects;

public class DiceRoller {
    public static void main(String[] args) {
        Die die = new Die();
        for (int i = 0; i < 10; i++) {
            die.roll();
            System.out.println("Roll " + (i + 1) + " generated a " + die);
        }

        int count = 0;
        Die die2 = new Die();
        for (int i = 0; i < 1000000; i++) {
            die.roll();
            die2.roll();
            if(die.getValue() == die2.getValue()) {
                count++;
            }
        }
        System.out.println("In 1,000,000 rolls, two dice agreed " + count + " times");

        Die die3 = new Die(31);
        for (int i = 0; i < 10; i++) {
            die3.roll();
            System.out.println("Roll " + (i + 1) + " generated a " + die3);
        }
    }
}
