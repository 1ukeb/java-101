
/**
 * Write a description of class Compact here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.util.Scanner;
import java.io.*;
public class Compact
{
    private String fileLocation;

    /**
     * Constructor for objects of class Compact
     */
    public Compact()
    {
        fileLocation = "D:\\Comp Sci\\Comp Sci\\compact.txt";
        Scanner in;
        int[] numbers = new int[20];
        try{
            in = new Scanner(new File(fileLocation));
            int count = 0;
            while(in.hasNextInt()){
                int num = in.nextInt();
                if(num != 0){
                    numbers[count] = num;
                    count++;
                }
            }
        }
        catch(IOException i){
            System.out.println("Error: " + i.getMessage());
        }
        for(int i = 0; i < numbers.length; i++){  
            if(numbers[i] != 0){
                System.out.println(numbers[i]);
            }
        }
        //            System.out.println(numbers[0]);
        //            System.out.println(numbers[1]);
        //            System.out.println(numbers[2]);
    }

}
