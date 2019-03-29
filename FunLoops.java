
//Luke Bradaric
public class FunLoops
{
    int sum;
    int sumCount;
    int sqCount;
    int mgSqFound;
    

    public FunLoops()
    {

    }

    public void MagicSquare(int findThese){
        while(sqCount <= findThese){
            if(Math.sqrt(sqCount) == sum){
                System.out.println(Math.sqrt(sqCount));
                mgSqFound++;
                sqCount++;
            }
            else if(sum < Math.sqrt(sqCount)){
                sum+=sumCount;
                sumCount++;
            }
            else{
                sqCount++;
            }
        }
    }
    
    public void LCM(int one, int two){
        int counter = 1;
        boolean counting = true;
        while(counting == true){
            if(counter % one == 0 && counter % two == 0){
               counting = false;
               System.out.println(counter + " is the LCM");
            }
            else{
                counter++;
            }
        }
    }
}

