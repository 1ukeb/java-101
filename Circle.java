
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import gpdraw.*;
public class Circle
{
    // instance variables - replace the example below with your own
    private double x;
    private double y;
    private double radius;
    private SketchPad paper;
    private DrawingTool pen;

    /**
     * Constructor for objects of class Circle
     */
    public Circle(double myX, double myY,double newRadi)
    {
        // initialise instance variables
        radius = newRadi;
        x = myX;
        y = myY;
        pen = new DrawingTool();
    }

    public void draw()
    {
        pen.up();
        pen.move(x, y);
        pen.down();
        pen.drawCircle(radius);
    }
}
