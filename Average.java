
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Average
{
    int counter = 0;
    int total = 0;

    public Average()
    {
        try{
            File numbers = new File("numbers.txt");
            Scanner sc = new Scanner(numbers);

            while(sc.hasNextLine()){
                //System.out.println(sc.nextLine());
                counter++;
                if(sc.hasNextLine())
                total += Integer.parseInt(sc.nextLine());
            }
            
            System.out.println("Lines : " + counter + " Total : " + total);
            System.out.println("Average : " + total/counter);
        }catch(IOException i){
            System.out.println("Error : " + i.getMessage());
        }
    }

}
