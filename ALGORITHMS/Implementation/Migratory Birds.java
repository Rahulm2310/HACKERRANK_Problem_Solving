import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    
    static int migratoryBirds(List<Integer> arr)
    {
        
        int count[]={0,0,0,0,0};
        int max=0;
        int k;
        
        
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<arr.size();j++)
            {
            
                if(arr.get(j)==(i+1))
                {
                    count[i]++;
                }
                
            }
            
            if(max<count[i])
            {
                max=count[i];
            }
            
            
        }

        for(k=0;k<5;k++)
        {
        
            if(max==count[k])
            {
               break; 
            }
            
        }
        
        return k+1;
    }



    public static void main(String[] args) throws IOException 
    {
    
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));


        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());


        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());


        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();


        bufferedReader.close();
        bufferedWriter.close();
        
        
    }
}
