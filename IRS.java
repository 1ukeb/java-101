
/**
 * Write a description of class IRS here.
 * 
 * @author Luke Bradaric 
 * @version (a version number or a date)
 */
public class IRS
{
    int SorM;
    double taxInc;
    double fedTax;
    
    public IRS(){}
    
    public IRS(int singleOrMarried, double taxableIncome)
    {
        SorM = singleOrMarried;
        taxInc = taxableIncome;
        runTax();
    }
    
    public void newV(int singleOrM, double taxableIncome)
    {
        SorM = singleOrM;
        taxInc = taxableIncome;
        runTax();
    }
    
    private void runTax()
    {
        if (SorM == 1)
        {
            if (taxInc > 0 && taxInc < 27050)
            {
                fedTax = taxInc * .15;
            }
            else if (taxInc > 27050 && taxInc < 65550)
            {
                fedTax = 4057.50 + (taxInc * .275);
            }
            else if (taxInc > 65550 && taxInc < 136750)
            {
                fedTax = 14645 + (taxInc * .305);
            }
            else if (taxInc > 136750 && taxInc < 297350)
            {
                fedTax = 36361 + (taxInc * .355);
            }
            else if (taxInc > 297350)
            {
                fedTax = 93374 + (taxInc * .391);
            }
            
            System.out.println("Single");
        }
        if (SorM == 2)
        {
            if (taxInc > 0 && taxInc < 45200)
            {
                fedTax = taxInc * .15;
            }
            else if (taxInc > 45200 && taxInc < 109250)
            {
                fedTax = 6780 + (taxInc * .275);
            }
            else if (taxInc > 109250 && taxInc < 166500)
            {
                fedTax = 24393.75 + (taxInc * .305);
            }
            else if (taxInc > 166500 && taxInc < 297350)
            {
                fedTax = 41855 + (taxInc * .355);
            }
            else if (taxInc > 297350)
            {
                fedTax = 88306 + (taxInc * .391);
            }
            
            System.out.println("Married");
        }
        
        System.out.println("Taxable Income: " + taxInc);
        System.out.println("Federal Tax: " + fedTax);
    }

}
