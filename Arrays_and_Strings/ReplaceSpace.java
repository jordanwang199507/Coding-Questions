import java.util.Arrays;

public class ReplaceSpace{
    public static void replaceSpaces(char[]str, int length){
        int spaceCount = 0;
        int newLength = 0;
        for (int i = 0; i < length; i++){
            if(str[i]== ' '){
                spaceCount++;
            }
        }
        newLength = length + spaceCount*2;
        int totalLength = newLength;
        char [] replace = new char [totalLength+1];
        
        replace[newLength]='\0';
        for(int i =length-1;i>=0;i--){
            if(str[i]== ' '){
                replace[newLength-1] = '0';
                replace[newLength-2] = '2';
                replace[newLength-3] = '%';
                newLength = newLength - 3;
            } else{
                replace[newLength-1]= str[i];
                newLength = newLength - 1;
            }
        }
        System.out.println("Replace Space string: ");
        for(int i =0;i<=totalLength;i++){
            System.out.print(replace[i]);
        }
        System.out.println();   
    }

    public static void main (String[]args){
        String testString = "Mr John Smith";
        char[] stringToCharArray = testString.toCharArray();
        replaceSpaces(stringToCharArray, testString.length());

        String testString2 = "Hello My Name Is";
        char[] stringToCharArray2 = testString2.toCharArray();
        replaceSpaces(stringToCharArray2, testString2.length());
    }
}