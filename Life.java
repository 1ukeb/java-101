import java.util.*;
import java.io.*;
//Luke Bradaric
public class Life
{
    private int bacteriaNum = 0;
    //public ArrayList<Bacteria> bacteria = new ArrayList<Bacteria>();

    String[][] table = new String[22][22];
    String[][] table2 = new String[22][22];

    private boolean onTable = false;
    private int overallCount = 0;

    public Life(){
        try{
            Initial();
            Scanner inFile = new Scanner(new File("life100.txt"));
            bacteriaNum = inFile.nextInt();
            //counter for scanner
            int count = -1;
            //checks if x and y have been created
            int doub = 0;
            //temporary x and y values to be added to table
            int x = 0;
            int y = 0;
            while(inFile.hasNext()){
                if(count < 0){
                    int num = inFile.nextInt();
                    //this just skips the first number
                }else{
                    //if even number    
                    if(count%2 == 0){
                        y = inFile.nextInt();
                        doub++;
                    }else{
                        x = inFile.nextInt();
                        doub++;
                    }
                }

                if(doub==2){
                    table[x][y] = "x";
                    doub = 0;
                }

                count++;
            }
            for(int i = 0; i < 20; i++){
                for(int a = 0; a < 20; a++){       
                    if(a == 19)
                        System.out.println(table[i][a]);
                    else
                        System.out.print(table[i][a]);
                }
            }
        }catch(IOException i){
            System.out.println(i);
        }
        testLife();
    }

    public void testLife(){
        if(overallCount < 7){
            for(int i = 0; i < 20; i++){
                for(int a = 0; a < 20; a++){
                    //checks each slot
                    if(!onTable){
                        if(checkCount(i,a)){
                            table2[i][a] = "x";
                        }else{
                            table2[i][a] = " ";
                        }
                    }else if(onTable){
                        if(checkCount(i,a)){
                            table[i][a] = "x";
                        }else{
                            table[i][a] = " ";
                        }
                    }

                    //still need to replace each slot in new table with new values
                }
            }
            for(int i = 0; i < 20; i++){
                for(int a = 0; a < 20; a++){
                    if(!onTable){
                        if(a == 19)
                            System.out.println(table2[i][a]);
                        else
                            System.out.print(table2[i][a]);
                    }else if(onTable){
                        if(a == 19)
                            System.out.println(table[i][a]);
                        else
                            System.out.print(table[i][a]);
                    }
                }
            }
            overallCount++;
            onTable = !onTable;
            System.out.println("it ran " + overallCount + " times - 1");
            testLife();
        }else{
            System.out.println("done");
        }
        
    }

    public boolean checkCount(int x, int y){
        //checks each space
        int bacCount = 0;
        for(int i = -1; i < 2; i++){
            for(int a = -1; a < 2; a++){
                if(table[x+i][y+a] == "x" && !onTable){
                    bacCount++;
                }else if(table2[x+i][y+a] == "x" && onTable){
                    bacCount++;
                }
            }
        }
        if(bacCount == 3){
            return true;
        }else{
            return false;
        }
    }

    public void Initial(){
        for(int i = 0; i < 21; i++){
            for(int a = 0; a < 21; a++){       
                table[i][a] = " ";
                table2[i][a] = " ";
            }
        }
    }
}
