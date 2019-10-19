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

    
    static String dayOfProgrammer(int year)
    {
        String day=new String("");
        
        if(year>=1700&&year<=1917)
        {
        
            if(year%4==0)
            {
                day="12.09."+year;
            }
            
            else
            {
                day="13.09."+year;
            }
            
        }
        
        else if(year>1918&&year<=2700)
        {
        
            if((year%400==0)||(year%4==0&&year%100!=0))
            {
                day="12.09."+year;
            }
            
            else
            {
               day="13.09."+year;
            }
            
        }
        
        else if(year==1918)
        {
            day="26.09."+year;
        }


        return day;
    }
    


    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        

        int year = Integer.parseInt(bufferedReader.readLine().trim());
        

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();
        

        bufferedReader.close();
        bufferedWriter.close();
        
        
    }
}
