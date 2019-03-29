
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import gpdraw.*;

public class Rectangle{

    // instance variables - replace the example below with your own
    private double myX;
    private double myY;
    private double myWidth;
    private double myHeight;
    private DrawingTool pen;
    private SketchPad paper;

    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle()
    {
        
    }
    
    public Rectangle(double x, double y, double width, double height)
    {
        myX = x;
        myY = y;
        myWidth = x += width;
        myHeight = y += height;
        pen = new DrawingTool();
    }

    public double getPerimeter()
    {
        double perimeter = myWidth + myWidth + myHeight + myHeight;
        return perimeter;
    }
    
    public double getArea()
    {
        double area = myWidth * myHeight;
        return area;
    }
    
    public void draw()
    {
        
        pen.up();
        pen.move(myX, myY);
        pen.down();
        pen.drawRect(myWidth, myHeight);
        
        /*
        pen = new DrawingTool();
        pen.move(myX, myY);
        pen.forward(myWidth);
        pen.turnLeft(90);
        pen.forward(myHeight);
        pen.turnLeft(90);
        pen.forward(myWidth);
        pen.turnLeft(90);
        pen.forward(myHeight);
        */
    }
}
