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

class Result {

    

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    
 
    int countone;
    int counttwo;
    int count=0;

    for(int i=1;i<1000;i++)
    {
        counttwo=0;
        countone=0;
        
        for(int j=0;j<a.size();j++)
        {
        
            if(i%a.get(j)==0)
            {
                
                countone++;
            }
            
        }

        for(int k=0;k<b.size();k++)
        {
        
            if(b.get(k)%i==0)
            {
                
                counttwo++;
            }
            
        }

        if((countone==a.size())&&(counttwo==b.size()))
        {
        
            count++;
            
        }
        
    }
    

    return count;

    }

}

public class Solution
{
    public static void main(String[] args) throws IOException {
    
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);
        

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());


        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
            

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();
        

        bufferedReader.close();
        bufferedWriter.close();
        
    }
}
