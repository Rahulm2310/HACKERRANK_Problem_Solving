import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    
    static int[] circularArrayRotation(int[] a, int k, int[] queries)
    {

        int temp;
        
        if(a.length!=k)
        {
            
            for(int i=0;i<k;i++)
            {
                temp=a[a.length-1];
                
                    for(int j=(a.length)-1;j>=1;j--)
                    {
                        
                        a[j]=a[j-1];

                    }
                
                a[0]=temp;
                
            }
        }
        

        for(int l=0;l<queries.length;l++)
        {
            
            queries[l]=a[queries[l]];
            
        }

        return queries;

    }
    
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException
    {
        
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nkq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nkq[0]);

        int k = Integer.parseInt(nkq[1]);

        int q = Integer.parseInt(nkq[2]);

        int[] a = new int[n];

        
        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        
        for (int i = 0; i < n; i++) 
        {
            
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
            
        }

        int[] queries = new int[q];

        for (int i = 0; i < q; i++) 
        {
            
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
            
        }

        int[] result = circularArrayRotation(a, k, queries);
        

        for (int i = 0; i < result.length; i++)
        {
            
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1)
            {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
        
        
    }
}
