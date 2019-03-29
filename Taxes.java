
/**
 * Write a description of class Taxes here.
 *
 * @author Luke Bradaric
 * @version (a version number or a date)
 */
public class Taxes
{
    final double fedTax = .154;
    final double ficTax = .0775;
    final double staTax = .04;
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Taxes
     */
    public Taxes(double hours, double hourlyRate)
    {
        double grossPay = hours * hourlyRate;
        System.out.println("Gross Pay : " + grossPay);
        System.out.println();
        double federalTax = grossPay * fedTax;
        System.out.println("Federal Tax : " + federalTax);
        double ficaTax = grossPay * ficTax;
        System.out.println("FICA Tax : " + ficaTax);
        double stateTax = grossPay * staTax;
        System.out.println("State Tax : " + stateTax);
        System.out.println();
        
        double netPay = grossPay - federalTax - ficaTax - stateTax;
        
        System.out.println("Net Pay : " + netPay);
    }

}
