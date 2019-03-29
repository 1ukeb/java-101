import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Squeeze
{

    int counter = 0;
    
    public Squeeze()
    {
        try{
            File squeeze = new File("squeeze.txt");
            Scanner sc = new Scanner(squeeze);
            while(sc.hasNextLine()){
                String s = sc.nextLine();
                char c = s.charAt(counter);
                while(c == ' '){
                    counter++;
                    c = s.charAt(counter);
                }
                System.out.println(s.substring(counter));
                counter = 0;
                
            }
        }catch(IOException i){
            System.out.println("Error : " + i.getMessage());
        }
    }

}
