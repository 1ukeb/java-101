
/**
 * Write a description of class RegularPolygon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RegularPolygon
{
    // instance variables - replace the example below with your own
    private double myNumSides;
    private double mySideLength;
    private double myR;
    private double myr;

    public RegularPolygon()
    {
        //myNumSides = 3;
    }
    
    public RegularPolygon(int numSides, double sideLength)
    {
        myNumSides = numSides;
        mySideLength = sideLength;
        
    }
    
    public void calcr()
    {
        myr = .5 * mySideLength * (Math.tan(Math.PI / myNumSides));
    }
    
    public void calcR()
    {
        myR = .5 * mySideLength * 1.0/(Math.sin(Math.PI / myNumSides));
    }

    public double vertexAngle()
    { 
        double vertAngle = ((myNumSides - 2) / myNumSides ) * 180;
        System.out.println(vertAngle);
        return vertAngle;
    }
    
    public double Perimeter()
    { 
        double perimeter = myNumSides * mySideLength;
        System.out.println(perimeter);
        return perimeter;
    }
    
    public double Area()
    {
        double area = .5 * myNumSides * myR * myR * (Math.sin((2 * Math.PI) / myNumSides));
        System.out.println(area);
        return area;
    }
    
    public double getNumSide()
    { 
        System.out.println(myNumSides);
        return myNumSides;
    }
    
    public double getSideLength()
    { 
        System.out.println(mySideLength);
        return mySideLength;
    }
    
    public double getr()
    {
        System.out.println(myr);
        return myr;
    } 
    
    public double getR()
    { 
        System.out.println(myR);
        return myR;
    }
}
