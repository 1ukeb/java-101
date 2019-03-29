
/**
 * Write a description of class GraphicPolygon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import gpdraw.*;
public class GraphicPolygon extends RegularPolygon
{
    private DrawingTool pen = new DrawingTool(new SketchPad(400, 400));
    private double xPosition, yPosition;

    public GraphicPolygon(int numSides, double sideLength)
    {
       super(numSides, sideLength);
       xPosition = 0;
       yPosition = 0;
    }
    
    public GraphicPolygon(int numSides, double sideLength, double x, double y)
    {
        super(numSides, sideLength);
        xPosition = x;
        yPosition = y;
    }
    
    public void moveTo(double x, double y){
        pen.up();
        pen.move(x,y);
        pen.down();
    }
    
    public void draw(){
        moveTo(xPosition, yPosition);
        double numSide = super.getNumSide();
        double sideLen = super.getSideLength();
        double radius = super.getr();
        //double vertAng = super.vertexAngle();
        double vertAng = 360/numSide;
        drawPoly(numSide, sideLen, vertAng);
        
    }
    
    private void drawPoly(double level, double length, double vertex){
        if(level < 1){
            pen.forward(length);
        }
        else{
            pen.forward(length);
            pen.turnLeft(vertex);
            drawPoly(level - 1, length, vertex);
        }
    }
}
