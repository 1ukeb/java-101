
/**
 * Write a description of class Car here.
 *
 * @author Luke Bradaric
 * @version (a version number or a date)
 */
public class Car
{
    // instance variables - replace the example below with your own
    public int myStartMiles;
    public int myEndMiles;
    private double myGallonsUsed;

    /**
     * Constructor for objects of class Car
     */
    public Car(int odometerReading)
    {
        myStartMiles = odometerReading;
    }
    
    public void fillUp(int odometerReading, double gallons)
    {
        myEndMiles = odometerReading;
        myGallonsUsed += gallons;
    }

    public double calculateMPG()
    {
        double MPG = (myEndMiles - myStartMiles) / myGallonsUsed;
        return MPG;
    }
    
    public void resetMPG(){
        myStartMiles = myEndMiles;
        myGallonsUsed = 0;
    }
}
