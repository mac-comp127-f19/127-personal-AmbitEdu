package activityStarterCode.train;

import java.awt.*;
import comp127graphics.Rectangle;

public class TrainBoxCar extends TrainCar {

    /* Dimensions of the door panels on the boxcar */
    public static final double DOOR_WIDTH = 18*SCALE;
    public static final double DOOR_HEIGHT = 32*SCALE;

    private Color color;

    public TrainBoxCar(Color color) {
        super(color);
        this.color = color;
        this.drawBoxcarDoors(0, getTotalCarHeight());
    }

    private void drawBoxcarDoors(double x, double y) {
        double xRight = x + CONNECTOR + CAR_WIDTH / 2;
        double xLeft = xRight - DOOR_WIDTH;
        double yDoor = y - CAR_BASELINE - DOOR_HEIGHT;
        this.add(new Rectangle(xLeft, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
        this.add(new Rectangle(xRight, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
    }

    public double getTotalCarHeight() {
        return CAR_HEIGHT + CAR_BASELINE + 8;
    }
}
