import java.util.*;
import java.io.*;
import java.text.*;
public class CountWords
{
    public ArrayList<String> words = new ArrayList<String>();
    public ArrayList<String> newWords = new ArrayList<String>();
    public ArrayList<Integer> wordCount = new ArrayList<Integer>();

    public CountWords(String fName){
        scanFile(fName);
    }

    void scanFile(String fileName){
        try{
            Scanner inFile = new Scanner(new File(fileName));
            inFile.useDelimiter("\\Z");
            String text = inFile.next();
            System.out.println("Test: " + text);
            BreakIterator breakIterator = BreakIterator.getWordInstance();
            breakIterator.setText(text);
            int lastIndex = breakIterator.first();
            while(BreakIterator.DONE != lastIndex){
                int firstIndex = lastIndex;
                lastIndex = breakIterator.next();
                if(lastIndex != BreakIterator.DONE && Character.isLetterOrDigit(text.charAt(firstIndex))){
                    words.add(text.substring(firstIndex, lastIndex));
                }
            }
        }catch(IOException i){
            System.out.println("Error: " + i.getMessage());
        }

        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        System.out.println(words);
        CheckArray();
    }

    private void CheckArray(){
        newWords.add(words.get(0));
        wordCount.add(1);
        boolean existed = false;
        for(int i = 1; i < words.size(); i++){
            int count = 0;
            for(int i2 = 0; i2 < newWords.size(); i2++){
                if(words.get(i).equals(newWords.get(i2))){
                    wordCount.set(i2, wordCount.get(i2)+1);
                    existed = true;
                }
            }
            if(!existed){
                newWords.add(words.get(i));
                wordCount.add(1);
            }
            existed = false;
        }
        System.out.println(wordCount);
        System.out.println(newWords);
    }
}
