import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn = new Scanner(System.in);
        String sentence = scn.nextLine();
        // we will use a delimiter to parttion the string between separate words
        String[] arr = sentence.split(" "); // the array will store separate words in the sentence string
        String ans = ""; // default string to be returned/added to the sentence for output as a sentence having each word reversed
        
        for(int i = 0; i < arr.length; i++){
            String temp = arr[i]; // store current word
            String defaultString = ""; // store reverse version of word
            
            for(int j = temp.length() - 1; j >= 0; j--){
                defaultString += temp.charAt(j);
            }
            ans += defaultString + " ";
        }
        System.out.println(ans);
    }
}
