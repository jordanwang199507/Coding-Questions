// Implement an algorithm to determine if a string has all unique characters. 
// What if you cannot use additional data source

// 1st: ask interviewer if string is ASCII string or Unicode string

public class StringUnique{
    public static boolean isUniqueChars(String str){
        if(str.length()>128) return false;

        boolean[] char_set = new boolean[128];
        for(int i =0; i < str.length(); i++){
            int val = str.charAt(i);
            System.out.println(val);
            if(char_set[val]){
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    public static void main(String[]args){
        String str = "abcdefgh";
        boolean result = isUniqueChars(str);
        System.out.println("string is unique: "+result);
        
        String str1 = "1 1 1 1 sdfsgdfgsdfasd";
        boolean result1 = isUniqueChars(str1);
        System.out.println("string 1 is unique: "+result1);
    }
}