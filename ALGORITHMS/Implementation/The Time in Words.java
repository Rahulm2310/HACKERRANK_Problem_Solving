import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

   
    static String timeInWords(int h, int m) {
        String s=new String("");

        String nums[] = {  "zero","one", "two", "three", "four", 
                            "five", "six", "seven", "eight", "nine", 
                            "ten", "eleven", "twelve", "thirteen", 
                            "fourteen", "fifteen", "sixteen", "seventeen", 
                            "eighteen", "nineteen", "twenty", "twenty one", 
                            "twenty two", "twenty three", "twenty four", 
                            "twenty five", "twenty six", "twenty seven", 
                            "twenty eight", "twenty nine", 
                        }; 
        if(m==0)
        {
            s=nums[h]+" o' clock";
        }

        else if(m>=1&&m<=30)
        {
            if(m==15)
            {
                s="quarter past "+nums[h];

            }

            else if(m==30)
            {
                s="half past "+nums[h];
            }

            else if(m==1){
                s=nums[m]+" minute past "+nums[h];
            }

            else{
                s=nums[m]+" minutes past "+nums[h];
            }
        }

        else if(m>30)
        {
            if(m==45)
            {
                s="quarter to "+nums[h+1];
            }

            else if(m==59)
            {
                s="one minute to "+nums[h+1];
            }

            else{
                s=nums[60-m]+" minutes to "+nums[h+1];
            }
        }
        return s;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
