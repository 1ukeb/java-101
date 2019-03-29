
//Luke Bradaric
import gpdraw.*;
public class ParallelLines
{
    private DrawingTool pen;
    private SketchPad paper;
    public ParallelLines()
    {
        pen = new DrawingTool();
        one(-100, 100);
        one(-90, 70);
        one(-80, 40);
        one(-90, 10);
        one(-100, -20);
        one(-90, -50);
        one(-80, -80);
        one(-90, -110);

    }
    
    private void one(int x, int y){
        //pen.setDirection(0);
        pen.up();
        pen.move(x, y);
        pen.down();
        for(int row = 0; row < 7; row++){
            pen.down();
            pen.fillRect(30,30);
            pen.up();
            pen.setDirection(0);
            pen.move(60);
        }
        
        pen.move(-115, y - 15);
        pen.down();
        pen.setDirection(0);
        pen.forward(420);
        pen.up();
    }

    private void reset(){
        pen.up();
        pen.move(-100, 100);
    }
}
