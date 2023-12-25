import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
        HashSet<Character> s = new HashSet<>();
        
        Scanner scn = new Scanner(System.in);
        
        String str = scn.next();
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            
            if(s.contains(ch)){
                continue;
            }else {
                System.out.print(ch);
                s.add(ch);
            }
        }
        
    }
}
