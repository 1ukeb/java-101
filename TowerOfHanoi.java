
//Luke Bradaric
import java.util.Scanner;
public class TowerOfHanoi
{
    private int a1;
    private int a2;
    private int a3;
    private int b1;
    private int b2;
    private int b3;
    private int c1;
    private int c2;
    private int c3;

    private int temp;
    private int tempNum;

    private int Cl;
    private int moveCl;
    private Scanner sc;

    public TowerOfHanoi()
    {
        sc = new Scanner(System.in);
        a1 = 1;
        a2 = 2;
        a3 = 3;
        b1 = 0;
        b2 = 0;
        b3 = 0;
        c1 = 0;
        c2 = 0;
        c3 = 0;
    }

    public void Play()
    {
        Display();
    }

    private void Take(int num)
    {
        if (num == 1){
            if (a1 != 0)
                temp = a1;
            else if (a2 != 0)
                temp = a2;
            else if (a3 != 0)
                temp = a3;
            else
                System.out.println("Column empty or an error has occured!");
        }
        else if (num == 2){
            if (b1 != 0)
                temp = b1;
            else if (b2 != 0)
                temp = b2;
            else if (b3 != 0)
                temp = b3;
            else
                System.out.println("Column empty or an error has occured!");
        }
        else if (num == 3){
            if (c1 != 0)
                temp = c1;
            else if (c2 != 0)
                temp = c2;
            else if (c3 != 0)
                temp = c3;
            else
                System.out.println("Column empty or an error has occured!");
        }
        else{
            System.out.println("Error in your code, retard");
            Display();
        }
    }

    private void oldTake(int num)
    {
        if (num == 1){
            if (a1 != 0)
                a1 = 0;
            else if (a2 != 0)
                a2 = 0;
            else if (a3 != 0)
                a3 = 0;
            else
                System.out.println("Column empty or an error has occured!");
        }
        else if (num == 2){
            if (b1 != 0)
                b1 = 0;
            else if (b2 != 0)
                b2 = 0;
            else if (b3 != 0)
                b3 = 0;
            else
                System.out.println("Column empty or an error has occured!");
        }
        else if (num == 3){
            if (c1 != 0)
                c1 = 0;
            else if (c2 != 0)
                c2 = 0;
            else if (c3 != 0)
                c3 = 0;
            else
                System.out.println("Column empty or an error has occured!");
        }
        else{
            System.out.println("Error in your code, retard");
            Display();
        }
    }

    private void Place(int num)
    {
        if(num == 1){
            if(a3 == 0){
                a3 = temp;
                temp = 0;
                oldTake(tempNum);
                Display();
            }
            else if(a2 == 0 && a3 > temp){
                a2 = temp;
                temp = 0;
                oldTake(tempNum);
                Display();
            }
            else if(a1 == 0 && a3 > temp && a2 > temp){
                a1 = temp;
                temp = 0;
                oldTake(tempNum);
                Display();
            }
            else{
                Display2();
            }		
        }
        else if(num == 2){
            if(b3 == 0){
                b3 = temp;
                temp = 0;
                oldTake(tempNum);
                Display();
            }
            else if(b2 == 0 && b3 > temp){
                b2 = temp;
                temp = 0;
                oldTake(tempNum);
                Display();
            }
            else if(b1 == 0 && b3 > temp && b2 > temp){
                b1 = temp;
                temp = 0;
                oldTake(tempNum);
                Display();
            }
            else{
                Display2();
            }
        }
        else if(num == 3){
            if(c3 == 0){
                c3 = temp;
                temp = 0;
                oldTake(tempNum);
                Display();
            }
            else if(c2 == 0 && c3 > temp){
                c2 = temp;
                temp = 0;
                oldTake(tempNum);
                Display();
            }
            else if(c1 == 0 && c3 > temp && c2 > temp){
                c1 = temp;
                temp = 0;
                oldTake(tempNum);
                Display();
            }
            else{
                Display2();
            }
        }
        else{
            System.out.println("Can't do that");
        }

    }

    private void Display()
    {
        if(a1 == 0 && a2 == 0 && a3 == 0 && b1 == 0 && b2 == 0 && b3 == 0 && c1 == 1 && c2 == 2 && c3 == 3){
            System.out.println(a1 + " " + b1 + " " + c1);
            System.out.println(a2 + " " + b2 + " " + c2);
            System.out.println(a3 + " " + b3 + " " + c3);
            System.out.println("You win!");
        }
        else{
            System.out.println(a1 + " " + b1 + " " + c1);
            System.out.println(a2 + " " + b2 + " " + c2);
            System.out.println(a3 + " " + b3 + " " + c3);
            System.out.println("Input the column you would like to move : ");
            Cl = sc.nextInt();
            tempNum = Cl;
            Take(Cl);
            System.out.println("Input the column you would like to move to : ");
            moveCl = sc.nextInt();
            Place(moveCl);
        }
    }

    private void Display2()
    {
        System.out.println("Can't make that move.");
        Display();
    }

}
