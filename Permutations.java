
import java.util.ArrayList;
import java.util.*;
public class Permutations
{

    public Permutations(){
    }

    public static void main (String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> printNum = new ArrayList<Integer>();
        for(int a = 0; a <= 10; a++){
            for(int i = 1; i <= 10; i++){
                numbers.add(i);
            }
            System.out.print("List " + a + " : ");
            for(int i = 10; i >= 1; i--){
                Random random = new Random();
                int c = random.nextInt(i);
                printNum.add(numbers.get(c));
                numbers.remove(c);
            }
            for(int i = 10; i >= 1; i--){
                System.out.print(printNum.get(i-1) + " ");
                printNum.remove(i-1);
            }
            System.out.println();
        }
    }
}

