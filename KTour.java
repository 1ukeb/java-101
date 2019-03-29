//Luke Bradaric
import java.util.*;
import java.io.*;
public class KTour{

    public int[][] board = new int [8][8];
    int move = 1;

    int knightX = 0;
    int knightY = 0;

    public KTour(){
        for(int i = 0; i < 8; i++){
            for(int a = 0; a < 8; a++){
                board[i][a] = 0;
            }
        }
        Print();
    }

    public void Move(){
        Random num = new Random();
        int ranNum = num.nextInt(8);
        
        switch(ranNum){
            case 0:
            newMove(1,-2);
            break;
            case 1:
            newMove(2,-1);
            break;
            case 2:
            newMove(2,1);
            break;
            case 3:
            newMove(1,2);
            break;
            case 4:
            newMove(-1,2);
            break;
            case 5:
            newMove(-2,1);
            break;
            case 6:
            newMove(-2,-1);
            break;
            case 7:
            newMove(-1,-2);
            break;
        }

        System.out.println("Ran!");
    }
    
    void newMove(int x, int y){
        int newX = knightX + x;
        int newY = knightY + y;
        if(board[newX][newY] == 0){
            move++;
            board[newX][newY] = move;
            knightX = newX;
            knightY = newY;
            Print();
        }else{
            Move();
        }
    }

    void Print(){
        board[0][0] = 1;
        for(int i = 0; i < 8; i++){
            for(int a = 0; a < 8; a++){
                System.out.print(board[i][a]);
                System.out.print("      ");
                if(a == 7){
                    System.out.println();
                    System.out.println();
                }
            }
        }
    }

}
