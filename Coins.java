
/**
 * Write a description of class Coins here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Coins
{
    int Quarters;
    int Dimes;
    int Nickels;
    int Pennies;
    
    public void Coins(int cents)
    {
        
        Quarters = cents / 25;
        int r1 = cents % 25;
        Dimes = r1 / 10;
        int r2 = r1 % 10;
        Nickels = r2 / 5;
        int r3 = r2 % 5;
        Pennies = r3 / 1;
        
        System.out.println("Quarters: " + Quarters);
        System.out.println("Dimes: " + Dimes);
        System.out.println("Nickels: " + Nickels);
        System.out.println("Pennies: " + Pennies);
    }
    
    public void CoinsLoop(int cents)
    {
        Quarters = 0;
        Dimes = 0;
        Nickels = 0;
        Pennies = 0;
        
        while (cents >= 25){
            cents -= 25;
            Quarters += 1;
        }
        while (cents >= 10){
            cents -= 10;
            Dimes += 1;
        }
        while (cents >= 5){
            cents -= 5;
            Nickels += 1;
        }
        while (cents >= 1){
            cents -= 1;
            Pennies += 1;
        }
        
        System.out.println("Quarters: " + Quarters);
        System.out.println("Dimes: " + Dimes);
        System.out.println("Nickels: " + Nickels);
        System.out.println("Pennies: " + Pennies);
    }
    


}
