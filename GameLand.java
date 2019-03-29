
//Luke Bradaric
import java.util.concurrent.ThreadLocalRandom;
public class GameLand
{
    private int player1;
    private int player2;
    private boolean oneTurn;

    public GameLand()
    {
    }

    private void Print()
    {
        System.out.println("Player1 is on space " + player1);
        System.out.println("Player2 is on space " + player2);
    }

    private void Check(){
        if(player1 >= 100){
            System.out.println("Player1 wins!");
        }else if(player2 >= 100){
            System.out.println("Player2 wins!");
        }else{
        }

    }

    public void player1Roll(){
        if(oneTurn == true){
            int roll = ThreadLocalRandom.current().nextInt(1, 12 + 1);
            System.out.println("Rolled a " + roll);
            if(roll == 2 || roll == 12){
                System.out.println("Player1 lost this turn");
            }else if(roll == 7){
                System.out.println("Player1 moves backwards 7 spaces");
                player1 -= 7;
                if(player1 <= 0)
                    player1 = 0;
            }else{
                player1 += roll;
            }
            
            if(player1 == player2){
                System.out.println("You landed on the other players square and bumped them back to start!");
                player2 = 0;
            }
            
            Print();
            Check();
            oneTurn = false;
        }else
            System.out.println("Not your turn");
    }

    public void player2Roll(){
        if(oneTurn == false){
            int roll = ThreadLocalRandom.current().nextInt(1, 12 + 1);
            System.out.println("Rolled a " + roll);
            if(roll == 2 || roll == 12){
                System.out.println("Player2 lost this turn");
            }else if(roll == 7){
                System.out.println("Player2 moves backwards 7 spaces");
                player2 -= 7;
                if(player1 <= 0)
                    player2 = 0;
            }else{
                player2 += roll;
            }
            
            if(player1 == player2){
                System.out.println("You landed on the other players square and bumped them back to start!");
                player1 = 0;
            }
            
            Print();
            Check();
            oneTurn = true;
        }else
            System.out.println("Not your turn");
    }
}
