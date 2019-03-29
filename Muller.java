
/**
 * Write a description of class Muller here.
 *
 * @author Luke Bradaric
 * @version (a version number or a date)
 */
import gpdraw.*;
public class Muller
{
    // instance variables - replace the example below with your own
    private SketchPad paper;
    private DrawingTool pen;

    /**
     * Constructor for objects of class Muller
     */
    public Muller()
    {
        pen = new DrawingTool();
    }

    private void drawHoriz(int x, int y)
    {
       pen.up();
       pen.move(x, y);
       pen.down();
       pen.setDirection(180);
       pen.forward(60); 
    }
    
    private void drawDiag(int x, int y, int dir, int l)
    {
        pen.up();
        pen.move(x,y);
        pen.down();
        pen.setDirection(dir);
        pen.forward(l);
    }
    
    public void drawMuller()
    {
       drawHoriz(0,0);
       
       drawDiag(0,0,-155,15);
       drawDiag(0,0,155,15);
       drawDiag(-60,0,155,-15);
       drawDiag(-60,0,-155,-15);
       
       drawHoriz(0, -30);
       
       drawDiag(0,-30,-155,-15);
       drawDiag(0,-30,155,-15);
       drawDiag(-60,-30,-155,15);
       drawDiag(-60,-30,155,15);
    }
    
    public void drawPonzo()
    {
       drawDiag(-120, 0, -130, -500);
       drawDiag(-120, 0, -140,   -500);
       drawDiag(-120, 0, -150, -500);
       drawDiag(-120, 0, -160, -500);
       drawDiag(-120, 0, -170, -500);
       drawDiag(-120, 0, -180, -500);
       drawDiag(-120, 0, -190, -500);
       drawDiag(-120, 0, -200, -500);
       drawDiag(-120, 0, -210, -500);
       drawDiag(-120, 0, -220, -500);
       drawDiag(-120, 0, -230, -500);
       drawDiag(0,30,90,-80);
       drawDiag(-60,30,90,-80);
    }
    
    public void vertLines()
    {
        drawDiag(0,0,90,-30);
        drawDiag(-60,0,90,-30);
    }
    
}
