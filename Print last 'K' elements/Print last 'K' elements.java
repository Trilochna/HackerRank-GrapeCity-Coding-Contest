import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = scn.nextInt();
        }
        int K = scn.nextInt();
        
        for(int j = arr.length - K; j < N; j++){
            System.out.print(arr[j] + " ");
        }
    }
}
