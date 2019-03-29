
//Luke Bradaric
import java.util.*;
public class Numbers
{
    ArrayList<Digit> digitList = new ArrayList<Digit>();
    
    public Numbers(){
        digitList.add(new Digit());
    }

    public Numbers(int newNumber, int newBase){
        digitList.add(new Digit(newNumber, newBase));
    }

    public - toStringOut(){
        System.out.println("Printing out result");
        int num = 482;
    }

    public void Increment(){
        for(int i = 0; i < digitList.size(); i++){
            digitList.get(i).increment();
        }
    }

}
