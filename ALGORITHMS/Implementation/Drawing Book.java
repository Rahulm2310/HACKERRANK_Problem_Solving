import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {


    static int pageCount(int n, int p) {
        
        
         int pagecount=0;
         
         if(p>(n/2))
         {
         
             if(n%2==0)
             {
             
                 if(p%2==0)
                 {
                 
                     pagecount=(n-p)/2;
                     
                 }
                 
                 else if(p%2!=0)
                 {
                 
                     pagecount=((n-p)/2)+1;
                     
                 }
                 
             }
             
             else if(n%2!=0)
             {
                
                     pagecount=(n-p)/2;
                 
             }
             
         }

         else if(p<=(n/2))
         {
         
             pagecount=p/2;
             
         }
         

    return pagecount;
    
    }

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws IOException
    {
    
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));


        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");


        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");


        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();


        scanner.close();
    }
    
}
