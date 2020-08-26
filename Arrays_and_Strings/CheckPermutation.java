// Check permutation: given two strings, write a method to decide if one is permutation of the other
import java.util.Arrays;

public class CheckPermutation{
    public static String sort(String s){
        char tempArray[] = s.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    public static boolean permutation(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        return sort(s).equals(sort(t));
    }

    public static void main (String[]args){
        String s = "abcde";
        String t = "abcdef";
        boolean result = permutation(s, t);
        System.out.println("Is boolean: "+ result);
    }
}