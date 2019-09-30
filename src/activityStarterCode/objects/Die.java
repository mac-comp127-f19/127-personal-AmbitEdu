package activityStarterCode.objects;

import java.util.List;
import java.util.Random;

public class Die {
    private int currentSide; //whatever side is facing up right now
    private int numSides; //how many sides the die has, usually 6
    private Random rand = new Random();
    private List<String> numWordForms = List.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");


    public Die() {
        this(6);
    }

    public Die(int numberOfSides) {
        currentSide = -1;
        numSides = numberOfSides;
    }

    public void roll() {
        currentSide = rand.nextInt(numSides) + 1;
    }

    public int getValue() {
        return currentSide;
    }

    @Override
    public String toString() {
        if(currentSide == -1) {
            return "unrolled";
        } else if(currentSide <= 10) {
           return numWordForms.get(currentSide - 1);
        } else {
            return ((Integer) currentSide).toString();
        }
    }
}
