import java.util.Random;
public class Rolling
{
    private Random myDie;
    private int counter;
    
    public Rolling()
    {
        myDie = new Random();
    }
    
    public void rollDice(){
        int first = roll();
        int second = roll();
        int third = roll();
        
        System.out.println(first + " " + second + " " + third);
        counter++;
        if(first != second && first != third && third != second && third != first){
            System.out.println(counter + " attempt(s)");
        }else
        rollDice();
    }
    
    private int roll(){
        int num = myDie.nextInt(6) + 1;
        return num;
    }

}
