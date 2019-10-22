import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    
    static int utopianTree(int n) 
    {
        int cycles=1;
        int height=1;
        
        while(cycles<=n)
        {
            
            if(cycles%2!=0)
            {
                
                height=height*2;
                
            }

            else if(cycles%2==0)
            {
                
                height++;
                
            }
            
            cycles++;
        }

        return height;


    }
    
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException
    {
        
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        

        for (int tItr = 0; tItr < t; tItr++)
        {
            
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = utopianTree(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
            
        }

        bufferedWriter.close();

        scanner.close();
        
        
    }
}
