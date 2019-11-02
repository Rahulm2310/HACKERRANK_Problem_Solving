import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

   
    static int[] breakingRecords(int[] scores) {
    
       
        int max=scores[0],min=scores[0];
        int maxcount=0,mincount=0;
        int arr[]=new int[2];
        
        
        for(int i=1;i<scores.length;i++)
        {
        
            if(scores[i]>max)
            {
                maxcount++;
                max=scores[i];
            }
            

            else if(scores[i]<min)
            {
                mincount++;
                min=scores[i];
            }
            
        }
        
        arr[0]=maxcount;
        arr[1]=mincount;
        
        
        return arr;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    
    
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        for (int i = 0; i < n; i++) 
        {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }
        

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
        
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
                
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
        
    }
}
 
