//Luke Bradaric
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;
public class Statistics
{

    static public void Statistics(){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //AVERAGE CODE
        int average = 0;
        int n = 0;
        double deviation = 0;
        try{
            Scanner in = new Scanner(new File("numbers.txt"));
            while(in.hasNext()){
                int line = in.nextInt();
                System.out.println(line);
                average += line; 
                n++;
                numbers.add(line);
                
            }
            average = average / n;
            System.out.println("Average is: " + average);
            //MODE CODE
            int mode = 0;
            int counter = 0;
            for(int i = 0; i < numbers.size(); i++){
                int scan1 = numbers.get(i);
                int count = 0;
                for(int i2 = 0; i2 < numbers.size(); i2++){
                    int scan2 = numbers.get(i2);
                    if(scan1 == scan2){
                        count++;
                    }
                }
                if(count > counter){
                    counter = count;
                    mode = scan1;
                }
            }
            System.out.println("Mode is " + mode);
        }
        catch(IOException i){
            System.out.println("Error: " + i.getMessage());
        }
        //DEVIATION CODE
        for(int i = 0; i < numbers.size(); i ++){
            deviation += Math.pow(numbers.get(i) - average, 2);
        }
        deviation = deviation  / (n - 1);  
        deviation = Math.sqrt(deviation);
        System.out.println("Standard Deviation: " + deviation);
    }

}


