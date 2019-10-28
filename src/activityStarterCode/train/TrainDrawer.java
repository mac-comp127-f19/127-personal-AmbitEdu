package activityStarterCode.train;

import comp127graphics.CanvasWindow;
import comp127graphics.Ellipse;
import comp127graphics.Line;
import comp127graphics.Rectangle;

import java.awt.*;


/*
 * File: TrainDrawer.java
 * --------------------
 * This program draws a three-car train consisting on an engine,
 * a boxcar, and a caboose.  This implementation of the program,
 * however, is incomplete, and contains only the methods given
 * in the text.
 */

public class TrainDrawer {









    // Instance variable for the canvas that you can add shapes to in order to have them be drawn.
    private CanvasWindow canvas;


    public static void main(String[] args) {
        TrainDrawer drawer = new TrainDrawer();
    }

    public TrainDrawer(){
        //Create a window and canvas to draw on
        canvas = new CanvasWindow("Train", 800, 500);

        double trainWidth = 3 * TrainCar.getCarWidth() + 4 * TrainCar.getConnector();
        double x = (canvas.getWidth() - trainWidth) / 2;
        double y = canvas.getHeight()/2;
        double dx = TrainCar.getCarWidth() + TrainCar.getConnector();
        TrainEngine engine = new TrainEngine(Color.BLACK);
        canvas.add(engine, x, y);
        TrainBoxCar boxCar = new TrainBoxCar(Color.GREEN);
        canvas.add(boxCar, x + dx, y);
        TrainCaboose caboose = new TrainCaboose(Color.RED);
        canvas.add(caboose, x + 2 * dx, y);
        //drawEngine(x, y);
        //drawBoxcar(x + dx, y, Color.GREEN);
        //drawCaboose(x + 2 * dx, y);
    }




    /* Draws the common part of a train car */




}