
/**
 * Write a description of class PiggyBank here.
 *
 * @author Luke Bradaric
 * @version (a version number or a date)
 */
public class PiggyBank
{
    // instance variables - replace the example below with your own
    private int pennies;
    private int dimes;
    private int nickels;
    private int quarters;

    /**
     * Constructor for objects of class PiggyBank
     */
    public PiggyBank()
    {
    }
    
    public PiggyBank(int quarter, int dime, int nickel, int penny)
    {
        quarters = quarter;
        dimes = dime;
        nickels = nickel;
        pennies = penny;
    }
    
    public void addBalance(int quarter, int dime, int nickel, int penny)
    {
        quarters += quarter;
        dimes += dime;
        nickels += nickel;
        pennies += penny;
    }
    
    public void withdrawBalance()
    {
        
    }
    
    public double getBalance()
    {
       double balance = (quarters * 25) + (dimes * 10) + (nickels * 5) + (pennies * 01);
       return balance / 100;
    }
    
    public void getCoins()
    {
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }
    
    
    public void addCashBalance(double amount)
    {
        quarters += (amount / .25);
        double r2 = amount % .25;
        dimes += (r2 / .10);
        double r3 = r2 % .10;
        nickels += (r3 / .05);
        double r4 = r3 % .05;
        pennies += (r4 / .01);
    }
    
}
