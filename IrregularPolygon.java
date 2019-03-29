
import java.awt.geom.*;  // for Point2D.Double
import java.util.ArrayList;      // for ArrayList
import gpdraw.*;        // for DrawingTool 

public class IrregularPolygon{
    private ArrayList<Point2D.Double> myPolygon = new ArrayList<Point2D.Double>();
    private DrawingTool pen = new DrawingTool(new SketchPad(500, 500));

    // constructors
    public IrregularPolygon() {
    }

    public void tester(){
        add(20, 10);
        add(70, 20);
        add(50, 50);
        add(0, 40);
    }

    // public methods
    public void add(double aPoint, double bPoint) {
        Point2D.Double Point = new Point2D.Double(aPoint, bPoint);
        myPolygon.add(Point);
    }

    public void draw() {  
        pen.down();
        for(int i = 0; i < myPolygon.size(); i++){
            pen.move(myPolygon.get(i).getX(), myPolygon.get(i).getY());
            pen.drawCircle(.5);
        }
        pen.move(myPolygon.get(0).getX(), myPolygon.get(0).getY());
    }

    public double perimeter() { 
        float Perimeter = 0;
        for(int i = 0; i < myPolygon.size()-1; i++){
            Perimeter += myPolygon.get(i).distance(myPolygon.get(i+1));
            if(i + 2 == myPolygon.size()){
                Perimeter += myPolygon.get(i+1).distance(myPolygon.get(0));
            }
        }
		return Perimeter;
    }

    public double area() {   
        float Area = 0;
        for(int i = 0; i < myPolygon.size(); i++){
            Area += myPolygon.get(i).getX() * myPolygon.get(i + 1).getY() - myPolygon.get(i).getY() * myPolygon.get(i + 1).getX();
        }
        return Math.abs(Area / 2);
    }
}

