package activityStarterCode.basicClasses;

import java.util.Random;

/**
 * Represents a random walk along the integer
 * number line starting at some value. At each step it either moves
 * forward or backward by one unit.
 */
public class RandomWalk {
    private Random rng;
    private int currentWalkState;
    private int walkRange;

    /**
     * Creates a new random walk starting with some initial value.
     * TODO: Adjust this constructor to take an initial value for the walk.
     */
    public RandomWalk(int initalWalkValue, int range) {
        currentWalkState = initalWalkValue;
        walkRange = range;
        rng = new Random();
    }

    /**
     * TODO Complete me.
     * @return the current value for the random walk.
     */
    public int getValue() {
        return currentWalkState;
    }

    /**
     * Updates the value randomly by adding either +1 or -1.
     * @return Updated value.
     */
    public int advanceValue() {
        if(rng.nextBoolean()) {
            currentWalkState++;
        } else {
            currentWalkState--;
        }

        if(currentWalkState < 0) {
            currentWalkState = 0;
        } else if(currentWalkState > walkRange) {
            currentWalkState = walkRange;
        }
        return getValue();
    }
}

