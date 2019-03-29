
//Luke Bradaric
public class StringUtil
{

    public StringUtil()
    {

    }

    public static String reverseString(String s)
    {
        int length = s.length();
        String front, back;
        if(length == 1){
            return s;
        }else{
            front = s.substring(0, 1);
            back = s.substring(1);
            return reverseString(back) + front;
        }

    }
    public static boolean stringIsPalindrome(String s)
    {
        String reversed = reverseString(s);
        //reversed.toLowerCase();
        //reversed.replaceAll("(?:--|[\\[\\]{}()+/\\\\])", "");
        if(s.equals(reversed)){
            return true;
        }else{
            return false;
        }
    }

    public static String stringToPiglatin(String s)
    {
        int length = s.length();
        return "e";
    }

    public static String shorthandString()
    {
        return "e";
    }
    
}
