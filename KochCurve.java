
/**
 * Write a description of class KochCurve here.
 * 
 * @author Luke Bradaric
 * @version (a version number or a date)
 */
import gpdraw.*;
public class KochCurve
{
    private DrawingTool pen;

    KochCurve(){
        pen = new DrawingTool();
        pen.turnRight(90);
    }

    private void drawKochCurve(int level, double length){

        if(level < 1){
            pen.down();
            pen.forward(length);
        }
        else{
            pen.up();
            drawKochCurve(level-1, length/3);
            pen.turnLeft(60);
            drawKochCurve(level-1, length/3);
            pen.turnRight(120);
            drawKochCurve(level-1, length/3);
            pen.turnLeft(60);
            drawKochCurve(level-1, length/3);
        }
    }

    public void drawCurve(int level, double length)
    {
        drawKochCurve(level, length);
        pen.turnRight(120);
        drawKochCurve(level, length);
        pen.turnRight(120);
        drawKochCurve(level, length);
    }
}
