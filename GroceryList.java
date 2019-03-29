
/**
 * Write a description of class GroceryList here.
 * 
 * @author Luke Bradaric
 * @version (a version number or a date)
 */
public class GroceryList
{
    double item1;
    double item2;
    double item3;
    double item4;
    double item5;
    
    public GroceryList()
    {
        item1 = 2.59;
        item2 = 5.25;
        item3 = 6.34;
        item4 = 4.50;
        item5 = 8.72;
    }
    
    public GroceryList(double i1, double i2, double i3, double i4, double i5)
    {
        item1 = i1;
        item2 = i2;
        item3 = i3;
        item4 = i4;
        item5 = i5;
    }
    
    public void PrintCosts()
    {
        System.out.println("Enter item #1: " + item1);
        System.out.println("Enter item #2: " + item2);
        System.out.println("Enter item #3: " + item3);
        System.out.println("Enter item #4: " + item4);
        System.out.println("Enter item #5: " + item5);
        
        System.out.printf("%-5s", "#1");
        System.out.printf("%-7s", item1);
        System.out.printf("%-5s", item1 + "\n");
        
        System.out.printf("%-5s", "#2");
        System.out.printf("%-7s", item2);
        double tot2 = item1 + item2;
        System.out.printf("%-5s", tot2 + "\n");
        
        System.out.printf("%-5s", "#3");
        System.out.printf("%-7s", item3);
        double tot3 = item1 + item2 + item3;
        System.out.printf("%-6s", tot3 + "\n");
        
        System.out.printf("%-5s", "#4");
        System.out.printf("%-7s", item4);
        double tot4 = item1 + item2 + item3 + item4;
        System.out.printf("%-6s", tot4 + "\n");
        
        System.out.printf("%-5s", "#5");
        System.out.printf("%-7s", item5);
        double tot5 = item1 + item2 + item3 + item4 + item5;
        System.out.printf("%-7s", tot5 + "\n");
        
    }
}
