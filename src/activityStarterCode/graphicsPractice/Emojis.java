package activityStarterCode.graphicsPractice;

import comp127graphics.Arc;
import comp127graphics.CanvasWindow;
import comp127graphics.Ellipse;
import comp127graphics.GraphicsGroup;
import comp127graphics.Rectangle;

import java.awt.*;

@SuppressWarnings("WeakerAccess")
public class Emojis {
    private static final Color
        HEAD_COLOR = new Color(0xFFDE30),
        HEAD_OUTLINE_COLOR = new Color(0xAC9620),
        MOUTH_COLOR = new Color(0xE45B5B);

    public static void main(String[] args) {
        CanvasWindow canvas = new CanvasWindow("Emoji", 800, 600);

        GraphicsGroup littleSmiley = createFace(100, "Smiley");
        littleSmiley.setPosition(50, 400);
        canvas.add(littleSmiley);

        GraphicsGroup mediumSmiley = createFace(200, "Smiley");
        mediumSmiley.setPosition(150, 300);
        canvas.add(mediumSmiley);

        GraphicsGroup bigSmiley = createFace(300, "Frowny Winky");
        bigSmiley.setPosition(350, 200);
        canvas.add(bigSmiley);
    }

    /**
     * Creates a smiley face emoji.
     *
     * @param size The overall width and height of the emoji.
     * @return A graphic that you can add to a window, or place inside some other graphics group.
     */
    public static GraphicsGroup createFace(double size, String type) {
        GraphicsGroup group = new GraphicsGroup();
        group.add(createHead(size, size));
        final double EYE_SIZE_RATIO = 0.1;
        final double EYE_SPREAD = 0.15;
        final double EYE_DEPTH = 0.40;

        if(type.contains("Winky")) {
            Ellipse leftEye = createEye(size * EYE_SIZE_RATIO);
            Rectangle rightEye = createWinkingEye(size * EYE_SIZE_RATIO);
            leftEye.setCenter(size * (0.5 - EYE_SPREAD), size * EYE_DEPTH);
            rightEye.setCenter(size * (0.5 + EYE_SPREAD), size * EYE_DEPTH);
            group.add(leftEye);
            group.add(rightEye);
        } else {
            Ellipse leftEye = createEye(size * EYE_SIZE_RATIO);
            Ellipse rightEye = createEye(size * EYE_SIZE_RATIO);
            leftEye.setCenter(size * (0.5 - EYE_SPREAD), size * EYE_DEPTH);
            rightEye.setCenter(size * (0.5 + EYE_SPREAD), size * EYE_DEPTH);
            group.add(leftEye);
            group.add(rightEye);
        }

        if(type.contains("Smiley")) {
            Arc mouth = createSmile(size * 0.6, size * 0.5);
            mouth.setCenter(size * 0.5, size * 0.75);
            group.add(mouth);
        } else if (type.contains("Frowny")) {
            Arc mouth = createFrown(size * 0.6, size * 0.5);
            mouth.setCenter(size * 0.5, size * 0.75);
            group.add(mouth);
        }

        return group;
    }

    /**
     * Creates an empty emoji head. The head fits inside the box from (0,0)
     * to (width,height).
     */
    private static Ellipse createHead(double height, double width) {
        Ellipse head = new Ellipse(0, 0, width, height);
        head.setFillColor(HEAD_COLOR);
        head.setStrokeColor(HEAD_OUTLINE_COLOR);
        head.setStrokeWidth(2);
        return head;
    }

    /**
     * Creates a smile-shaped arc. The arc is measured relative to its “implied ellipse,” which is
     * the shape that would be formed if the arc were extend all the way around. The size of the
     * resulting arc will be smaller than the implied ellipse’s size.
     *
     * @param ellipseWidth  The width of the implied ellipse from which the smile’s arc is cut.
     * @param ellipseHeight The width of the implied ellipse from which the smile’s arc is cut.
     */
    private static Arc createSmile(double ellipseWidth, double ellipseHeight) {
        Arc mouth = new Arc(0, 0, ellipseWidth, ellipseHeight, 200, 140);
        mouth.setStrokeColor(MOUTH_COLOR);
        mouth.setStrokeWidth(4);
        return mouth;
    }

    private static Arc createFrown(double ellipseWidth, double ellipseHeight) {
        Arc mouth = new Arc(0, 0, ellipseWidth, ellipseHeight, 20, 140);
        mouth.setStrokeColor(MOUTH_COLOR);
        mouth.setStrokeWidth(4);
        return mouth;
    }

    private static Ellipse createEye(double size) {
        Ellipse eye = new Ellipse(0, 0, size, size);
        eye.setFillColor(Color.black);
        return eye;
    }

    private static Rectangle createWinkingEye(double size) {
        comp127graphics.Rectangle eye = new comp127graphics.Rectangle(0, 0, size, size/5);
        eye.setFillColor(Color.black);
        eye.setStrokeWidth(4);
        return eye;
    }
}
